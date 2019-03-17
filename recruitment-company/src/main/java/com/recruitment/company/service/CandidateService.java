package com.recruitment.company.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;

public interface CandidateService {

    EasyUIDataGridResult getcandidateList(Integer page, Integer rows,HttpServletRequest request);

    List<Candidate> getAllcandidateList();

    RecruitmentResult creatcandidate(Candidate candidate);

    RecruitmentResult getcandidateById(String candidateid);

    RecruitmentResult deletecandidateById(String candidateid);

    RecruitmentResult updatecandidateById(Candidate candidate, String candidateid);

}
