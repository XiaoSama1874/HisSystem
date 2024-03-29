package com.xiaosama.HisSystem.dao;

import com.xiaosama.HisSystem.pojo.po.DeptCategory;
import com.xiaosama.HisSystem.pojo.po.DeptCategoryExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptCategoryMapper {
    int countByExample(DeptCategoryExample example);

    int deleteByExample(DeptCategoryExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeptCategory record);

    int insertSelective(DeptCategory record);

    List<DeptCategory> selectByExample(DeptCategoryExample example);

    DeptCategory selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeptCategory record, @Param("example") DeptCategoryExample example);

    int updateByExample(@Param("record") DeptCategory record, @Param("example") DeptCategoryExample example);

    int updateByPrimaryKeySelective(DeptCategory record);

    int updateByPrimaryKey(DeptCategory record);
}