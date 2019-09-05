package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.NonMedicineApplyTemplateDtl;
import com.xiaosama.HisSystem.pojo.po.NonMedicineApplyTemplateDtlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NonMedicineApplyTemplateDtlMapper {
    int countByExample(NonMedicineApplyTemplateDtlExample example);

    int deleteByExample(NonMedicineApplyTemplateDtlExample example);

    int insert(NonMedicineApplyTemplateDtl record);

    int insertSelective(NonMedicineApplyTemplateDtl record);

    List<NonMedicineApplyTemplateDtl> selectByExample(NonMedicineApplyTemplateDtlExample example);

    int updateByExampleSelective(@Param("record") NonMedicineApplyTemplateDtl record, @Param("example") NonMedicineApplyTemplateDtlExample example);

    int updateByExample(@Param("record") NonMedicineApplyTemplateDtl record, @Param("example") NonMedicineApplyTemplateDtlExample example);
}