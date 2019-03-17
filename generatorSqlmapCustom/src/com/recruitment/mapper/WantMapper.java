package com.recruitment.mapper;

import com.recruitment.pojo.Want;
import com.recruitment.pojo.WantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WantMapper {
    int countByExample(WantExample example);

    int deleteByExample(WantExample example);

    int deleteByPrimaryKey(String wantid);

    int insert(Want record);

    int insertSelective(Want record);

    List<Want> selectByExample(WantExample example);

    Want selectByPrimaryKey(String wantid);

    int updateByExampleSelective(@Param("record") Want record, @Param("example") WantExample example);

    int updateByExample(@Param("record") Want record, @Param("example") WantExample example);

    int updateByPrimaryKeySelective(Want record);

    int updateByPrimaryKey(Want record);
}