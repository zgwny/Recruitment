package com.recruitment.sso.service.impl;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.recruitment.mapper.UserMapper;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.User;
import com.recruitment.pojo.UserExample;
import com.recruitment.pojo.UserExample.Criteria;
import com.recruitment.sso.component.JedisClient;
import com.recruitment.sso.service.LoginService;
import com.recruitment.utils.CookieUtils;
import com.recruitment.utils.JsonUtils;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserMapper mapper;
    @Autowired
    private JedisClient jedisClient;
    
    @Value("${REDIS_SESSION_KEY}")
    private String REDIS_SESSION_KEY;
    @Value("${REDIS_SESSION_EXPIRE}")
    private Integer SESSION_EXPIRE;

    
    @Override
    public RecruitmentResult login(String username, String password,HttpServletRequest request,HttpServletResponse response) {
     
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> list = mapper.selectByExample(example);
        if (list == null || list.isEmpty()) {
            return RecruitmentResult.build(400, "用户名或密码错误");
            
        }
        User user = list.get(0);
        if(!user.getPassword().equals(DigestUtils.md5DigestAsHex(password.getBytes()) )){
            
            return RecruitmentResult.build(400, "用户名或密码错误");
        }
        //登录成功
        //生成token
        String token = UUID.randomUUID().toString();
        //把用户信息写入redis
        //key:REDIS_SESSION:{TOKEN}
        //value:user转json
        user.setPassword(null);
        jedisClient.set(REDIS_SESSION_KEY + ":" + token, JsonUtils.objectToJson(user));
        //设置session的过期时间
        jedisClient.expire(REDIS_SESSION_KEY + ":" + token, SESSION_EXPIRE);
        if(user.getRole() == 2){
            CookieUtils.setCookie(request, response, "COMPANY_TOKEN", token); 
        }else if(user.getRole() == 3){
            CookieUtils.setCookie(request, response, "HR_TOKEN", token);
        }else if(user.getRole() == 4){
            CookieUtils.setCookie(request, response, "USER_TOKEN", token);
        }
        
        return RecruitmentResult.ok(user);

        
        
    }


    @Override
    public RecruitmentResult getUserByToken(String token) {
     // 根据token取用户信息
        String json = jedisClient.get(REDIS_SESSION_KEY + ":" + token);
        //判断是否查询到结果
        if (StringUtils.isBlank(json)) {
                return RecruitmentResult.build(400, "用户session已经过期");
        }
        //把json转换成java对象
        User user = JsonUtils.jsonToPojo(json, User.class);
        //更新session的过期时间
        jedisClient.expire(REDIS_SESSION_KEY + ":" + token, SESSION_EXPIRE);
        
        return RecruitmentResult.ok(user);
    }

}
