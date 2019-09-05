package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.MedicineDosageForm;
import com.xiaosama.HisSystem.po.MedicineDosageFormExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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