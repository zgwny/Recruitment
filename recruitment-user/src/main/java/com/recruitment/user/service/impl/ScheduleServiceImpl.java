package com.recruitment.user.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.aspectj.util.LangUtil.StringChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.recruitment.mapper.DeliveryMapper;
import com.recruitment.pojo.Delivery;
import com.recruitment.pojo.DeliveryExample;
import com.recruitment.pojo.Job;
import com.recruitment.pojo.DeliveryExample.Criteria;
import com.recruitment.user.service.JobService;
import com.recruitment.user.service.ScheduleService;
@Service
public class ScheduleServiceImpl implements ScheduleService {

    @Autowired
    private DeliveryMapper deliveryMapper;
    @Autowired
    private JobService jobService;
    
    @Override
    public List<Job> getDeliverySuccess() {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andScheduleEqualTo("1");
        List<Delivery> list = deliveryMapper.selectByExample(example);
        List<Job> jobs = new ArrayList<>();
        if (!list.isEmpty() && list.size()>0) {
            for(Delivery delivery: list){
                String jobid = delivery.getJobid();
                Job job = jobService.getjobById(jobid);
                jobs.add(job);
            }
            return jobs;
            
        }else{
            return null;
        }
    }

    @Override
    public List<Job> getHaveBeenSaw() {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andScheduleEqualTo("2");
        List<Delivery> list = deliveryMapper.selectByExample(example);
        List<Job> jobs = new ArrayList<>();
        if (!list.isEmpty() && list.size()>0) {
            for(Delivery delivery: list){
                String jobid = delivery.getJobid();
                Job job = jobService.getjobById(jobid);
                jobs.add(job);
            }
            return jobs;
            
        }else{
            return null;
        }
    }

    @Override
    public List<Job> getLike() {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andScheduleEqualTo("3");
        List<Delivery> list = deliveryMapper.selectByExample(example);
        List<Job> jobs = new ArrayList<>();
        if (!list.isEmpty() && list.size()>0) {
            for(Delivery delivery: list){
                String jobid = delivery.getJobid();
                Job job = jobService.getjobById(jobid);
                jobs.add(job);
            }
            return jobs;
            
        }else{
            return null;
        }
    }

    @Override
    public List<Job> getHaveBeenInvited() {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andScheduleEqualTo("4");
        List<Delivery> list = deliveryMapper.selectByExample(example);
        List<Job> jobs = new ArrayList<>();
        if (!list.isEmpty() && list.size()>0) {
            for(Delivery delivery: list){
                String jobid = delivery.getJobid();
                Job job = jobService.getjobById(jobid);
                jobs.add(job);
            }
            return jobs;
            
        }else{
            return null;
        }
    }

    @Override
    public List<Job> getRefused() {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andScheduleEqualTo("8");
        List<Delivery> list = deliveryMapper.selectByExample(example);
        List<Job> jobs = new ArrayList<>();
        if (!list.isEmpty() && list.size()>0) {
            for(Delivery delivery: list){
                String jobid = delivery.getJobid();
                Job job = jobService.getjobById(jobid);
                jobs.add(job);
            }
            return jobs;
            
        }else{
            return null;
        }
    }

    @Override
    public List<Job> getToconfirm() {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andScheduleEqualTo("6");
        List<Delivery> list = deliveryMapper.selectByExample(example);
        List<Job> jobs = new ArrayList<>();
        if (!list.isEmpty() && list.size()>0) {
            for(Delivery delivery: list){
                String jobid = delivery.getJobid();
                Job job = jobService.getjobById(jobid);
                jobs.add(job);
            }
            return jobs;
            
        }else{
            return null;
        }
    }

    @Override
    public List<Job> getAccept() {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andScheduleEqualTo("7");
        List<Delivery> list = deliveryMapper.selectByExample(example);
        List<Job> jobs = new ArrayList<>();
        if (!list.isEmpty() && list.size()>0) {
            for(Delivery delivery: list){
                String jobid = delivery.getJobid();
                Job job = jobService.getjobById(jobid);
                jobs.add(job);
            }
            return jobs;
            
        }else{
            return null;
        }
    }

    @Override
    public List<Job> getNotFit() {
        DeliveryExample example = new DeliveryExample();
        Criteria criteria = example.createCriteria();
        criteria.andScheduleEqualTo("5");
        List<Delivery> list = deliveryMapper.selectByExample(example);
        List<Job> jobs = new ArrayList<>();
        if (!list.isEmpty() && list.size()>0) {
            for(Delivery delivery: list){
                String jobid = delivery.getJobid();
                Job job = jobService.getjobById(jobid);
                jobs.add(job);
            }
            return jobs;
            
        }else{
            return null;
        }
    }
    

}
