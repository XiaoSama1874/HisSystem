package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.DoctorMedicalLevel;
import com.xiaosama.HisSystem.pojo.po.DoctorMedicalLevelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorMedicalLevelMapper {
    int countByExample(DoctorMedicalLevelExample example);

    int deleteByExample(DoctorMedicalLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoctorMedicalLevel record);

    int insertSelective(DoctorMedicalLevel record);

    List<DoctorMedicalLevel> selectByExample(DoctorMedicalLevelExample example);

    DoctorMedicalLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoctorMedicalLevel record, @Param("example") DoctorMedicalLevelExample example);

    int updateByExample(@Param("record") DoctorMedicalLevel record, @Param("example") DoctorMedicalLevelExample example);

    int updateByPrimaryKeySelective(DoctorMedicalLevel record);

    int updateByPrimaryKey(DoctorMedicalLevel record);
}