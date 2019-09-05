package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.ScheduleRule;
import com.xiaosama.HisSystem.pojo.po.ScheduleRuleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ScheduleRuleMapper {
    int countByExample(ScheduleRuleExample example);

    int deleteByExample(ScheduleRuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScheduleRule record);

    int insertSelective(ScheduleRule record);

    List<ScheduleRule> selectByExample(ScheduleRuleExample example);

    ScheduleRule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScheduleRule record, @Param("example") ScheduleRuleExample example);

    int updateByExample(@Param("record") ScheduleRule record, @Param("example") ScheduleRuleExample example);

    int updateByPrimaryKeySelective(ScheduleRule record);

    int updateByPrimaryKey(ScheduleRule record);
}