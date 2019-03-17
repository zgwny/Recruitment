package com.recruitment.user.service;

import java.util.List;

import org.apache.solr.client.solrj.SolrServerException;

import com.recruitment.pojo.Job;
import com.recruitment.pojo.RecruitmentResult;

public interface SearchService {

    RecruitmentResult importJob() throws Exception;
    
    List<Job> queryJobByKey(String key) throws SolrServerException;
}
