package com.recruitment.hr.controller;



import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.recruitment.hr.service.CandidateService;
import com.recruitment.pojo.Delivery;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;
@Controller
@RequestMapping("/candidate")
public class CandidateController {

    @Autowired
    private CandidateService candidateService;
    
    @RequestMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult list(Integer page, Integer rows,HttpServletRequest request){
        
        EasyUIDataGridResult result = candidateService.getDeliveryList(page, rows, request);
        
        return result;
        
    }
    
   
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    @ResponseBody
    public RecruitmentResult add(Delivery delivery){
        
        RecruitmentResult result = candidateService.creatDelivery(delivery);
        
        return result;
    }
    
    @RequestMapping("/query/{candidateid}")
    @ResponseBody
    public RecruitmentResult list(@PathVariable Integer deliveryid){
        
        RecruitmentResult result = candidateService.getDeliveryById(deliveryid);
        
        return result;
        
    }
    
    @RequestMapping("/update")
    @ResponseBody
    public RecruitmentResult list(Delivery delivery){
        
        RecruitmentResult result = candidateService.updateDeliveryById(delivery,delivery.getDeliveryid());
        
        return result;
        
    }
    
    @RequestMapping("/delete/{candidateid}")
    @ResponseBody
    public RecruitmentResult delete(@PathVariable Integer deliveryid){
        
        RecruitmentResult result = candidateService.deleteDeliveryById(deliveryid);
        
        return result;
        
    }
    
    
}

