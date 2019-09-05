package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.WesternMedicinePrespTemplateDtl;
import com.xiaosama.HisSystem.po.WesternMedicinePrespTemplateDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WesternMedicinePrespTemplateDtlMapper {
    int countByExample(WesternMedicinePrespTemplateDtlExample example);

    int deleteByExample(WesternMedicinePrespTemplateDtlExample example);

    int insert(WesternMedicinePrespTemplateDtl record);

    int insertSelective(WesternMedicinePrespTemplateDtl record);

    List<WesternMedicinePrespTemplateDtl> selectByExample(WesternMedicinePrespTemplateDtlExample example);

    int updateByExampleSelective(@Param("record") WesternMedicinePrespTemplateDtl record, @Param("example") WesternMedicinePrespTemplateDtlExample example);

    int updateByExample(@Param("record") WesternMedicinePrespTemplateDtl record, @Param("example") WesternMedicinePrespTemplateDtlExample example);
}