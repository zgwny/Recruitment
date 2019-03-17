package com.cruitment.service;

import java.util.List;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.Hr;
import com.recruitment.pojo.RecruitmentResult;

public interface HRService {

    EasyUIDataGridResult getHrList(int page,int rows);
    RecruitmentResult create(Hr hr,String username,String password,String mail);
    RecruitmentResult getHrById(String hrid);
    RecruitmentResult updateHrById(Hr hr, String hrid);
    RecruitmentResult deleteHrById(String hrid);
}
