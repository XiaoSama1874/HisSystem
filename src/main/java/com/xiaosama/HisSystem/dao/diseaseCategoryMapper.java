package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.diseaseCategory;
import com.xiaosama.HisSystem.pojo.po.diseaseCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface diseaseCategoryMapper {
    int countByExample(diseaseCategoryExample example);

    int deleteByExample(diseaseCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(diseaseCategory record);

    int insertSelective(diseaseCategory record);

    List<diseaseCategory> selectByExample(diseaseCategoryExample example);

    diseaseCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") diseaseCategory record, @Param("example") diseaseCategoryExample example);

    int updateByExample(@Param("record") diseaseCategory record, @Param("example") diseaseCategoryExample example);

    int updateByPrimaryKeySelective(diseaseCategory record);

    int updateByPrimaryKey(diseaseCategory record);
}