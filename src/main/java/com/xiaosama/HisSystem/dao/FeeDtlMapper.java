package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.FeeDtl;
import com.xiaosama.HisSystem.po.FeeDtlExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FeeDtlMapper {
    int countByExample(FeeDtlExample example);

    int deleteByExample(FeeDtlExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FeeDtl record);

    int insertSelective(FeeDtl record);

    List<FeeDtl> selectByExample(FeeDtlExample example);

    FeeDtl selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FeeDtl record, @Param("example") FeeDtlExample example);

    int updateByExample(@Param("record") FeeDtl record, @Param("example") FeeDtlExample example);

    int updateByPrimaryKeySelective(FeeDtl record);

    int updateByPrimaryKey(FeeDtl record);
}