package com.cruitment.service;

import java.util.List;


import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;

public interface CandidateService {

    EasyUIDataGridResult getcandidateList(Integer page, Integer rows);

    List<Candidate> getAllcandidateList();

    RecruitmentResult creatcandidate(Candidate candidate,String username,String password,String mail);

    RecruitmentResult getcandidateById(String candidateid);

    RecruitmentResult deletecandidateById(String candidateid);

    RecruitmentResult updatecandidateById(Candidate candidate, String candidateid);

}
