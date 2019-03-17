package com.recruitment.company.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.Job;
import com.recruitment.pojo.RecruitmentResult;

public interface JobService {

    EasyUIDataGridResult getjobList(Integer page, Integer rows,HttpServletRequest request);

    List<Job> getAlljobList();

    RecruitmentResult creatjob(Job job,String require,String description,HttpServletRequest request);

    RecruitmentResult getjobDescById(String jobid);

    RecruitmentResult updatejobById(Job job,String jobid,String require,String description);

    RecruitmentResult deletejobById(String jobid);

    RecruitmentResult queryDescById(String jobid);

}
