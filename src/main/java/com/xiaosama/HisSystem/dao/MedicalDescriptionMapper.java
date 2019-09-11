package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.MedicalDescription;
import com.xiaosama.HisSystem.pojo.po.MedicalDescriptionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedicalDescriptionMapper {
    int countByExample(MedicalDescriptionExample example);

    int deleteByExample(MedicalDescriptionExample example);

    int deleteByPrimaryKey(Integer registerId);

    int insert(MedicalDescription record);

    int insertSelective(MedicalDescription record);

    List<MedicalDescription> selectByExample(MedicalDescriptionExample example);

    MedicalDescription selectByPrimaryKey(Integer registerId);

    int updateByExampleSelective(@Param("record") MedicalDescription record, @Param("example") MedicalDescriptionExample example);

    int updateByExample(@Param("record") MedicalDescription record, @Param("example") MedicalDescriptionExample example);

    int updateByPrimaryKeySelective(MedicalDescription record);

    int updateByPrimaryKey(MedicalDescription record);
}