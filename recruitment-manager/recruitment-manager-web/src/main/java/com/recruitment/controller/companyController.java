package com.recruitment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.cruitment.service.CompanyService;
import com.recruitment.pojo.Company;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.utils.JsonUtils;

@Controller
@RequestMapping("/company")
public class companyController {

    @Autowired
    private CompanyService companyService;
    
    @RequestMapping("/list")
    @ResponseBody
    public EasyUIDataGridResult list(Integer page, Integer rows){
        
        EasyUIDataGridResult result = companyService.getCompanyList(page, rows);
        
        return result;
        
    }
    
    @RequestMapping("/allList")
    @ResponseBody
    public String getAllList(){
        
        List<Company> lists = companyService.getAllCompanyList();
        String json = JsonUtils.objectToJson(lists);
        
        return json;
        
    }
    
    @RequestMapping(value="/save",method=RequestMethod.POST)
    @ResponseBody
    public RecruitmentResult add(Company company,String username,String password,String email){
        
        RecruitmentResult result = companyService.creatCompany(company,username,password,email);
        
        return result;
    }
    
    @RequestMapping("/query/{companyid}")
    @ResponseBody
    public RecruitmentResult list(@PathVariable String companyid){
        
        RecruitmentResult result = companyService.getCompanyById(companyid);
        
        return result;
        
    }
    
    @RequestMapping("/update")
    @ResponseBody
    public RecruitmentResult list(Company company){
        
        RecruitmentResult result = companyService.updateCompanyById(company,company.getCompanyid());
        
        return result;
        
    }
    
    @RequestMapping("/delete/{companyid}")
    @ResponseBody
    public RecruitmentResult delete(@PathVariable String companyid){
        
        RecruitmentResult result = companyService.deleteCompanyById(companyid);
        
        return result;
        
    }
    
    
}
