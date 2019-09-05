package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.PrescriptionStatus;
import com.xiaosama.HisSystem.po.PrescriptionStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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