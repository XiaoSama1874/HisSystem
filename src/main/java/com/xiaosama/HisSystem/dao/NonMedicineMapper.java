package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.NonMedicine;
import com.xiaosama.HisSystem.po.NonMedicineExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NonMedicineMapper {
    int countByExample(NonMedicineExample example);

    int deleteByExample(NonMedicineExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NonMedicine record);

    int insertSelective(NonMedicine record);

    List<NonMedicine> selectByExample(NonMedicineExample example);

    NonMedicine selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NonMedicine record, @Param("example") NonMedicineExample example);

    int updateByExample(@Param("record") NonMedicine record, @Param("example") NonMedicineExample example);

    int updateByPrimaryKeySelective(NonMedicine record);

    int updateByPrimaryKey(NonMedicine record);
}