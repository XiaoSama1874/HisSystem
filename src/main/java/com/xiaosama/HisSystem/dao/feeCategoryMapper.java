package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.feeCategory;
import com.xiaosama.HisSystem.pojo.po.feeCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface feeCategoryMapper {
    int countByExample(feeCategoryExample example);

    int deleteByExample(feeCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(feeCategory record);

    int insertSelective(feeCategory record);

    List<feeCategory> selectByExample(feeCategoryExample example);

    feeCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") feeCategory record, @Param("example") feeCategoryExample example);

    int updateByExample(@Param("record") feeCategory record, @Param("example") feeCategoryExample example);

    int updateByPrimaryKeySelective(feeCategory record);

    int updateByPrimaryKey(feeCategory record);
}