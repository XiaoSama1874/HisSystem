package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.NonMedicineApplyTemplateDtl;
import com.xiaosama.HisSystem.po.NonMedicineApplyTemplateDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NonMedicineApplyTemplateDtlMapper {
    int countByExample(NonMedicineApplyTemplateDtlExample example);

    int deleteByExample(NonMedicineApplyTemplateDtlExample example);

    int insert(NonMedicineApplyTemplateDtl record);

    int insertSelective(NonMedicineApplyTemplateDtl record);

    List<NonMedicineApplyTemplateDtl> selectByExample(NonMedicineApplyTemplateDtlExample example);

    int updateByExampleSelective(@Param("record") NonMedicineApplyTemplateDtl record, @Param("example") NonMedicineApplyTemplateDtlExample example);

    int updateByExample(@Param("record") NonMedicineApplyTemplateDtl record, @Param("example") NonMedicineApplyTemplateDtlExample example);
}