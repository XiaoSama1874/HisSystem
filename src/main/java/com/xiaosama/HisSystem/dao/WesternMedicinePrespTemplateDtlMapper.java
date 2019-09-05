package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrespTemplateDtl;
import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrespTemplateDtlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WesternMedicinePrespTemplateDtlMapper {
    int countByExample(WesternMedicinePrespTemplateDtlExample example);

    int deleteByExample(WesternMedicinePrespTemplateDtlExample example);

    int insert(WesternMedicinePrespTemplateDtl record);

    int insertSelective(WesternMedicinePrespTemplateDtl record);

    List<WesternMedicinePrespTemplateDtl> selectByExample(WesternMedicinePrespTemplateDtlExample example);

    int updateByExampleSelective(@Param("record") WesternMedicinePrespTemplateDtl record, @Param("example") WesternMedicinePrespTemplateDtlExample example);

    int updateByExample(@Param("record") WesternMedicinePrespTemplateDtl record, @Param("example") WesternMedicinePrespTemplateDtlExample example);
}