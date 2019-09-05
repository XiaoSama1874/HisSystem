package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.NonMedicineApplyTemplate;
import com.xiaosama.HisSystem.pojo.po.NonMedicineApplyTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface NonMedicineApplyTemplateMapper {
    int countByExample(NonMedicineApplyTemplateExample example);

    int deleteByExample(NonMedicineApplyTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NonMedicineApplyTemplate record);

    int insertSelective(NonMedicineApplyTemplate record);

    List<NonMedicineApplyTemplate> selectByExample(NonMedicineApplyTemplateExample example);

    NonMedicineApplyTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NonMedicineApplyTemplate record, @Param("example") NonMedicineApplyTemplateExample example);

    int updateByExample(@Param("record") NonMedicineApplyTemplate record, @Param("example") NonMedicineApplyTemplateExample example);

    int updateByPrimaryKeySelective(NonMedicineApplyTemplate record);

    int updateByPrimaryKey(NonMedicineApplyTemplate record);
}