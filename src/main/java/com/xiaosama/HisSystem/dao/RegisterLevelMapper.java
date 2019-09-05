package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.RegisterLevel;
import com.xiaosama.HisSystem.pojo.po.RegisterLevelExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RegisterLevelMapper {
    int countByExample(RegisterLevelExample example);

    int deleteByExample(RegisterLevelExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegisterLevel record);

    int insertSelective(RegisterLevel record);

    List<RegisterLevel> selectByExample(RegisterLevelExample example);

    RegisterLevel selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegisterLevel record, @Param("example") RegisterLevelExample example);

    int updateByExample(@Param("record") RegisterLevel record, @Param("example") RegisterLevelExample example);

    int updateByPrimaryKeySelective(RegisterLevel record);

    int updateByPrimaryKey(RegisterLevel record);
}