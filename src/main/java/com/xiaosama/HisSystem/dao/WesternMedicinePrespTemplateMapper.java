package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.WesternMedicinePrespTemplate;
import com.xiaosama.HisSystem.po.WesternMedicinePrespTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WesternMedicinePrespTemplateMapper {
    int countByExample(WesternMedicinePrespTemplateExample example);

    int deleteByExample(WesternMedicinePrespTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WesternMedicinePrespTemplate record);

    int insertSelective(WesternMedicinePrespTemplate record);

    List<WesternMedicinePrespTemplate> selectByExample(WesternMedicinePrespTemplateExample example);

    WesternMedicinePrespTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WesternMedicinePrespTemplate record, @Param("example") WesternMedicinePrespTemplateExample example);

    int updateByExample(@Param("record") WesternMedicinePrespTemplate record, @Param("example") WesternMedicinePrespTemplateExample example);

    int updateByPrimaryKeySelective(WesternMedicinePrespTemplate record);

    int updateByPrimaryKey(WesternMedicinePrespTemplate record);
}