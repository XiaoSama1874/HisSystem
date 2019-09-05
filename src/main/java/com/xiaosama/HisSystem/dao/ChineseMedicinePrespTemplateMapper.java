package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.ChineseMedicinePrespTemplate;
import com.xiaosama.HisSystem.po.ChineseMedicinePrespTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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