package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.po.DeptType;
import com.xiaosama.HisSystem.po.DeptTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptTypeMapper {
    int countByExample(DeptTypeExample example);

    int deleteByExample(DeptTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeptType record);

    int insertSelective(DeptType record);

    List<DeptType> selectByExample(DeptTypeExample example);

    DeptType selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeptType record, @Param("example") DeptTypeExample example);

    int updateByExample(@Param("record") DeptType record, @Param("example") DeptTypeExample example);

    int updateByPrimaryKeySelective(DeptType record);

    int updateByPrimaryKey(DeptType record);
}