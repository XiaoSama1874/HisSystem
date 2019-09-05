package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.DailySettlement;
import com.xiaosama.HisSystem.pojo.po.DailySettlementExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DailySettlementMapper {
    int countByExample(DailySettlementExample example);

    int deleteByExample(DailySettlementExample example);

    int insert(DailySettlement record);

    int insertSelective(DailySettlement record);

    List<DailySettlement> selectByExample(DailySettlementExample example);

    int updateByExampleSelective(@Param("record") DailySettlement record, @Param("example") DailySettlementExample example);

    int updateByExample(@Param("record") DailySettlement record, @Param("example") DailySettlementExample example);
}