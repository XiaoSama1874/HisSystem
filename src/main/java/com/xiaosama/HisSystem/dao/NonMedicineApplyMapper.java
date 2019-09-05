package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.NonMedicineApply;
import com.xiaosama.HisSystem.pojo.po.NonMedicineApplyExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NonMedicineApplyMapper {
    int countByExample(NonMedicineApplyExample example);

    int deleteByExample(NonMedicineApplyExample example);

    int insert(NonMedicineApply record);

    int insertSelective(NonMedicineApply record);

    List<NonMedicineApply> selectByExample(NonMedicineApplyExample example);

    int updateByExampleSelective(@Param("record") NonMedicineApply record, @Param("example") NonMedicineApplyExample example);

    int updateByExample(@Param("record") NonMedicineApply record, @Param("example") NonMedicineApplyExample example);
}