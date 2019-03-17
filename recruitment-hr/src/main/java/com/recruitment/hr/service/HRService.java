package com.recruitment.hr.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.Hr;
import com.recruitment.pojo.RecruitmentResult;

public interface HRService {

    EasyUIDataGridResult getHrList(int page,int rows,HttpServletRequest request);
    RecruitmentResult create(Hr hr,HttpServletRequest request);
    RecruitmentResult getHrById(String hrid);
    RecruitmentResult updateHrById(Hr hr, String hrid);
    RecruitmentResult deleteHrById(String hrid);
}
