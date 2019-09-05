package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrescription;
import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrescriptionExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WesternMedicinePrescriptionMapper {
    int countByExample(WesternMedicinePrescriptionExample example);

    int deleteByExample(WesternMedicinePrescriptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WesternMedicinePrescription record);

    int insertSelective(WesternMedicinePrescription record);

    List<WesternMedicinePrescription> selectByExample(WesternMedicinePrescriptionExample example);

    WesternMedicinePrescription selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WesternMedicinePrescription record, @Param("example") WesternMedicinePrescriptionExample example);

    int updateByExample(@Param("record") WesternMedicinePrescription record, @Param("example") WesternMedicinePrescriptionExample example);

    int updateByPrimaryKeySelective(WesternMedicinePrescription record);

    int updateByPrimaryKey(WesternMedicinePrescription record);
}