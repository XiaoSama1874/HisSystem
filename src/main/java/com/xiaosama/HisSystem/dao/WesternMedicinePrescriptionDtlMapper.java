package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.WesternMedicinePrescriptionDtl;
import com.xiaosama.HisSystem.po.WesternMedicinePrescriptionDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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