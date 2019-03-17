package com.recruitment.hr.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.recruitment.hr.service.CandidateService;
import com.recruitment.hr.service.JobService;
import com.recruitment.mapper.DeliveryMapper;
import com.recruitment.pojo.Delivery;
import com.recruitment.pojo.DeliveryExample;
import com.recruitment.pojo.DeliveryExample.Criteria;
import com.recruitment.utils.CookieUtils;
import com.recruitment.utils.DictionaryUtilsImpl;
import com.recruitment.utils.HttpClientUtil;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;
import com.recruitment.pojo.User;
@Service
public class CandidateServiceImpl implements CandidateService {

    @Autowired
    private DeliveryMapper mapper;
    @Autowired
    DictionaryUtilsImpl dictionaryUtils = DictionaryUtilsImpl.getInstance();
    @Autowired
    private JobService jobService;
    /**
     * 分页查询求职者
     */
    @Override
    public EasyUIDataGridResult getDeliveryList(Integer page, Integer rows,HttpServletRequest request) {
        User user = jobService.getUser(request);
        String hrid = user.getUserid();
        PageHelper.startPage(page, rows);  
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andHridEqualTo(hrid);
        List<Delivery> lists = mapper.selectByExample(example);
        for(Delivery delivery:lists){
            delivery.setSex(dictionaryUtils.dictionary(delivery.getSex(), "sex").getItemvalue());
            delivery.setSchedule(dictionaryUtils.dictionary(delivery.getSchedule(), "schedule").getItemvalue());
        }
        PageInfo<Delivery> pageInfo = new PageInfo<>(lists);
        EasyUIDataGridResult result = new EasyUIDataGridResult();
        
        result.setTotal(pageInfo.getTotal());
        
        result.setRows(lists);
  
        return result;
    }
    /**
     * 查询全部求职者
     */
    @Override
    public List<Delivery> getAllDeliveryList() {
        DeliveryExample example = new DeliveryExample();
        List<Delivery> lists = mapper.selectByExample(example);
        return lists;
    }
    /**
     * 新建求职者
     */
    @Override
    public RecruitmentResult creatDelivery(Delivery Delivery) {
        mapper.insert(Delivery);
        return RecruitmentResult.ok();
    }
    /**
     * 根据id查询求职者
     */

    @Override
    public RecruitmentResult getDeliveryById(Integer deliveryid) {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andDeliveryidEqualTo(deliveryid);
        List<Delivery> lists = mapper.selectByExample(example);
        Delivery Delivery = lists.get(0);
        return RecruitmentResult.ok(Delivery);
    }
    /**
     * 删除求职者
     */
    @Override
    public RecruitmentResult deleteDeliveryById(Integer deliveryid) {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andDeliveryidEqualTo(deliveryid);
        mapper.deleteByExample(example);
        return RecruitmentResult.ok();
    }
    /**
     * 修改求职者
     */
    @Override
    public RecruitmentResult updateDeliveryById(Delivery delivery, Integer deliveryid) {
        DeliveryExample example = new DeliveryExample();
        Criteria criteriaForGet = example.createCriteria();
        criteriaForGet.andDeliveryidEqualTo(deliveryid);
        List<Delivery> lists = mapper.selectByExample(example);
        Delivery delivery1 = lists.get(0);
        delivery1.setSchedule(delivery.getSchedule());
        DeliveryExample example1 = new DeliveryExample();
        Criteria criteriaForupdate = example1.createCriteria();
        criteriaForupdate.andDeliveryidEqualTo(deliveryid);
        mapper.updateByExample(delivery1, example1);
        return RecruitmentResult.ok();
    }
    



}
