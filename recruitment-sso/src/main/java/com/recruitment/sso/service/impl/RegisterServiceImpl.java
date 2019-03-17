package com.recruitment.sso.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.recruitment.mapper.UserMapper;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.User;
import com.recruitment.pojo.UserExample;
import com.recruitment.pojo.UserExample.Criteria;
import com.recruitment.sso.service.RegisterService;
import com.recruitment.utils.IdGenUtils;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserMapper mapper;
    
    @Override
    public RecruitmentResult checkData(String param, int type) {
       
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        if(type == 1){
            criteria.andUsernameEqualTo(param);
        }else if(type == 2){
            criteria.andPasswordEqualTo(param);
        }else if(type == 3){
            criteria.andMailEqualTo(param);
        }
        
        List<User> lists = mapper.selectByExample(example);
        
        if (lists.isEmpty() || lists == null) {
            return RecruitmentResult.ok(true);
        }
        
        return RecruitmentResult.ok(false);
    }

    @Override
    public RecruitmentResult register(User user) {
     // 校验数据
        //校验用户名、密码不能为空
        if (StringUtils.isBlank(user.getUsername())
                        || StringUtils.isBlank(user.getPassword())) {
                return RecruitmentResult.build(400, "用户名或密码不能为空");
        }
        //校验数据是否重复
        //校验用户名
        RecruitmentResult result = checkData(user.getUsername(), 1);
        if (!(boolean) result.getData()) {
                return RecruitmentResult.build(400, "用户名重复");
        }
        //校验邮箱
        if (user.getMail() != null) {
                result = checkData(user.getMail(), 3);
                if (!(boolean) result.getData()) {
                        return RecruitmentResult.build(400, "邮箱重复");
                }
        }
        //企业注册
        user.setPassword(DigestUtils.md5DigestAsHex(user.getPassword().getBytes()) );
        user.setRole(4);
        user.setUserid(IdGenUtils.getId());
        mapper.insert(user);
        
        return RecruitmentResult.ok();


    } 
}
