package com.recruitment.mapper;

import com.recruitment.pojo.EducationExperience;
import com.recruitment.pojo.EducationExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EducationExperienceMapper {
    int countByExample(EducationExperienceExample example);

    int deleteByExample(EducationExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(EducationExperience record);

    int insertSelective(EducationExperience record);

    List<EducationExperience> selectByExample(EducationExperienceExample example);

    EducationExperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") EducationExperience record, @Param("example") EducationExperienceExample example);

    int updateByExample(@Param("record") EducationExperience record, @Param("example") EducationExperienceExample example);

    int updateByPrimaryKeySelective(EducationExperience record);

    int updateByPrimaryKey(EducationExperience record);
}