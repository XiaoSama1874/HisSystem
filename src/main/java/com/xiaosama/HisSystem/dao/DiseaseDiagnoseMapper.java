package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.DiseaseDiagnose;
import com.xiaosama.HisSystem.pojo.po.diseaseDiagnoseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DiseaseDiagnoseMapper {
    int countByExample(diseaseDiagnoseExample example);

    int deleteByExample(diseaseDiagnoseExample example);

    int insert(DiseaseDiagnose record);

    int insertSelective(DiseaseDiagnose record);

    List<DiseaseDiagnose> selectByExample(diseaseDiagnoseExample example);

    int updateByExampleSelective(@Param("record") DiseaseDiagnose record, @Param("example") diseaseDiagnoseExample example);

    int updateByExample(@Param("record") DiseaseDiagnose record, @Param("example") diseaseDiagnoseExample example);
}