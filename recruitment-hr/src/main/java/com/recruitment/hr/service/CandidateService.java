package com.recruitment.hr.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.recruitment.pojo.Delivery;
import com.recruitment.pojo.EasyUIDataGridResult;
import com.recruitment.pojo.RecruitmentResult;

public interface CandidateService {

    EasyUIDataGridResult getDeliveryList(Integer page, Integer rows,HttpServletRequest request);

    List<Delivery> getAllDeliveryList();

    RecruitmentResult creatDelivery(Delivery delivery);

    RecruitmentResult getDeliveryById(Integer deliveryid);

    RecruitmentResult deleteDeliveryById(Integer deliveryid);

    RecruitmentResult updateDeliveryById(Delivery delivery, Integer deliveryid);

}
