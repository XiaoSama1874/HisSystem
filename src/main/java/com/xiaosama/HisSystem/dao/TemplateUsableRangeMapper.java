package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.TemplateUsableRange;
import com.xiaosama.HisSystem.pojo.po.TemplateUsableRangeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TemplateUsableRangeMapper {
    int countByExample(TemplateUsableRangeExample example);

    int deleteByExample(TemplateUsableRangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TemplateUsableRange record);

    int insertSelective(TemplateUsableRange record);

    List<TemplateUsableRange> selectByExample(TemplateUsableRangeExample example);

    TemplateUsableRange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TemplateUsableRange record, @Param("example") TemplateUsableRangeExample example);

    int updateByExample(@Param("record") TemplateUsableRange record, @Param("example") TemplateUsableRangeExample example);

    int updateByPrimaryKeySelective(TemplateUsableRange record);

    int updateByPrimaryKey(TemplateUsableRange record);
}