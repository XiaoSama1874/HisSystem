package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.chineseMedicinePrespTemplateDtl;
import com.xiaosama.HisSystem.po.chineseMedicinePrespTemplateDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface chineseMedicinePrespTemplateDtlMapper {
    int countByExample(chineseMedicinePrespTemplateDtlExample example);

    int deleteByExample(chineseMedicinePrespTemplateDtlExample example);

    int insert(chineseMedicinePrespTemplateDtl record);

    int insertSelective(chineseMedicinePrespTemplateDtl record);

    List<chineseMedicinePrespTemplateDtl> selectByExample(chineseMedicinePrespTemplateDtlExample example);

    int updateByExampleSelective(@Param("record") chineseMedicinePrespTemplateDtl record, @Param("example") chineseMedicinePrespTemplateDtlExample example);

    int updateByExample(@Param("record") chineseMedicinePrespTemplateDtl record, @Param("example") chineseMedicinePrespTemplateDtlExample example);
}