package com.cruitment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.cruitment.service.CompanyService;
import com.recruitment.utils.DictionaryUtilsImpl;
import com.recruitment.utils.IdGenUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruitment.mapper.CompanyMapper;
import com.recruitment.mapper.UserMapper;
import com.recruitment.pojo.Company;
import com.recruitment.pojo.CompanyExample;
import com.recruitment.pojo.CompanyExample.Criteria;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.User;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    DictionaryUtilsImpl dictionaryUtils = DictionaryUtilsImpl.getInstance();
    @Autowired
    private UserMapper userMapper;
    
    /**
     * 分页查询company详情
     */
    @Override
    public EasyUIDataGridResult getCompanyList(int page, int rows) {
        
        PageHelper.startPage(page, rows);
        
        CompanyExample example = new CompanyExample();
         
        List<Company> lists = companyMapper.selectByExampleWithBLOBs(example);
        
        for(Company company: lists){
            company.setScale( dictionaryUtils.dictionary(company.getScale(),"scale").getItemvalue());
            company.setFinancing(dictionaryUtils.dictionary(company.getFinancing(),"financing").getItemvalue());
            company.setDirection(dictionaryUtils.dictionary(company.getDirection(),"direction").getItemvalue());
        }
        
        PageInfo<Company> pageInfo = new PageInfo<>(lists);
        
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        
        result.setTotal(pageInfo.getTotal());
        
        result.setRows(lists);
        
        
        return result;
    }
    /**
     * 新建公司
     */
    @Override
    public RecruitmentResult creatCompany(Company company, String username,String password,String email) {
        
        User user = new User();
        user.setUsername(username);
        String companyid = IdGenUtils.getId();
        user.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()) );
        user.setMail(email);
        user.setUserid(companyid);
        user.setRole(2);
        
        userMapper.insert(user);
        company.setCompanyid(companyid);
        companyMapper.insert(company);
        
        return RecruitmentResult.ok();
    }
    
    
    /**
     * 根据id查询公司
     */
    @Override
    public RecruitmentResult getCompanyById(String companyid) {
        CompanyExample example = new CompanyExample();
        Criteria criteria =example.createCriteria();
        criteria.andCompanyidEqualTo(companyid);
        List<Company> list=companyMapper.selectByExampleWithBLOBs(example);
        Company company = list.get(0);
        company.setScale( dictionaryUtils.dictionary(company.getScale(),"scale").getItemvalue());
        company.setFinancing(dictionaryUtils.dictionary(company.getFinancing(),"financing").getItemvalue());
        company.setDirection(dictionaryUtils.dictionary(company.getDirection(),"direction").getItemvalue());
        return RecruitmentResult.ok(company);
    }
    /**
     *   根据企业id修改企业
     */
  
    @Override
    public RecruitmentResult updateCompanyById(Company company,String companyid) {
        CompanyExample example = new CompanyExample();
        Criteria criteria =example.createCriteria();
        criteria.andCompanyidEqualTo(companyid);
        companyMapper.updateByExampleWithBLOBs(company, example);
        return RecruitmentResult.ok();
    }
    /**
     * 根据企业id删除企业
     */
    @Override
    public RecruitmentResult deleteCompanyById(String companyid) {
        CompanyExample example = new CompanyExample();
        Criteria criteria =example.createCriteria();
        criteria.andCompanyidEqualTo(companyid);
        companyMapper.deleteByExample(example);
        return RecruitmentResult.ok();
    }
    /**
     * 获取所有的公司
     */
    @Override
    public List<Company> getAllCompanyList() {
        CompanyExample example = new CompanyExample();
        
        List<Company> lists = companyMapper.selectByExampleWithBLOBs(example);
        
        return lists;
    }

   
}
