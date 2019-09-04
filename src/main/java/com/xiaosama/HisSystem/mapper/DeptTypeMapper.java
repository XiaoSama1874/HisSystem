package com.xiaosama.HisSystem.mapper;

import com.xiaosama.HisSystem.entity.DeptType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeptTypeMapper {
    public DeptType select(Integer id);

    public void insert(DeptType deptType);
}
