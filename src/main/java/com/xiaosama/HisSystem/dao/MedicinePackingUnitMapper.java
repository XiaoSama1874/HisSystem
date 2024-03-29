package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.MedicinePackingUnit;
import com.xiaosama.HisSystem.pojo.po.MedicinePackingUnitExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicinePackingUnitMapper {
    int countByExample(MedicinePackingUnitExample example);

    int deleteByExample(MedicinePackingUnitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MedicinePackingUnit record);

    int insertSelective(MedicinePackingUnit record);

    List<MedicinePackingUnit> selectByExample(MedicinePackingUnitExample example);

    MedicinePackingUnit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MedicinePackingUnit record, @Param("example") MedicinePackingUnitExample example);

    int updateByExample(@Param("record") MedicinePackingUnit record, @Param("example") MedicinePackingUnitExample example);

    int updateByPrimaryKeySelective(MedicinePackingUnit record);

    int updateByPrimaryKey(MedicinePackingUnit record);
}