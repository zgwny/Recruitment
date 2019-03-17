package com.recruitment.user.controller;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.Dictionary;
import com.recruitment.pojo.EducationExperience;
import com.recruitment.pojo.Introduce;
import com.recruitment.pojo.Job;
import com.recruitment.pojo.JobDescription;
import com.recruitment.pojo.ProjectExperience;
import com.recruitment.pojo.Resume;
import com.recruitment.pojo.RewardExperience;
import com.recruitment.pojo.Skill;
import com.recruitment.pojo.Want;
import com.recruitment.pojo.WorkExperience;
import com.recruitment.pojo.WorkExperienceExample;
import com.recruitment.user.service.JobService;
import com.recruitment.user.service.ResumeService;
import com.recruitment.user.service.ScheduleService;
import com.recruitment.user.service.SearchService;
import com.sun.tools.internal.ws.processor.model.Request;

@Controller
public class PageController {
    
    @Autowired
    private JobService jobService;
    @Autowired
    private ResumeService resumeService;
    @Autowired
    private ScheduleService scheduleService;
    @Autowired
    private SearchService searchService;
    
    @RequestMapping("/")
    public String index(Model mod){
        List<Job> lists = jobService.getAlljobList();
        mod.addAttribute("jobList", lists);
        
        return "index";
    }
    
    @RequestMapping("/schedule")
    public String schedule(Model mod){
        
        mod.addAttribute("deliverySuccess", scheduleService.getDeliverySuccess());
        mod.addAttribute("haveBeenSaw", scheduleService.getHaveBeenSaw());
        mod.addAttribute("like", scheduleService.getLike());
        mod.addAttribute("haveBeenInvited", scheduleService.getHaveBeenInvited());
        mod.addAttribute("refused", scheduleService.getRefused());
        mod.addAttribute("toConfirm", scheduleService.getToconfirm());
        mod.addAttribute("accept", scheduleService.getAccept());
        mod.addAttribute("notFit", scheduleService.getNotFit());
        List<Job> lists = jobService.getAlljobList();
        List<Job> jobs = new ArrayList<>();
        
        for(int i = 0; i<3;i++){
            jobs.add(lists.get(i));
        }
        
        mod.addAttribute("jobList", jobs);
        
        return "schedule";
    }
    
    @RequestMapping("/see_account")
    public String see_account(Model mod){
        
        
        return "see_account";
    }
    
    @RequestMapping("/see_resume")
    public String resum(Model mod,HttpServletRequest request){
        
       Candidate candidate = resumeService.getCandidateById(jobService.getUser(request).getUserid());
       Resume resumeforcheck = resumeService.getResumeById(jobService.getUser(request).getUserid());
       if (resumeforcheck == null) {
           resumeService.createResumeById(jobService.getUser(request).getUserid());        
       }
       Resume resume = resumeService.getResumeById(jobService.getUser(request).getUserid());
       mod.addAttribute("candidate", candidate);
       List<Dictionary> natures = resumeService.getDictionaryByGroupValue("nature");
       mod.addAttribute("natures",natures);
       List<Dictionary> workstatus = resumeService.getDictionaryByGroupValue("workstatus");
       mod.addAttribute("workstatus", workstatus);
       List<Dictionary> salaries = resumeService.getDictionaryByGroupValue("salary");
       mod.addAttribute("salaries", salaries);
       List<Dictionary> directions = resumeService.getDictionaryByGroupValue("direction");
       mod.addAttribute("directions", directions);
       List<WorkExperience> works = resumeService.getWorksById(request);
       mod.addAttribute("works",works);
       Want want = resumeService.getWantById(resume.getWantid());
       mod.addAttribute("want",want);
       List<ProjectExperience> projects = resumeService.getProjectById(request);
       mod.addAttribute("projects", projects);
       List<EducationExperience> educations =resumeService.getEducationById(request);
       mod.addAttribute("educations", educations);
       List<Dictionary> educationDictionary = resumeService.getDictionaryByGroupValue("education");
       mod.addAttribute("educationDictionary", educationDictionary);
       List<Dictionary> masters = resumeService.getDictionaryByGroupValue("master");
       mod.addAttribute("masters",masters);
       List<Skill> skills = resumeService.getSkillById(request);
       mod.addAttribute("skills", skills);
       List<RewardExperience> rewards = resumeService.getRewardById(request);
       mod.addAttribute("rewards", rewards);
       Introduce introduce = resumeService.getIntroduceById(request);
       mod.addAttribute("introduce",introduce);
       return "see_resume";
    }
    @RequestMapping("/job_list")
    public String importAll(@RequestParam(defaultValue="")String key,Model mod) throws SolrServerException, UnsupportedEncodingException {
            key = new String(key.getBytes("iso8859-1"), "utf-8");
           List<Job> jobs = searchService.queryJobByKey(key);
           mod.addAttribute("jobs", jobs);
           return "job_list";
           
    }
}
