package com.recruitment.company.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.recruitment.pojo.Company;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;

public interface CompanyService {
    
    EasyUIDataGridResult getCompanyList(int page, int rows,HttpServletRequest request);
    
    RecruitmentResult creatCompany(Company company);
    
    RecruitmentResult getCompanyById(String companyid);
    
    RecruitmentResult updateCompanyById(Company company,String companyid);
    
    RecruitmentResult deleteCompanyById(String companyid);
    
    List<Company> getAllCompanyList();
    
    
}
