package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.diseaseDiagnose;
import com.xiaosama.HisSystem.pojo.po.diseaseDiagnoseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface diseaseDiagnoseMapper {
    int countByExample(diseaseDiagnoseExample example);

    int deleteByExample(diseaseDiagnoseExample example);

    int insert(diseaseDiagnose record);

    int insertSelective(diseaseDiagnose record);

    List<diseaseDiagnose> selectByExample(diseaseDiagnoseExample example);

    int updateByExampleSelective(@Param("record") diseaseDiagnose record, @Param("example") diseaseDiagnoseExample example);

    int updateByExample(@Param("record") diseaseDiagnose record, @Param("example") diseaseDiagnoseExample example);
}