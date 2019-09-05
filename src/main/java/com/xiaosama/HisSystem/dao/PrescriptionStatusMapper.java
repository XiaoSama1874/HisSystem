package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.PrescriptionStatus;
import com.xiaosama.HisSystem.pojo.po.PrescriptionStatusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PrescriptionStatusMapper {
    int countByExample(PrescriptionStatusExample example);

    int deleteByExample(PrescriptionStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PrescriptionStatus record);

    int insertSelective(PrescriptionStatus record);

    List<PrescriptionStatus> selectByExample(PrescriptionStatusExample example);

    PrescriptionStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PrescriptionStatus record, @Param("example") PrescriptionStatusExample example);

    int updateByExample(@Param("record") PrescriptionStatus record, @Param("example") PrescriptionStatusExample example);

    int updateByPrimaryKeySelective(PrescriptionStatus record);

    int updateByPrimaryKey(PrescriptionStatus record);
}