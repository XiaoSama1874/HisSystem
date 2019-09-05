package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.ChineseMedicinePrescriptionDtl;
import com.xiaosama.HisSystem.pojo.po.ChineseMedicinePrescriptionDtlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChineseMedicinePrescriptionDtlMapper {
    int countByExample(ChineseMedicinePrescriptionDtlExample example);

    int deleteByExample(ChineseMedicinePrescriptionDtlExample example);

    int deleteByPrimaryKey(Integer prescriptionId);

    int insert(ChineseMedicinePrescriptionDtl record);

    int insertSelective(ChineseMedicinePrescriptionDtl record);

    List<ChineseMedicinePrescriptionDtl> selectByExample(ChineseMedicinePrescriptionDtlExample example);

    ChineseMedicinePrescriptionDtl selectByPrimaryKey(Integer prescriptionId);

    int updateByExampleSelective(@Param("record") ChineseMedicinePrescriptionDtl record, @Param("example") ChineseMedicinePrescriptionDtlExample example);

    int updateByExample(@Param("record") ChineseMedicinePrescriptionDtl record, @Param("example") ChineseMedicinePrescriptionDtlExample example);

    int updateByPrimaryKeySelective(ChineseMedicinePrescriptionDtl record);

    int updateByPrimaryKey(ChineseMedicinePrescriptionDtl record);
}