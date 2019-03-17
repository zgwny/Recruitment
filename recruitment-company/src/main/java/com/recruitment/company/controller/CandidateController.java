package com.recruitment.company.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.recruitment.company.service.CandidateService;
import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.utils.JsonUtils;
@Controller
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;
    
    @RequestMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult list(Integer page, Integer rows,HttpServletRequest request){
        
        EasyUIDataGridResult result = candidateService.getcandidateList(page, rows, request);
        
        return result;
        
    }
    
    @RequestMapping("/allList")
    @ResponseBody
    public String getAllList(){
        
        List<Candidate> lists = candidateService.getAllcandidateList();
        String json = JsonUtils.objectToJson(lists);
        
        return json;
        
    }
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    @ResponseBody
    public RecruitmentResult add(Candidate candidate){
        
        RecruitmentResult result = candidateService.creatcandidate(candidate);
        
        return result;
    }
    
    @RequestMapping("/query/{candidateid}")
    @ResponseBody
    public RecruitmentResult list(@PathVariable String candidateid){
        
        RecruitmentResult result = candidateService.getcandidateById(candidateid);
        
        return result;
        
    }
    
    @RequestMapping("/update")
    @ResponseBody
    public RecruitmentResult list(Candidate candidate){
        
        RecruitmentResult result = candidateService.updatecandidateById(candidate,candidate.getCandidateid());
        
        return result;
        
    }
    
    @RequestMapping("/delete/{candidateid}")
    @ResponseBody
    public RecruitmentResult delete(@PathVariable String candidateid){
        
        RecruitmentResult result = candidateService.deletecandidateById(candidateid);
        
        return result;
        
    }
    
    
}
