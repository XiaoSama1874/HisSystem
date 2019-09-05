package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrescriptionDtl;
import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrescriptionDtlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WesternMedicinePrescriptionDtlMapper {
    int countByExample(WesternMedicinePrescriptionDtlExample example);

    int deleteByExample(WesternMedicinePrescriptionDtlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WesternMedicinePrescriptionDtl record);

    int insertSelective(WesternMedicinePrescriptionDtl record);

    List<WesternMedicinePrescriptionDtl> selectByExample(WesternMedicinePrescriptionDtlExample example);

    WesternMedicinePrescriptionDtl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WesternMedicinePrescriptionDtl record, @Param("example") WesternMedicinePrescriptionDtlExample example);

    int updateByExample(@Param("record") WesternMedicinePrescriptionDtl record, @Param("example") WesternMedicinePrescriptionDtlExample example);

    int updateByPrimaryKeySelective(WesternMedicinePrescriptionDtl record);

    int updateByPrimaryKey(WesternMedicinePrescriptionDtl record);
}