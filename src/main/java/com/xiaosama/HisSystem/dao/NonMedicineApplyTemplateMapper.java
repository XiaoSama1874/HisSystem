package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.NonMedicineApplyTemplate;
import com.xiaosama.HisSystem.po.NonMedicineApplyTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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