package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.ChineseMedicinePrespTemplate;
import com.xiaosama.HisSystem.pojo.po.ChineseMedicinePrespTemplateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChineseMedicinePrespTemplateMapper {
    int countByExample(ChineseMedicinePrespTemplateExample example);

    int deleteByExample(ChineseMedicinePrespTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ChineseMedicinePrespTemplate record);

    int insertSelective(ChineseMedicinePrespTemplate record);

    List<ChineseMedicinePrespTemplate> selectByExample(ChineseMedicinePrespTemplateExample example);

    ChineseMedicinePrespTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ChineseMedicinePrespTemplate record, @Param("example") ChineseMedicinePrespTemplateExample example);

    int updateByExample(@Param("record") ChineseMedicinePrespTemplate record, @Param("example") ChineseMedicinePrespTemplateExample example);

    int updateByPrimaryKeySelective(ChineseMedicinePrespTemplate record);

    int updateByPrimaryKey(ChineseMedicinePrespTemplate record);
}