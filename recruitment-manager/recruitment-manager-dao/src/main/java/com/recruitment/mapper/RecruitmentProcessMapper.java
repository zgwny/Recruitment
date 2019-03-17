package com.recruitment.mapper;

import com.recruitment.pojo.RecruitmentProcess;
import com.recruitment.pojo.RecruitmentProcessExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruitmentProcessMapper {
    int countByExample(RecruitmentProcessExample example);

    int deleteByExample(RecruitmentProcessExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(RecruitmentProcess record);

    int insertSelective(RecruitmentProcess record);

    List<RecruitmentProcess> selectByExample(RecruitmentProcessExample example);

    RecruitmentProcess selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") RecruitmentProcess record, @Param("example") RecruitmentProcessExample example);

    int updateByExample(@Param("record") RecruitmentProcess record, @Param("example") RecruitmentProcessExample example);

    int updateByPrimaryKeySelective(RecruitmentProcess record);

    int updateByPrimaryKey(RecruitmentProcess record);
}