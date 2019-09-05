package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.MedicineDosageForm;
import com.xiaosama.HisSystem.pojo.po.MedicineDosageFormExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicineDosageFormMapper {
    int countByExample(MedicineDosageFormExample example);

    int deleteByExample(MedicineDosageFormExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicineDosageForm record);

    int insertSelective(MedicineDosageForm record);

    List<MedicineDosageForm> selectByExample(MedicineDosageFormExample example);

    MedicineDosageForm selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicineDosageForm record, @Param("example") MedicineDosageFormExample example);

    int updateByExample(@Param("record") MedicineDosageForm record, @Param("example") MedicineDosageFormExample example);

    int updateByPrimaryKeySelective(MedicineDosageForm record);

    int updateByPrimaryKey(MedicineDosageForm record);
}