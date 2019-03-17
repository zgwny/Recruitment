package com.recruitment.mapper;

import com.recruitment.pojo.RewardExperience;
import com.recruitment.pojo.RewardExperienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RewardExperienceMapper {
    int countByExample(RewardExperienceExample example);

    int deleteByExample(RewardExperienceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RewardExperience record);

    int insertSelective(RewardExperience record);

    List<RewardExperience> selectByExample(RewardExperienceExample example);

    RewardExperience selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RewardExperience record, @Param("example") RewardExperienceExample example);

    int updateByExample(@Param("record") RewardExperience record, @Param("example") RewardExperienceExample example);

    int updateByPrimaryKeySelective(RewardExperience record);

    int updateByPrimaryKey(RewardExperience record);
}