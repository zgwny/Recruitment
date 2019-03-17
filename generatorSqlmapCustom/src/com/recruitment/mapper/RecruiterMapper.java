package com.recruitment.mapper;

import com.recruitment.pojo.Recruiter;
import com.recruitment.pojo.RecruiterExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecruiterMapper {
    int countByExample(RecruiterExample example);

    int deleteByExample(RecruiterExample example);

    int deleteByPrimaryKey(Integer recruiterid);

    int insert(Recruiter record);

    int insertSelective(Recruiter record);

    List<Recruiter> selectByExample(RecruiterExample example);

    Recruiter selectByPrimaryKey(Integer recruiterid);

    int updateByExampleSelective(@Param("record") Recruiter record, @Param("example") RecruiterExample example);

    int updateByExample(@Param("record") Recruiter record, @Param("example") RecruiterExample example);

    int updateByPrimaryKeySelective(Recruiter record);

    int updateByPrimaryKey(Recruiter record);
}