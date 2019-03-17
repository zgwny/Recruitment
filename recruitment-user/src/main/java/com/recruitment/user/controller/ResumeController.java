package com.recruitment.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.EducationExperience;
import com.recruitment.pojo.Introduce;
import com.recruitment.pojo.ProjectExperience;
import com.recruitment.pojo.RewardExperience;
import com.recruitment.pojo.Skill;
import com.recruitment.pojo.Want;
import com.recruitment.pojo.WorkExperience;
import com.recruitment.user.service.ResumeService;

@Controller
@RequestMapping("/resume")
public class ResumeController {

    @Autowired
    private ResumeService resumeService;
    
    @RequestMapping(value="/profile/add",method=RequestMethod.POST)
    public String profileAdd(Candidate candidate){
        resumeService.creatcandidate(candidate);
        return "redirect:/see_resume";
    }
    @RequestMapping(value="/profile/edit",method=RequestMethod.POST)
    public String profileEdit(Candidate candidate){
        resumeService.editcandidate(candidate);
        return "redirect:/see_resume";
    }
    @RequestMapping(value="/want/add",method=RequestMethod.POST)
    public String wantAdd(Want want,HttpServletRequest request){       
        resumeService.creatWant(want,request);
        return "redirect:/see_resume";
    }
    @RequestMapping(value="/want/edit",method=RequestMethod.POST)
    public String wantEdit(Want want){       
        resumeService.editWant(want);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/workExperience/add",method=RequestMethod.POST)
    public String workEditWorkExperience(WorkExperience work,HttpServletRequest request){
        resumeService.addWorkExperience(work,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/workExperience/edit",method=RequestMethod.POST)
    public String workEdit(WorkExperience work,HttpServletRequest request){
        resumeService.editWorkExperience(work,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping("/workExperience/delete")
    public String workEdit(Integer id){
        resumeService.deleteWorkExperience(id);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/project/add",method=RequestMethod.POST)
    public String addproject(ProjectExperience project,HttpServletRequest request){
        resumeService.addProjectExperience(project,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/project/edit",method=RequestMethod.POST)
    public String editProject(ProjectExperience project,HttpServletRequest request){
        resumeService.editProjectExperience(project,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping("/project/delete")
    public String projectEdit(Integer id){
        resumeService.deleteProject(id);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/education/add",method=RequestMethod.POST)
    public String addEducation(EducationExperience education,HttpServletRequest request){
        resumeService.addEducationExperience(education,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/education/edit",method=RequestMethod.POST)
    public String editEducation(EducationExperience education,HttpServletRequest request){
        resumeService.editEducationExperience(education,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping("/education/delete")
    public String educationDelete(Integer id){
        resumeService.deleteEducation(id);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/skill/add",method=RequestMethod.POST)
    public String addSkill(Skill skill,HttpServletRequest request){
        resumeService.addSkill(skill,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/skill/edit",method=RequestMethod.POST)
    public String editSkill(Skill skill,HttpServletRequest request){
        resumeService.editSkill(skill,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping("/skill/delete")
    public String skillDelete(Integer id){
        resumeService.deleteSkill(id);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/reward/add",method=RequestMethod.POST)
    public String addReward(RewardExperience reward,HttpServletRequest request){
        resumeService.addReward(reward,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/reward/edit",method=RequestMethod.POST)
    public String editReward(RewardExperience rewardExperience,HttpServletRequest request){
        resumeService.editReward(rewardExperience,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping("/reward/delete")
    public String rewardDelete(Integer id){
        resumeService.deleteReward(id);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/introduce/add",method=RequestMethod.POST)
    public String addIntroduce(Introduce introduce,HttpServletRequest request){
        resumeService.addIntroduce(introduce,request);
        return "redirect:/see_resume";
    }
    
    @RequestMapping(value="/introduce/edit",method=RequestMethod.POST)
    public String editIntroduce(Introduce introduce,HttpServletRequest request){
        resumeService.editIntroduce(introduce,request);
        return "redirect:/see_resume";
    }
    
}
