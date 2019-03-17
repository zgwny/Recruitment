package com.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cruitment.service.CompanyService;
import com.cruitment.service.HRService;
import com.recruitment.pojo.Company;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.Hr;
import com.recruitment.pojo.RecruitmentResult;

@Controller
@RequestMapping("/HR")
public class HrController {

    @Autowired
    private HRService hrService;
    @Autowired
    private CompanyService companyService;
    
    @RequestMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult list(Integer page,Integer rows){
        
        EasyUIDataGridResult result = hrService.getHrList(page, rows);
        
        return result;
    }
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    @ResponseBody
    public RecruitmentResult create(Hr hr,String username,String password,String mail){
        Company company = (Company)companyService.getCompanyById(hr.getCompanyid()).getData();
        hr.setCompanyname(company.getName());
        RecruitmentResult result = hrService.create(hr,username,password,mail);
        
        
        return result;
    }
    
    @RequestMapping("/query/{hrid}")
    @ResponseBody
    public RecruitmentResult list(@PathVariable String hrid){
        
        RecruitmentResult result = hrService.getHrById(hrid);
        
        return result;
        
    }
    @RequestMapping("/update")
    @ResponseBody
    public RecruitmentResult update(Hr hr){
        
        RecruitmentResult result = hrService.updateHrById(hr,hr.getHrid());
        
        return result;
        
    }
    @RequestMapping("/delete/{hrid}")
    @ResponseBody
    public RecruitmentResult delete(@PathVariable String hrid){
        
        RecruitmentResult result = hrService.deleteHrById(hrid);
        
        return result;
        
    }
}
