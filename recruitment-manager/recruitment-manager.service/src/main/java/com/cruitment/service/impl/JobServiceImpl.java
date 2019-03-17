package com.cruitment.service.impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cruitment.service.CompanyService;
import com.cruitment.service.JobService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruitment.mapper.JobDescriptionMapper;
import com.recruitment.mapper.JobMapper;
import com.recruitment.pojo.Company;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.Job;
import com.recruitment.pojo.JobDescription;
import com.recruitment.pojo.JobDescriptionExample;
import com.recruitment.pojo.JobExample;
import com.recruitment.pojo.JobExample.Criteria;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.utils.DictionaryUtilsImpl;
import com.recruitment.utils.IdGenUtils;

@Service
public class JobServiceImpl implements JobService {

    @Autowired
    private JobMapper mapper;
    @Autowired
    private CompanyService CompanyService;
    @Autowired
    private JobDescriptionMapper descMapper;
    @Autowired
    DictionaryUtilsImpl dictionaryUtils = DictionaryUtilsImpl.getInstance();
    @Override
    public EasyUIDataGridResult getjobList(Integer page, Integer rows) {
        
        PageHelper.startPage(page, rows);
        JobExample example = new JobExample();
        List<Job> lists =mapper.selectByExample(example);
        for(Job job:lists){
            job.setSalary(dictionaryUtils.dictionary(job.getSalary(),"salary").getItemvalue());
            job.setEducation(dictionaryUtils.dictionary(job.getEducation(),"education").getItemvalue());
            job.setExperience(dictionaryUtils.dictionary(job.getExperience(),"experience").getItemvalue());
        }
        PageInfo<Job> pageInfo = new PageInfo<>(lists);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        result.setRows(lists);
        result.setTotal(pageInfo.getTotal());    
        return result;
    }

    @Override
    public List<Job> getAlljobList() {
        JobExample example = new JobExample();
        List<Job> lists =mapper.selectByExample(example);
        return lists;
    }

    @Override
    public RecruitmentResult creatjob(Job job,String requirement,String description) {
        
        String jobid = IdGenUtils.getId();
        job.setJobid(jobid);
        Company company = (Company)CompanyService.getCompanyById(job.getCompanyid()).getData();
        job.setCompanyname(company.getName());        
        mapper.insert(job);      
        JobDescription jobDescription = new JobDescription();
        jobDescription.setJobid(jobid);
        jobDescription.setRequirement(requirement);
        jobDescription.setDescription(description);
        descMapper.insert(jobDescription);
        return RecruitmentResult.ok() ;
    }

    @Override
    public RecruitmentResult getjobDescById(String jobid) {
        JobDescriptionExample jobDescriptionExample = new JobDescriptionExample();
        com.recruitment.pojo.JobDescriptionExample.Criteria descCriteria =jobDescriptionExample.createCriteria();
        descCriteria.andJobidEqualTo(jobid);
        List<JobDescription> lists =descMapper.selectByExample(jobDescriptionExample);
        JobDescription description = lists.get(0);
        return RecruitmentResult.ok(description);
    }

    @Override
    public RecruitmentResult updatejobById(Job job, String jobid, String require,String description) {
        JobExample example = new JobExample();
        Criteria criteria = example.createCriteria();
        criteria.andJobidEqualTo(jobid);
        mapper.updateByExample(job, example);
        JobDescription jobDescription = new JobDescription();
        jobDescription.setJobid(jobid);
        jobDescription.setRequirement(require);
        jobDescription.setDescription(description);
        JobDescriptionExample jobDescriptionExample = new JobDescriptionExample();
        com.recruitment.pojo.JobDescriptionExample.Criteria descCriteria =jobDescriptionExample.createCriteria();
        descCriteria.andJobidEqualTo(jobid);
        descMapper.updateByExampleWithBLOBs(jobDescription, jobDescriptionExample);
        return RecruitmentResult.ok();
    }

    @Override
    public RecruitmentResult deletejobById(String jobid) {
        JobExample example = new JobExample();
        Criteria criteria = example.createCriteria();
        criteria.andJobidEqualTo(jobid);
        mapper.deleteByExample(example);
        JobDescriptionExample jobDescriptionExample = new JobDescriptionExample();
        com.recruitment.pojo.JobDescriptionExample.Criteria descCriteria =jobDescriptionExample.createCriteria();
        descCriteria.andJobidEqualTo(jobid);
        descMapper.deleteByExample(jobDescriptionExample);
        return RecruitmentResult.ok();
    }

    @Override
    public RecruitmentResult queryDescById(String jobid) {
        JobDescriptionExample jobDescriptionExample = new JobDescriptionExample();
        com.recruitment.pojo.JobDescriptionExample.Criteria descCriteria =jobDescriptionExample.createCriteria();
        descCriteria.andJobidEqualTo(jobid);
        List<JobDescription> lists =descMapper.selectByExampleWithBLOBs(jobDescriptionExample);
        JobDescription jobDescription = lists.get(0);
        return RecruitmentResult.ok(jobDescription);
    }

}
