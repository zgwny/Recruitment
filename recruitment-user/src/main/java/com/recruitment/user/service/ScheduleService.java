package com.recruitment.user.service;

import java.util.List;

import com.recruitment.pojo.Job;

public interface ScheduleService {
    List<Job> getDeliverySuccess();
    List<Job> getHaveBeenSaw();
    List<Job> getLike();
    List<Job> getHaveBeenInvited();
    List<Job> getRefused();
    List<Job> getToconfirm();
    List<Job> getAccept();
    List<Job> getNotFit();
}
