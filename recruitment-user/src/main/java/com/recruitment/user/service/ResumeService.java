package com.recruitment.user.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.Dictionary;
import com.recruitment.pojo.EducationExperience;
import com.recruitment.pojo.Introduce;
import com.recruitment.pojo.ProjectExperience;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.Resume;
import com.recruitment.pojo.RewardExperience;
import com.recruitment.pojo.Skill;
import com.recruitment.pojo.Want;
import com.recruitment.pojo.WorkExperience;

public interface ResumeService {
    Resume getResumeById(String userid);
    Want getWant(String wantid);
    Skill getSkill(String skillid);
    RewardExperience getRewardExperience(String rewardid);
    ProjectExperience getProjectExperience(String projectid);
    EducationExperience getEducationExperience(String educationid);
    RecruitmentResult creatcandidate(Candidate candidate);
    Candidate getCandidateById(String candidateid);
    RecruitmentResult editcandidate(Candidate candidate);
    List<Dictionary> getDictionaryByGroupValue(String groupValue);
    RecruitmentResult creatWant(Want want,HttpServletRequest request);
    Want getWantById(String wantid);
    RecruitmentResult createResumeById(String candidateid);
    RecruitmentResult editWant(Want want);
    RecruitmentResult addWorkExperience(WorkExperience work,HttpServletRequest request);
    RecruitmentResult editWorkExperience(WorkExperience work,HttpServletRequest request);
    List<WorkExperience> getWorksById(HttpServletRequest request);
    RecruitmentResult addProjectExperience(ProjectExperience projectExperience,HttpServletRequest request);
    RecruitmentResult editProjectExperience(ProjectExperience projectExperience,HttpServletRequest request);
    List<ProjectExperience> getProjectById(HttpServletRequest request);
    
    RecruitmentResult addEducationExperience(EducationExperience projectExperience,HttpServletRequest request);
    RecruitmentResult editEducationExperience(EducationExperience projectExperience,HttpServletRequest request);
    List<EducationExperience> getEducationById(HttpServletRequest request);
    
    RecruitmentResult addSkill(Skill skill,HttpServletRequest request);
    RecruitmentResult editSkill(Skill skill,HttpServletRequest request);
    List<Skill> getSkillById(HttpServletRequest request);
    
    RecruitmentResult addReward(RewardExperience rewardExperience,HttpServletRequest request);
    RecruitmentResult editReward(RewardExperience rewardExperience,HttpServletRequest request);
    List<RewardExperience> getRewardById(HttpServletRequest request);
    
    RecruitmentResult addIntroduce(Introduce introduce,HttpServletRequest request);
    RecruitmentResult editIntroduce(Introduce introduce,HttpServletRequest request);
    Introduce getIntroduceById(HttpServletRequest request);
    Boolean deleteWorkExperience(Integer workExperienceId);
    Boolean deleteProject(Integer id);
    Boolean deleteSkill(Integer id);
    Boolean deleteReward(Integer id);
    Boolean deleteEducation(Integer id);
    
    
}

