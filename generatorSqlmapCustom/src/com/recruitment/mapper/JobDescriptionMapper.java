package com.recruitment.mapper;

import com.recruitment.pojo.JobDescription;
import com.recruitment.pojo.JobDescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobDescriptionMapper {
    int countByExample(JobDescriptionExample example);

    int deleteByExample(JobDescriptionExample example);

    int deleteByPrimaryKey(String jobid);

    int insert(JobDescription record);

    int insertSelective(JobDescription record);

    List<JobDescription> selectByExampleWithBLOBs(JobDescriptionExample example);

    List<JobDescription> selectByExample(JobDescriptionExample example);

    JobDescription selectByPrimaryKey(String jobid);

    int updateByExampleSelective(@Param("record") JobDescription record, @Param("example") JobDescriptionExample example);

    int updateByExampleWithBLOBs(@Param("record") JobDescription record, @Param("example") JobDescriptionExample example);

    int updateByExample(@Param("record") JobDescription record, @Param("example") JobDescriptionExample example);

    int updateByPrimaryKeySelective(JobDescription record);

    int updateByPrimaryKeyWithBLOBs(JobDescription record);
}