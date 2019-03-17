package com.recruitment.mapper;

import com.recruitment.pojo.Hr;
import com.recruitment.pojo.HrExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HrMapper {
    int countByExample(HrExample example);

    int deleteByExample(HrExample example);

    int deleteByPrimaryKey(String hrid);

    int insert(Hr record);

    int insertSelective(Hr record);

    List<Hr> selectByExample(HrExample example);

    Hr selectByPrimaryKey(String hrid);

    int updateByExampleSelective(@Param("record") Hr record, @Param("example") HrExample example);

    int updateByExample(@Param("record") Hr record, @Param("example") HrExample example);

    int updateByPrimaryKeySelective(Hr record);

    int updateByPrimaryKey(Hr record);
}