package com.cruitment.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.cruitment.service.HRService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruitment.mapper.CompanyMapper;
import com.recruitment.mapper.HrMapper;
import com.recruitment.mapper.UserMapper;
import com.recruitment.pojo.Company;
import com.recruitment.pojo.CompanyExample;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.Hr;
import com.recruitment.pojo.HrExample;
import com.recruitment.pojo.HrExample.Criteria;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.User;
import com.recruitment.utils.DictionaryUtilsImpl;
import com.recruitment.utils.IdGenUtils;

@Service
public class HRServiceImpl implements HRService {

    @Autowired
    private HrMapper mapper;
    @Autowired
    private CompanyMapper companyMapper;
    @Autowired
    DictionaryUtilsImpl dictionaryUtils = DictionaryUtilsImpl.getInstance();
    @Autowired
    private UserMapper userMapper;
    /**
     * 查询hr列表
     */
    @Override
    public EasyUIDataGridResult getHrList(int page,int rows) {
        PageHelper.startPage(page, rows);
        HrExample example = new HrExample();
        List<Hr> lists = mapper.selectByExample(example);
        for(Hr hr:lists){
            hr.setStatus(dictionaryUtils.dictionary(hr.getStatus(),"status").getItemvalue());
        }
        
        PageInfo<Hr> pageInfo = new PageInfo<>(lists);
        
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        
        result.setTotal(pageInfo.getTotal());
        
        result.setRows(lists);
        
        
        return result;
    
    }
    
    /**
     * 新建Hr
     */
    @Override
    public RecruitmentResult create(Hr hr,String username,String password,String mail) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()) );
        user.setMail(mail);
        user.setUserid(IdGenUtils.getId());
        user.setRole(3);
        hr.setHrid(IdGenUtils.getId());
        userMapper.insert(user);
        mapper.insert(hr);
        return RecruitmentResult.ok();
    }
    
    /**
     * 根据id获取Hr
     */
    @Override
    public RecruitmentResult getHrById(String hrid) {
        HrExample example = new HrExample();
        Criteria criteria =example.createCriteria();
        criteria.andHridEqualTo(hrid);
        List<Hr> lists = mapper.selectByExample(example);
        Hr hr = lists.get(0);
        hr.setStatus(dictionaryUtils.dictionary(hr.getStatus(),"status").getItemvalue());
        return RecruitmentResult.ok(hr);
    }
    /**
     * 根据id更新Hr
     */
    @Override
    public RecruitmentResult updateHrById(Hr hr, String hrid) {
        CompanyExample companyExample = new CompanyExample();
        com.recruitment.pojo.CompanyExample.Criteria companyCriteria = companyExample.createCriteria();
        companyCriteria.andCompanyidEqualTo(hr.getCompanyid());
        Company company =companyMapper.selectByExample(companyExample).get(0);
        hr.setCompanyname(company.getName());
        HrExample example = new HrExample();
        Criteria criteria =example.createCriteria();
        criteria.andHridEqualTo(hrid);
        mapper.updateByExample(hr, example);
        return RecruitmentResult.ok();
    }
    /**
     * 根据id删除Hr
     */
    @Override
    public RecruitmentResult deleteHrById(String hrid) {
        HrExample example = new HrExample();
        Criteria criteria =example.createCriteria();
        criteria.andHridEqualTo(hrid);
        mapper.deleteByExample(example);
        return RecruitmentResult.ok();
    }

}
