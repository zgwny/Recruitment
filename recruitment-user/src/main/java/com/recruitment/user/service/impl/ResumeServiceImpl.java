package com.recruitment.user.service.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitment.mapper.CandidateMapper;
import com.recruitment.mapper.EducationExperienceMapper;
import com.recruitment.mapper.IntroduceMapper;
import com.recruitment.mapper.ProjectExperienceMapper;
import com.recruitment.mapper.ResumeMapper;
import com.recruitment.mapper.RewardExperienceMapper;
import com.recruitment.mapper.SkillMapper;
import com.recruitment.mapper.WantMapper;
import com.recruitment.mapper.WorkExperienceMapper;
import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.CandidateExample;
import com.recruitment.pojo.Dictionary;
import com.recruitment.pojo.EducationExperience;
import com.recruitment.pojo.EducationExperienceExample;
import com.recruitment.pojo.Introduce;
import com.recruitment.pojo.IntroduceExample;
import com.recruitment.pojo.ProjectExperience;
import com.recruitment.pojo.ProjectExperienceExample;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.Resume;
import com.recruitment.pojo.ResumeExample;
import com.recruitment.pojo.ResumeExample.Criteria;
import com.recruitment.pojo.RewardExperience;
import com.recruitment.pojo.RewardExperienceExample;
import com.recruitment.pojo.Skill;
import com.recruitment.pojo.SkillExample;
import com.recruitment.pojo.Want;
import com.recruitment.pojo.WantExample;
import com.recruitment.pojo.WorkExperience;
import com.recruitment.pojo.WorkExperienceExample;
import com.recruitment.user.service.JobService;
import com.recruitment.user.service.ResumeService;
import com.recruitment.utils.DictionaryUtilsImpl;
import com.recruitment.utils.IdGenUtils;

@Service
public class ResumeServiceImpl implements ResumeService {

    @Autowired
    private ResumeMapper resumeMapper;
    @Autowired
    private WantMapper wantMapper;
    @Autowired
    private SkillMapper skillMapper;
    @Autowired
    private EducationExperienceMapper educationMapper;
    @Autowired
    private ProjectExperienceMapper projectMapper;
    @Autowired
    private RewardExperienceMapper rewardMapper;
    @Autowired
    private CandidateMapper candidateMapper;
    @Autowired
    DictionaryUtilsImpl dictionaryUtils = DictionaryUtilsImpl.getInstance();
    @Autowired
    private WorkExperienceMapper workMapper;
    @Autowired
    private IntroduceMapper introduceMapper;
    @Autowired
    private JobService jobService;

    
    /**
     * 根据求职者id查询求职者简历,求职者id 与简历id相同
     * @param 求职者id
     * @return 简历对象
     */
    @Override
    public Resume getResumeById(String userid) {
        ResumeExample example = new ResumeExample();
        Criteria criteria = example.createCriteria();
        criteria.andResumeidEqualTo(userid);
        List<Resume> list= resumeMapper.selectByExample(example);
        if (!list.isEmpty() && list.size()>0) {
            Resume resume = list.get(0);
            return resume;
        }
        
        return null;
    }

    @Override
    public Want getWant(String wantid) {
        WantExample example = new WantExample();
        com.recruitment.pojo.WantExample.Criteria criteria = example.createCriteria();
        criteria.andWantcityEqualTo(wantid);
        List<Want> list = wantMapper.selectByExample(example);
        if (!list.isEmpty() && list.size()>0) {
            Want want = list.get(0);
            return want;
        }else {
            return null;
        }
        
    }

    @Override
    public Skill getSkill(String skillid) {
        SkillExample example = new SkillExample();
        com.recruitment.pojo.SkillExample.Criteria criteria = example.createCriteria();
        criteria.andSkillidEqualTo(skillid);
        List<Skill> list = skillMapper.selectByExample(example);
        if (!list.isEmpty() && list.size()>0) {
            Skill skill = list.get(0);
            return skill;
        }else {
            return null;
        }
    }

    @Override
    public RewardExperience getRewardExperience(String rewardid) {
        RewardExperienceExample example = new RewardExperienceExample();
        com.recruitment.pojo.RewardExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andRewardexperienceidEqualTo(rewardid);
        List<RewardExperience> list = rewardMapper.selectByExample(example);
        
        if (!list.isEmpty() && list.size()>0) {
            RewardExperience rewardExperience = list.get(0);
            return rewardExperience;
        }else {
            return null;
        }
    }

    @Override
    public ProjectExperience getProjectExperience(String projectid) {
        ProjectExperienceExample  example = new ProjectExperienceExample();
        com.recruitment.pojo.ProjectExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andProjectexpirenceidEqualTo(projectid);
        List<ProjectExperience> list = projectMapper.selectByExample(example);
        
        if (!list.isEmpty() && list.size()>0) {
            ProjectExperience projectExperience = list.get(0);
            return projectExperience;
        }else {
            return null;
        }
    }

    @Override
    public EducationExperience getEducationExperience(String educationid) {
        EducationExperienceExample  example = new EducationExperienceExample();
        com.recruitment.pojo.EducationExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andEducationidEqualTo(educationid);
        List<EducationExperience> list = educationMapper.selectByExample(example);
        
        if (!list.isEmpty() && list.size()>0) {
            EducationExperience educationExperience = list.get(0);
            return educationExperience;
        }else {
            return null;
        }
    }
    /**
     * 修改求职者信息
     * 如果不存在添加
     * 存在修改
     */
    @Override
    public RecruitmentResult creatcandidate(Candidate candidate) {
        candidateMapper.insert(candidate);
        return RecruitmentResult.ok();
    }
    /**
     * 通过id查询求职者信息
     */
    @Override
    public Candidate getCandidateById(String candidateid) {
        CandidateExample example = new CandidateExample();
        com.recruitment.pojo.CandidateExample.Criteria criteria = example.createCriteria();
        criteria.andCandidateidEqualTo(candidateid);
        List<Candidate> list = candidateMapper.selectByExample(example);
        if (!list.isEmpty() && list.size()>0) {
            for(Candidate candidate:list){
                candidate.setSex(dictionaryUtils.dictionary(candidate.getSex(), "sex").getItemvalue());
            }
            Candidate candidate = list.get(0);
            return candidate;
        }else {
            return null;
        }
    }
    /**
     * 编辑求职者信息
     */
    @Override
    public RecruitmentResult editcandidate(Candidate candidate) {
        CandidateExample example = new CandidateExample();
        if(candidate.getSex().equals("男")){
            candidate.setSex("1");
        }else if(candidate.getSex().equals("女")){
            candidate.setSex("2");
        }
        com.recruitment.pojo.CandidateExample.Criteria criteria = example.createCriteria();
        criteria.andCandidateidEqualTo(candidate.getCandidateid());
        candidateMapper.updateByExample(candidate, example);
        
        return RecruitmentResult.ok();
    }
    /**
     * 根据grouvalue查询所有的数据字典
     */
    @Override
    public List<Dictionary> getDictionaryByGroupValue(String groupValue) {
        List<Dictionary> dictionaries = dictionaryUtils.dictionaries(groupValue);
        return dictionaries;
    }
    /**
     * 创建新的求职期望
     */
    @Override
    public RecruitmentResult creatWant(Want want,HttpServletRequest request) {
        String wantid = getResumeById(jobService.getUser(request).getUserid()).getWantid();
        want.setWantid(wantid);
        WantExample example = new WantExample();
        com.recruitment.pojo.WantExample.Criteria criteria = example.createCriteria();
        criteria.andWantidEqualTo(want.getWantid());
        wantMapper.insert(want);
        return RecruitmentResult.ok();
    }
 
    /**
     * 根据期望id查询期望
     * @param 期望id
     * @return 期望对象
     */

    @Override
    public Want getWantById(String wantid) {
        WantExample example = new WantExample();
        com.recruitment.pojo.WantExample.Criteria criteria = example.createCriteria();
        criteria.andWantidEqualTo(wantid);
        List<Want> list = wantMapper.selectByExample(example);
       
        if (!list.isEmpty() && list.size()>0) {
            Want want = list.get(0);
            want.setNature(dictionaryUtils.dictionary(want.getNature(),"nature").getItemvalue());
            want.setWantindustry(dictionaryUtils.dictionary(want.getWantindustry(),"direction").getItemvalue());
            want.setWantsalary(dictionaryUtils.dictionary(want.getWantsalary(),"salary").getItemvalue());
            want.setWorkstatus(dictionaryUtils.dictionary(want.getWorkstatus(),"workstatus").getItemvalue());
            return want;
        }else {
            return null;
        }
        
    }
    /**
     * 新增一个简历
     */
    @Override
    public RecruitmentResult createResumeById(String candidateid) {
        Resume resume = new Resume();
        resume.setResumeid(candidateid);
        resume.setWantid(IdGenUtils.getId());
        resume.setPorjectsid(IdGenUtils.getId());
        resume.setEnducationid(IdGenUtils.getId());
        resume.setRewardid(IdGenUtils.getId());
        resume.setSkillid(IdGenUtils.getId());
        resume.setWorkid(IdGenUtils.getId()); 
        resume.setIntroduceid(IdGenUtils.getId()); 
        resumeMapper.insert(resume);
        return RecruitmentResult.ok();
    }
    /**
     * 根据wantid修改want对象
     */
    @Override
    public RecruitmentResult editWant(Want want) {
        WantExample example = new WantExample();
        com.recruitment.pojo.WantExample.Criteria criteria = example.createCriteria();
        criteria.andWantidEqualTo(want.getWantid());
        wantMapper.updateByExample(want, example);
        return RecruitmentResult.ok();
    }
    /**
     * 根据id创建新的工作经历
     */
    @Override
    public RecruitmentResult addWorkExperience(WorkExperience work,HttpServletRequest request) {
        String workid = getResumeById(jobService.getUser(request).getUserid()).getWorkid();
        work.setWorkid(workid);
        workMapper.insert(work);
        return RecruitmentResult.ok();
    }
    /**
     * 根据工作经历id修改工作经历
     */
    
    @Override
    public RecruitmentResult editWorkExperience(WorkExperience work,HttpServletRequest request) {
        String workid = getResumeById(jobService.getUser(request).getUserid()).getWorkid();
        work.setWorkid(workid);
        WorkExperienceExample example = new WorkExperienceExample();
        com.recruitment.pojo.WorkExperienceExample.Criteria criteria =example.createCriteria();
        criteria.andIdEqualTo(work.getId());
        workMapper.updateByExample(work, example);
        return RecruitmentResult.ok();
    }
    /**
     * 根据workid查询所有的工作记录
     */
    @Override
    public List<WorkExperience> getWorksById(HttpServletRequest request) {
        String workid = getResumeById(jobService.getUser(request).getUserid()).getWorkid();
        WorkExperienceExample example = new WorkExperienceExample();
        com.recruitment.pojo.WorkExperienceExample.Criteria criteria =example.createCriteria();
        criteria.andWorkidEqualTo(workid);
        List<WorkExperience> works = workMapper.selectByExample(example);
        for(WorkExperience workExperience: works){
            workExperience.setSalary(dictionaryUtils.dictionary(workExperience.getSalary(),"salary").getItemvalue());
        }
        return works;
    }
    /**
     * 添加新的项目经历
     */
    @Override
    public RecruitmentResult addProjectExperience(ProjectExperience project,HttpServletRequest request) {
        String projectid = getResumeById(jobService.getUser(request).getUserid()).getPorjectsid();
        project.setProjectexpirenceid(projectid);
        projectMapper.insert(project);
        
        return RecruitmentResult.ok();
    }
    /**
     * 修改项目经历
     */
    @Override
    public RecruitmentResult editProjectExperience(ProjectExperience project,HttpServletRequest request) {
        String projectid = getResumeById(jobService.getUser(request).getUserid()).getPorjectsid();
        project.setProjectexpirenceid(projectid);
        ProjectExperienceExample example = new ProjectExperienceExample();
        com.recruitment.pojo.ProjectExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(project.getId());
        projectMapper.updateByExample(project, example);
        return RecruitmentResult.ok();
    }
    /**
     * 查询所有的项目经历
     */
    @Override
    public List<ProjectExperience> getProjectById(HttpServletRequest request) {
        String projectid = getResumeById(jobService.getUser(request).getUserid()).getPorjectsid();
        ProjectExperienceExample example = new ProjectExperienceExample();
        com.recruitment.pojo.ProjectExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andProjectexpirenceidEqualTo(projectid);
        List<ProjectExperience> projects = projectMapper.selectByExample(example);
        return projects;
    }
    /**
     * 新增教育经历
     */
    @Override
    public RecruitmentResult addEducationExperience(EducationExperience education,HttpServletRequest request) {
        String educationid = getResumeById(jobService.getUser(request).getUserid()).getEnducationid();
        education.setEducationid(educationid);
        educationMapper.insert(education);
        return RecruitmentResult.ok();
    }
    /**
     * 修改教育经历
     */
    @Override
    public RecruitmentResult editEducationExperience(EducationExperience education,HttpServletRequest request) {
        String educationid = getResumeById(jobService.getUser(request).getUserid()).getEnducationid();
        education.setEducationid(educationid);
        EducationExperienceExample example = new EducationExperienceExample();
        com.recruitment.pojo.EducationExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(education.getId());
        educationMapper.updateByExample(education, example);
        
        return RecruitmentResult.ok();
    }
    /**
     * 查询所有的教育经历
     */
    @Override
    public List<EducationExperience> getEducationById(HttpServletRequest request) {
        String educationid = getResumeById(jobService.getUser(request).getUserid()).getEnducationid();
        EducationExperienceExample example = new EducationExperienceExample();
        com.recruitment.pojo.EducationExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andEducationidEqualTo(educationid);
        List<EducationExperience> educations = educationMapper.selectByExample(example);
        for(EducationExperience education: educations){
            education.setEducation(dictionaryUtils.dictionary(education.getEducation(),"education").getItemvalue());
        }
        return educations;
    }
    /**
     * 新增技能
     */
    @Override
    public RecruitmentResult addSkill(Skill skill,HttpServletRequest request) {
        String skillid = getResumeById(jobService.getUser(request).getUserid()).getSkillid();
        skill.setSkillid(skillid);       
        skillMapper.insert(skill);
        return RecruitmentResult.ok();
    }
/**
 * 编辑技能
 */
    @Override
    public RecruitmentResult editSkill(Skill skill,HttpServletRequest request) {
        String skillid = getResumeById(jobService.getUser(request).getUserid()).getSkillid();
        skill.setSkillid(skillid);
        SkillExample example = new SkillExample();
        com.recruitment.pojo.SkillExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(skill.getId());
        skillMapper.updateByExample(skill, example);
        return RecruitmentResult.ok();
    }
    /**
     * 获取技能
     */
    @Override
    public List<Skill> getSkillById(HttpServletRequest request) {
        String skillid = getResumeById(jobService.getUser(request).getUserid()).getSkillid();
        SkillExample example = new SkillExample();
        com.recruitment.pojo.SkillExample.Criteria criteria = example.createCriteria();
        criteria.andSkillidEqualTo(skillid);
        List<Skill> skills = skillMapper.selectByExample(example);
        for(Skill skill: skills){
            skill.setListenskill(dictionaryUtils.dictionary(skill.getListenskill(),"master").getItemvalue());
            skill.setWriteskill(dictionaryUtils.dictionary(skill.getWriteskill(),"master").getItemvalue());
        }
        return skills;
    }
    /**
     * 新增获奖经历
     */
    @Override
    public RecruitmentResult addReward(RewardExperience reward,HttpServletRequest request) {
        String rewardid = getResumeById(jobService.getUser(request).getUserid()).getResumeid();
        reward.setRewardexperienceid(rewardid);
        rewardMapper.insert(reward);
        return RecruitmentResult.ok();
    }
    /**
     * 编辑获奖经历
     */
    @Override
    public RecruitmentResult editReward(RewardExperience reward,HttpServletRequest request) {
        String rewardid = getResumeById(jobService.getUser(request).getUserid()).getResumeid();
        reward.setRewardexperienceid(rewardid);
        RewardExperienceExample example = new RewardExperienceExample();
        com.recruitment.pojo.RewardExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(reward.getId());
        rewardMapper.updateByExample(reward, example);
        return RecruitmentResult.ok();
    }
    /**
     * 获取所有的获奖经历
     */
    @Override
    public List<RewardExperience> getRewardById(HttpServletRequest request) {
        String rewardid = getResumeById(jobService.getUser(request).getUserid()).getResumeid();
        RewardExperienceExample example = new RewardExperienceExample();
        com.recruitment.pojo.RewardExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andRewardexperienceidEqualTo(rewardid);
        List<RewardExperience> rewards = rewardMapper.selectByExample(example);        
        return rewards;
    }
    /**
     * 新建自我介绍
     */
    @Override
    public RecruitmentResult addIntroduce(Introduce introduce,HttpServletRequest request) {
        String introduceid = getResumeById(jobService.getUser(request).getUserid()).getIntroduceid();
        introduce.setIntroduceid(introduceid);
        introduceMapper.insert(introduce);
        return RecruitmentResult.ok();
    }
    /**
     * 编辑自我介绍
     */
    @Override
    public RecruitmentResult editIntroduce(Introduce introduce,HttpServletRequest request) {
        String introduceid = getResumeById(jobService.getUser(request).getUserid()).getIntroduceid();
        introduce.setIntroduceid(introduceid);
        IntroduceExample example = new IntroduceExample();
        com.recruitment.pojo.IntroduceExample.Criteria criteria = example.createCriteria();
        criteria.andIntroduceidEqualTo(introduceid);
        introduceMapper.updateByExample(introduce, example);
        return RecruitmentResult.ok();
    }
    /**
     * 获取自我介绍
     */
    @Override
    public Introduce getIntroduceById(HttpServletRequest request) {
        String introduceid = getResumeById(jobService.getUser(request).getUserid()).getIntroduceid();
        IntroduceExample example = new IntroduceExample();
        com.recruitment.pojo.IntroduceExample.Criteria criteria = example.createCriteria();
        criteria.andIntroduceidEqualTo(introduceid);
        List<Introduce> list = introduceMapper.selectByExample(example);
        if (!list.isEmpty() && list.size()>0) {
            return (Introduce)list.get(0);
        }else {
            return null;
        }
       
    }
    /**
     * 删除工作经历
     */
    @Override
    public Boolean deleteWorkExperience(Integer id) {
        WorkExperienceExample example = new WorkExperienceExample();
        com.recruitment.pojo.WorkExperienceExample.Criteria criteria =example.createCriteria();
        criteria.andIdEqualTo(id);
        if(workMapper.deleteByExample(example)==1){
            return true;
        }else{
            return false;
        }
        
    }

    /**
     * 删除项目经历
     */
    @Override
    public Boolean deleteProject(Integer id) {
        ProjectExperienceExample example = new ProjectExperienceExample();
        com.recruitment.pojo.ProjectExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        if(projectMapper.deleteByExample(example)==1){
            return true;
        }else{
            return false;
        }
    }
/**
 * 删除技能
 */
    @Override
    public Boolean deleteSkill(Integer id) {
        SkillExample example = new SkillExample();
        com.recruitment.pojo.SkillExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        if(skillMapper.deleteByExample(example)==1){
            return true;
        }else{
            return false;
        }
    }
    /**
     * 删除获奖经历
     */
    @Override
    public Boolean deleteReward(Integer id) {
        RewardExperienceExample example = new RewardExperienceExample();
        com.recruitment.pojo.RewardExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        if(rewardMapper.deleteByExample(example)==1){
            return true;
        }else{
            return false;
        }
    }
    /**
     * 删除学历
     */
    @Override
    public Boolean deleteEducation(Integer id) {
        EducationExperienceExample example = new EducationExperienceExample();
        com.recruitment.pojo.EducationExperienceExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(id);
        if(educationMapper.deleteByExample(example)==1){
            return true;
        }else{
            return false;
        }
    }

   
}
