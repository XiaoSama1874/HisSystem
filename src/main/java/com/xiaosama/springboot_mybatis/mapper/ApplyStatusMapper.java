package com.xiaosama.springboot_mybatis.mapper;

import com.xiaosama.springboot_mybatis.entity.ApplyStatus;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ApplyStatusMapper {
    @Select("select * from apply_status")
    public List<ApplyStatus> all();
    @Select("select * from apply_status where id=${ID}")
    public ApplyStatus select(Integer ID);
    @Delete("delete from apply_status where id=#{ID}")
    public ApplyStatus delete(Integer ID);

    @Options(useGeneratedKeys = true, keyProperty = "ID")
    @Insert("insert into apply_status values(null,#{value})")
    public int insert(ApplyStatus applyStatus);

    @Update("update apply_status set value=#{value} where id=#{ID}")
    public void update(ApplyStatus applyStatus);

}
