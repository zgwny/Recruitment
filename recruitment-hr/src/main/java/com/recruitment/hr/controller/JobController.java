package com.recruitment.hr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.recruitment.hr.service.JobService;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.Job;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.utils.JsonUtils;

@Controller
@RequestMapping("/job")
public class JobController {

    @Autowired
    private JobService jobService;
    
    @RequestMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult list(Integer page, Integer rows,HttpServletRequest request){
        
        EasyUIDataGridResult result = jobService.getjobList(page, rows, request);
        
        return result;
        
    }
    
    @RequestMapping("/allList")
    @ResponseBody
    public String getAllList(){
        
        List<Job> lists = jobService.getAlljobList();
        String json = JsonUtils.objectToJson(lists);
        
        return json;
        
    }
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    @ResponseBody
    public RecruitmentResult add(Job job,String requirement,String description,HttpServletRequest request){
        
        RecruitmentResult result = jobService.creatjob(job,requirement,description,request);
        
        return result;
    }
    

    
    @RequestMapping(value="/update",method=RequestMethod.POST)
    @ResponseBody
    public RecruitmentResult list(Job job,  String requirement,String description){
        
        RecruitmentResult result = jobService.updatejobById(job,job.getJobid(),requirement,description);
        
        return result;
        
    }
    
    @RequestMapping("/delete/{jobid}")
    @ResponseBody
    public RecruitmentResult delete(@PathVariable String jobid){
        
        RecruitmentResult result = jobService.deletejobById(jobid);
        
        return result;
        
    }

    @RequestMapping("/desc/query/{jobid}")
    @ResponseBody
    public RecruitmentResult queryDesc(@PathVariable String jobid){
        
        RecruitmentResult result = jobService.queryDescById(jobid);
        
        return result;
        
    }
    
}