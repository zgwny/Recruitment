package com.recruitment.sso.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.recruitment.pojo.RecruitmentResult;

public interface LoginService {
    RecruitmentResult login(String username,String password,HttpServletRequest request,HttpServletResponse response);
    
    RecruitmentResult getUserByToken(String token);
}
