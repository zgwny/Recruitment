package com.recruitment.user.service;

import javax.servlet.http.HttpServletRequest;

import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.User;

public interface UserService {
    Boolean updateUser(String oldPassword,String password,HttpServletRequest request);
}
