package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.ChineseMedicinePrescription;
import com.xiaosama.HisSystem.po.ChineseMedicinePrescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChineseMedicinePrescriptionMapper {
    int countByExample(ChineseMedicinePrescriptionExample example);

    int deleteByExample(ChineseMedicinePrescriptionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChineseMedicinePrescription record);

    int insertSelective(ChineseMedicinePrescription record);

    List<ChineseMedicinePrescription> selectByExample(ChineseMedicinePrescriptionExample example);

    ChineseMedicinePrescription selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChineseMedicinePrescription record, @Param("example") ChineseMedicinePrescriptionExample example);

    int updateByExample(@Param("record") ChineseMedicinePrescription record, @Param("example") ChineseMedicinePrescriptionExample example);

    int updateByPrimaryKeySelective(ChineseMedicinePrescription record);

    int updateByPrimaryKey(ChineseMedicinePrescription record);
}