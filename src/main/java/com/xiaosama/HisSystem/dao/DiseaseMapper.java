package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.Disease;
import com.xiaosama.HisSystem.pojo.po.DiseaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiseaseMapper {
    int countByExample(DiseaseExample example);

    int deleteByExample(DiseaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Disease record);

    int insertSelective(Disease record);

    List<Disease> selectByExample(DiseaseExample example);

    Disease selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Disease record, @Param("example") DiseaseExample example);

    int updateByExample(@Param("record") Disease record, @Param("example") DiseaseExample example);

    int updateByPrimaryKeySelective(Disease record);

    int updateByPrimaryKey(Disease record);
}