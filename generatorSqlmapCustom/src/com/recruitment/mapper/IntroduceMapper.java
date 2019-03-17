package com.recruitment.mapper;

import com.recruitment.pojo.Introduce;
import com.recruitment.pojo.IntroduceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntroduceMapper {
    int countByExample(IntroduceExample example);

    int deleteByExample(IntroduceExample example);

    int deleteByPrimaryKey(String introduceid);

    int insert(Introduce record);

    int insertSelective(Introduce record);

    List<Introduce> selectByExample(IntroduceExample example);

    Introduce selectByPrimaryKey(String introduceid);

    int updateByExampleSelective(@Param("record") Introduce record, @Param("example") IntroduceExample example);

    int updateByExample(@Param("record") Introduce record, @Param("example") IntroduceExample example);

    int updateByPrimaryKeySelective(Introduce record);

    int updateByPrimaryKey(Introduce record);
}