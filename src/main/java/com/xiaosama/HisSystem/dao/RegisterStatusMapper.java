package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.RegisterStatus;
import com.xiaosama.HisSystem.po.RegisterStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegisterStatusMapper {
    int countByExample(RegisterStatusExample example);

    int deleteByExample(RegisterStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RegisterStatus record);

    int insertSelective(RegisterStatus record);

    List<RegisterStatus> selectByExample(RegisterStatusExample example);

    RegisterStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RegisterStatus record, @Param("example") RegisterStatusExample example);

    int updateByExample(@Param("record") RegisterStatus record, @Param("example") RegisterStatusExample example);

    int updateByPrimaryKeySelective(RegisterStatus record);

    int updateByPrimaryKey(RegisterStatus record);
}