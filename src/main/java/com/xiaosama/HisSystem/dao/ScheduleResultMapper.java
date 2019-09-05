package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.ScheduleResult;
import com.xiaosama.HisSystem.po.ScheduleResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleResultMapper {
    int countByExample(ScheduleResultExample example);

    int deleteByExample(ScheduleResultExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScheduleResult record);

    int insertSelective(ScheduleResult record);

    List<ScheduleResult> selectByExample(ScheduleResultExample example);

    ScheduleResult selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScheduleResult record, @Param("example") ScheduleResultExample example);

    int updateByExample(@Param("record") ScheduleResult record, @Param("example") ScheduleResultExample example);

    int updateByPrimaryKeySelective(ScheduleResult record);

    int updateByPrimaryKey(ScheduleResult record);
}