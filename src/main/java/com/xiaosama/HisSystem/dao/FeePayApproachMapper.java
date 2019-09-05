package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.FeePayApproach;
import com.xiaosama.HisSystem.po.FeePayApproachExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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