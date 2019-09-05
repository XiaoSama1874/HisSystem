package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.chinesePrescriptionCategory;
import com.xiaosama.HisSystem.po.chinesePrescriptionCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface chinesePrescriptionCategoryMapper {
    int countByExample(chinesePrescriptionCategoryExample example);

    int deleteByExample(chinesePrescriptionCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(chinesePrescriptionCategory record);

    int insertSelective(chinesePrescriptionCategory record);

    List<chinesePrescriptionCategory> selectByExample(chinesePrescriptionCategoryExample example);

    chinesePrescriptionCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") chinesePrescriptionCategory record, @Param("example") chinesePrescriptionCategoryExample example);

    int updateByExample(@Param("record") chinesePrescriptionCategory record, @Param("example") chinesePrescriptionCategoryExample example);

    int updateByPrimaryKeySelective(chinesePrescriptionCategory record);

    int updateByPrimaryKey(chinesePrescriptionCategory record);
}