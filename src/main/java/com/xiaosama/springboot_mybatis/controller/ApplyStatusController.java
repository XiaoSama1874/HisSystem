package com.xiaosama.springboot_mybatis.controller;

import com.xiaosama.springboot_mybatis.entity.ApplyStatus;
import com.xiaosama.springboot_mybatis.mapper.ApplyStatusMapper;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;


//restful 风格
@RestController
@RequestMapping("/apply_status")
public class ApplyStatusController {
    @Autowired
    ApplyStatusMapper mapper;
    //得到所有数据
    @GetMapping("/all")
    public List<ApplyStatus> all(){
        return mapper.all();
    }
    //得到单个数据
    @GetMapping("/{id}")
    public ApplyStatus select(@PathVariable("id")Integer ID){
        return mapper.select(ID);
    }

    @GetMapping
    public ApplyStatus insert(ApplyStatus applyStatus){
        mapper.insert(applyStatus);
        return applyStatus;
    }

    //更新数据
    @PutMapping
    public void update(ApplyStatus applyStatus){
        mapper.update(applyStatus);
    }
    //删除数据
    @DeleteMapping("/{id}")
    public ApplyStatus delete(@PathVariable("id") Integer Id){
        return mapper.delete(Id);
    }
}
