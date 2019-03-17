package com.cruitment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.cruitment.service.CandidateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruitment.mapper.CandidateMapper;
import com.recruitment.mapper.UserMapper;
import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.CandidateExample;
import com.recruitment.pojo.CandidateExample.Criteria;
import com.recruitment.utils.DictionaryUtilsImpl;
import com.recruitment.utils.IdGenUtils;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.User;
@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private CandidateMapper mapper;
    @Autowired
    DictionaryUtilsImpl dictionaryUtils = DictionaryUtilsImpl.getInstance();
    @Autowired
    private UserMapper userMapper;
    /**
     * 分页查询求职者
     */
    @Override
    public EasyUIDataGridResult getcandidateList(Integer page, Integer rows) {
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
    public RecruitmentResult creatcandidate(Candidate candidate,String username,String password,String mail) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(DigestUtils.md5DigestAsHex(password.getBytes()) );
        user.setMail(mail);
        String candidateid= IdGenUtils.getId();
        user.setUserid(candidateid);
        user.setRole(4);
        userMapper.insert(user);
        candidate.setCandidateid(candidateid);
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
