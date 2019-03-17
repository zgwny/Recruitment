package com.recruitment.user.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.recruitment.pojo.Company;
import com.recruitment.pojo.Job;
import com.recruitment.pojo.JobDescription;
import com.recruitment.user.service.JobService;



@Controller
public class JobController {

    @Autowired  
    private JobService jobService;
    

    @RequestMapping("/see_job")
    public String  queryDesc(String jobid ,Model mod){
        
        Job job = jobService.getjobById(jobid);
        JobDescription description =jobService.queryDescById(jobid);
        Company company = jobService.getCompanyByJobId(jobid);
        mod.addAttribute("job", job);
        mod.addAttribute("description", description);
        mod.addAttribute("company", company);
        return "see_job";
        
    }
    @RequestMapping("/job/delivery")
    public String  queryDesc(String jobid,HttpServletRequest request){
        jobService.delivery(jobid,request);
        
        return "redirect:/";
        
    }
    
}