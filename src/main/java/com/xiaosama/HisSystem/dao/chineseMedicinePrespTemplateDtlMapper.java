package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.chineseMedicinePrespTemplateDtl;
import com.xiaosama.HisSystem.pojo.po.chineseMedicinePrespTemplateDtlExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface chineseMedicinePrespTemplateDtlMapper {
    int countByExample(chineseMedicinePrespTemplateDtlExample example);

    int deleteByExample(chineseMedicinePrespTemplateDtlExample example);

    int insert(chineseMedicinePrespTemplateDtl record);

    int insertSelective(chineseMedicinePrespTemplateDtl record);

    List<chineseMedicinePrespTemplateDtl> selectByExample(chineseMedicinePrespTemplateDtlExample example);

    int updateByExampleSelective(@Param("record") chineseMedicinePrespTemplateDtl record, @Param("example") chineseMedicinePrespTemplateDtlExample example);

    int updateByExample(@Param("record") chineseMedicinePrespTemplateDtl record, @Param("example") chineseMedicinePrespTemplateDtlExample example);
}