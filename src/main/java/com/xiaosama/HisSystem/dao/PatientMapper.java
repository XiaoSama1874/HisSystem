package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.Patient;
import com.xiaosama.HisSystem.pojo.po.PatientExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PatientMapper {
    int countByExample(PatientExample example);

    int deleteByExample(PatientExample example);

    int deleteByPrimaryKey(Integer medicalId);

    int insert(Patient record);

    int insertSelective(Patient record);

    List<Patient> selectByExample(PatientExample example);

    Patient selectByPrimaryKey(Integer medicalId);

    int updateByExampleSelective(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByExample(@Param("record") Patient record, @Param("example") PatientExample example);

    int updateByPrimaryKeySelective(Patient record);

    int updateByPrimaryKey(Patient record);
}