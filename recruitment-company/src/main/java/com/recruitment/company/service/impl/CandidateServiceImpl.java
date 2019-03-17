package com.recruitment.company.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruitment.company.service.CandidateService;
import com.recruitment.mapper.CandidateMapper;
import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.CandidateExample;
import com.recruitment.pojo.CandidateExample.Criteria;
import com.recruitment.utils.DictionaryUtilsImpl;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;
@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateMapper mapper;
    @Autowired
    DictionaryUtilsImpl dictionaryUtils = DictionaryUtilsImpl.getInstance();
    /**
     * 分页查询求职者
     */
    @Override
    public EasyUIDataGridResult getcandidateList(Integer page, Integer rows,HttpServletRequest request) {
        PageHelper.startPage(page, rows);
        CandidateExample example = new CandidateExample();
        List<Candidate> lists = mapper.selectByExample(example);
        for(Candidate candidate:lists){
            candidate.setSex(dictionaryUtils.dictionary(candidate.getSex(),"sex").getItemvalue());
        }
        
        PageInfo<Candidate> pageInfo = new PageInfo<>(lists);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        
        result.setTotal(pageInfo.getTotal());
        
        result.setRows(lists);
  
        return result;
    }
    /**
     * 查询全部求职者
     */
    @Override
    public List<Candidate> getAllcandidateList() {
        CandidateExample example = new CandidateExample();
        List<Candidate> lists = mapper.selectByExample(example);
        return lists;
    }
    /**
     * 新建求职者
     */
    @Override
    public RecruitmentResult creatcandidate(Candidate candidate) {
        mapper.insert(candidate);
        return RecruitmentResult.ok();
    }
    /**
     * 根据id查询求职者
     */

    @Override
    public RecruitmentResult getcandidateById(String candidateid) {
        CandidateExample example = new CandidateExample();
        Criteria criteria = example.createCriteria();
        criteria.andCandidateidEqualTo(candidateid);
        List<Candidate> lists = mapper.selectByExample(example);
        Candidate candidate = lists.get(0);
        return RecruitmentResult.ok(candidate);
    }
    /**
     * 删除求职者
     */
    @Override
    public RecruitmentResult deletecandidateById(String candidateid) {
        CandidateExample example = new CandidateExample();
        Criteria criteria = example.createCriteria();
        criteria.andCandidateidEqualTo(candidateid);
        mapper.deleteByExample(example);
        return RecruitmentResult.ok();
    }
    /**
     * 修改求职者
     */
    @Override
    public RecruitmentResult updatecandidateById(Candidate candidate, String candidateid) {
        CandidateExample example = new CandidateExample();
        Criteria criteria = example.createCriteria();
        criteria.andCandidateidEqualTo(candidateid);
        mapper.updateByExample(candidate, example);
        return RecruitmentResult.ok();
    }

}
