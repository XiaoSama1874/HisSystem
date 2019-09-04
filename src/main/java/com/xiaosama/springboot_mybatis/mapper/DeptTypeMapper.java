package com.xiaosama.springboot_mybatis.mapper;

import com.xiaosama.springboot_mybatis.entity.DeptType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptTypeMapper {
    public DeptType select(Integer id);

    public void insert(DeptType deptType);
}
