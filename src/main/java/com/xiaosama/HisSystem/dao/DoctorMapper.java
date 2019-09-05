package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.Doctor;
import com.xiaosama.HisSystem.pojo.po.DoctorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DoctorMapper {
    int countByExample(DoctorExample example);

    int deleteByExample(DoctorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Doctor record);

    int insertSelective(Doctor record);

    List<Doctor> selectByExample(DoctorExample example);

    Doctor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByExample(@Param("record") Doctor record, @Param("example") DoctorExample example);

    int updateByPrimaryKeySelective(Doctor record);

    int updateByPrimaryKey(Doctor record);
}