package com.recruitment.user.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import com.recruitment.pojo.Company;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.Job;
import com.recruitment.pojo.JobDescription;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.User;

public interface JobService {


    List<Job> getAlljobList();


    JobDescription queryDescById(String jobid);
    
    Job getjobById(String id);
    
    Company getCompanyByJobId(String id);
    
    RecruitmentResult delivery(String id,HttpServletRequest request);
    User getUser(HttpServletRequest request);

}
