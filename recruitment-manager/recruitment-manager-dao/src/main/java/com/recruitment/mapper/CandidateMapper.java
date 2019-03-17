package com.recruitment.mapper;

import com.recruitment.pojo.Candidate;
import com.recruitment.pojo.CandidateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidateMapper {
    int countByExample(CandidateExample example);

    int deleteByExample(CandidateExample example);

    int deleteByPrimaryKey(String candidateid);

    int insert(Candidate record);

    int insertSelective(Candidate record);

    List<Candidate> selectByExample(CandidateExample example);

    Candidate selectByPrimaryKey(String candidateid);

    int updateByExampleSelective(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByExample(@Param("record") Candidate record, @Param("example") CandidateExample example);

    int updateByPrimaryKeySelective(Candidate record);

    int updateByPrimaryKey(Candidate record);
}