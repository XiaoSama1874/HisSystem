package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.MedicalDescription;
import com.xiaosama.HisSystem.pojo.po.MedicalDescriptionExample;
import com.xiaosama.HisSystem.pojo.po.MedicalDescriptionWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MedicalDescriptionMapper {
    int countByExample(MedicalDescriptionExample example);

    int deleteByExample(MedicalDescriptionExample example);

    int deleteByPrimaryKey(Integer registerId);

    int insert(MedicalDescriptionWithBLOBs record);

    int insertSelective(MedicalDescriptionWithBLOBs record);

    List<MedicalDescriptionWithBLOBs> selectByExampleWithBLOBs(MedicalDescriptionExample example);

    List<MedicalDescription> selectByExample(MedicalDescriptionExample example);

    MedicalDescriptionWithBLOBs selectByPrimaryKey(Integer registerId);

    int updateByExampleSelective(@Param("record") MedicalDescriptionWithBLOBs record, @Param("example") MedicalDescriptionExample example);

    int updateByExampleWithBLOBs(@Param("record") MedicalDescriptionWithBLOBs record, @Param("example") MedicalDescriptionExample example);

    int updateByExample(@Param("record") MedicalDescription record, @Param("example") MedicalDescriptionExample example);

    int updateByPrimaryKeySelective(MedicalDescriptionWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MedicalDescriptionWithBLOBs record);

    int updateByPrimaryKey(MedicalDescription record);
}