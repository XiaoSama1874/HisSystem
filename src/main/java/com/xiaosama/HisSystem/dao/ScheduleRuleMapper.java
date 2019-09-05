package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.ScheduleRule;
import com.xiaosama.HisSystem.po.ScheduleRuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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