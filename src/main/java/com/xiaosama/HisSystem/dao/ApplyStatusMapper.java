package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.ApplyStatus;
import com.xiaosama.HisSystem.pojo.po.ApplyStatusExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplyStatusMapper {
    int countByExample(ApplyStatusExample example);

    int deleteByExample(ApplyStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ApplyStatus record);

    int insertSelective(ApplyStatus record);

    List<ApplyStatus> selectByExample(ApplyStatusExample example);

    ApplyStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ApplyStatus record, @Param("example") ApplyStatusExample example);

    int updateByExample(@Param("record") ApplyStatus record, @Param("example") ApplyStatusExample example);

    int updateByPrimaryKeySelective(ApplyStatus record);

    int updateByPrimaryKey(ApplyStatus record);
}