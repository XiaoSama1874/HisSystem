package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.FeePayApproach;
import com.xiaosama.HisSystem.pojo.po.FeePayApproachExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FeePayApproachMapper {
    int countByExample(FeePayApproachExample example);

    int deleteByExample(FeePayApproachExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeePayApproach record);

    int insertSelective(FeePayApproach record);

    List<FeePayApproach> selectByExample(FeePayApproachExample example);

    FeePayApproach selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeePayApproach record, @Param("example") FeePayApproachExample example);

    int updateByExample(@Param("record") FeePayApproach record, @Param("example") FeePayApproachExample example);

    int updateByPrimaryKeySelective(FeePayApproach record);

    int updateByPrimaryKey(FeePayApproach record);
}