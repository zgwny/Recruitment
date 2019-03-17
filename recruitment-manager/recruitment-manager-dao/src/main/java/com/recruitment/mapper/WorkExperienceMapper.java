package com.recruitment.mapper;

import com.recruitment.pojo.WorkExperience;
import com.recruitment.pojo.WorkExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkExperienceMapper {
    int countByExample(WorkExperienceExample example);

    int deleteByExample(WorkExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WorkExperience record);

    int insertSelective(WorkExperience record);

    List<WorkExperience> selectByExample(WorkExperienceExample example);

    WorkExperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WorkExperience record, @Param("example") WorkExperienceExample example);

    int updateByExample(@Param("record") WorkExperience record, @Param("example") WorkExperienceExample example);

    int updateByPrimaryKeySelective(WorkExperience record);

    int updateByPrimaryKey(WorkExperience record);
}