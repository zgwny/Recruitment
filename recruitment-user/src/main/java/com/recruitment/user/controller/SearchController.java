package com.recruitment.user.controller;

import java.util.List;

import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.recruitment.pojo.Job;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.user.service.SearchService;
import com.recruitment.utils.ExceptionUtil;



@Controller
public class SearchController {
    
    @Autowired
   private SearchService searchService;

    @RequestMapping("/importall")
    @ResponseBody
    public RecruitmentResult importAll() {
            try {
                RecruitmentResult result = searchService.importJob();
                    return result;
            } catch (Exception e) {
                    e.printStackTrace();
                    return RecruitmentResult.build(500, ExceptionUtil.getStackTrace(e));
            }
    }
    


}
