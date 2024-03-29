package com.recruitment.user.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServer;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.apache.solr.common.SolrInputDocument;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.recruitment.mapper.DeliveryMapper;
import com.recruitment.mapper.JobMapper;
import com.recruitment.pojo.Delivery;
import com.recruitment.pojo.DeliveryExample;
import com.recruitment.pojo.Job;
import com.recruitment.pojo.JobExample;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.user.service.SearchService;
import com.recruitment.utils.DictionaryUtilsImpl;
import com.sun.tools.javadoc.resources.javadoc_zh_CN;

@Service
public class SearchServiceImpl  implements SearchService {

    @Autowired
    private JobMapper mapper;
    @Autowired
    DictionaryUtilsImpl dictionaryUtils = DictionaryUtilsImpl.getInstance();
    @Autowired
    private SolrServer solrServer;
    
    @Autowired
    private DeliveryMapper deliveryMapper;
    
    @Override
    public RecruitmentResult importJob() throws Exception {
        JobExample example = new JobExample();
        List<Job> lists =mapper.selectByExample(example);
        for(Job job:lists){
            job.setSalary(dictionaryUtils.dictionary(job.getSalary(),"salary").getItemvalue());
            job.setEducation(dictionaryUtils.dictionary(job.getEducation(),"education").getItemvalue());
            job.setExperience(dictionaryUtils.dictionary(job.getExperience(),"experience").getItemvalue());
            //创建文档对象
            SolrInputDocument document = new SolrInputDocument();
            //添加域
            document.addField("id", job.getJobid());
            document.addField("jobname", job.getJobname());
            document.addField("salary", job.getSalary());
            document.addField("experience", job.getExperience());
            document.addField("companyname", job.getCompanyname());
            document.addField("address", job.getAddress());
            document.addField("education", job.getEducation());
            
            
            
            //写入索引库
            solrServer.add(document);
        }
        solrServer.commit();
        return RecruitmentResult.ok();
    }

    @Override
    public List<Job> queryJobByKey(String key) throws SolrServerException {
      //创建查询条件
        SolrQuery query = new SolrQuery();
        //设置查询条件
        query.setQuery(key);
      //设置默认搜索域
        query.set("df", "jobname");
      //执行查询
        QueryResponse response = solrServer.query(query);
        //取查询结果列表
        SolrDocumentList solrDocumentList = response.getResults();
        List<Job> itemList = new ArrayList<>();
        for (SolrDocument solrDocument : solrDocumentList) {
                Job job =new Job();
                DeliveryExample deliveryExample = new DeliveryExample();
                com.recruitment.pojo.DeliveryExample.Criteria criteria = deliveryExample.createCriteria();
                criteria.andJobidEqualTo((String) solrDocument.get("id"));
                List<Delivery> list= deliveryMapper.selectByExample(deliveryExample);
                if (list == null || list.isEmpty()) {
                    job.setJobname((String) solrDocument.get("jobname"));
                    job.setEducation((String) solrDocument.get("education"));
                    job.setExperience((String) solrDocument.get("experience"));
                    job.setSalary((String) solrDocument.get("salary"));
                    job.setAddress((String) solrDocument.get("address"));
                    job.setCompanyname((String) solrDocument.get("companyname"));
                    job.setJobid((String) solrDocument.get("id"));
                    itemList.add(job);
                }             
                            
        }

        return itemList;
    }
    
   

}
