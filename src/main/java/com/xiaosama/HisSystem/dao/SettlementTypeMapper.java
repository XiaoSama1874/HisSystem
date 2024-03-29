package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.SettlementType;
import com.xiaosama.HisSystem.pojo.po.SettlementTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SettlementTypeMapper {
    int countByExample(SettlementTypeExample example);

    int deleteByExample(SettlementTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SettlementType record);

    int insertSelective(SettlementType record);

    List<SettlementType> selectByExample(SettlementTypeExample example);

    SettlementType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SettlementType record, @Param("example") SettlementTypeExample example);

    int updateByExample(@Param("record") SettlementType record, @Param("example") SettlementTypeExample example);

    int updateByPrimaryKeySelective(SettlementType record);

    int updateByPrimaryKey(SettlementType record);
}