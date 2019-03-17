package com.recruitment.user.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import com.recruitment.mapper.UserMapper;
import com.recruitment.pojo.User;
import com.recruitment.pojo.UserExample;
import com.recruitment.pojo.UserExample.Criteria;
import com.recruitment.user.service.JobService;
import com.recruitment.user.service.UserService;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private JobService jobService;
    @Override
    public Boolean updateUser(String oldPassword,String password,HttpServletRequest request) {
        String userid = jobService.getUser(request).getUserid();
        UserExample example = new UserExample();
        Criteria criteria = example.createCriteria();
        criteria.andUseridEqualTo(userid);
        List<User> list = userMapper.selectByExample(example);
        User oldUser = list.get(0);
        if(oldUser.getPassword().equals(DigestUtils.md5DigestAsHex(oldPassword.getBytes()) )){
            oldUser.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()));
            userMapper.updateByExample(oldUser, example);
            return true;
        }else{
            return false;
        }  
    }

}
