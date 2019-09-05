package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.RegisterInfo;
import com.xiaosama.HisSystem.po.RegisterInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegisterInfoMapper {
    int countByExample(RegisterInfoExample example);

    int deleteByExample(RegisterInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegisterInfo record);

    int insertSelective(RegisterInfo record);

    List<RegisterInfo> selectByExample(RegisterInfoExample example);

    RegisterInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegisterInfo record, @Param("example") RegisterInfoExample example);

    int updateByExample(@Param("record") RegisterInfo record, @Param("example") RegisterInfoExample example);

    int updateByPrimaryKeySelective(RegisterInfo record);

    int updateByPrimaryKey(RegisterInfo record);
}