package com.recruitment.sso.service;

import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.User;

public interface RegisterService {

    RecruitmentResult checkData(String param, int type);
    RecruitmentResult register(User user);
    
}
