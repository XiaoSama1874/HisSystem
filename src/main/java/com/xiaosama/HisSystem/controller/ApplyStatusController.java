package com.xiaosama.HisSystem.controller;

import com.xiaosama.HisSystem.dao.ApplyStatusMapper;
import com.xiaosama.HisSystem.po.ApplyStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//restful 风格
@RestController
@RequestMapping("/apply_status")
public class ApplyStatusController {
    @Autowired
    ApplyStatusMapper mapper;
//    //得到所有数据
//    @GetMapping("/all")
//    public List<ApplyStatus> all(){
//
//
//    }
    //得到单个数据
    @GetMapping("/{id}")
    public ApplyStatus select(@PathVariable("id")Integer ID){
         return mapper.selectByPrimaryKey(ID);
    }
//
//    @GetMapping
//    public ApplyStatus insert(ApplyStatus applyStatus){
//        mapper.insert(applyStatus);
//        return applyStatus;
//    }

//    //更新数据
//    @PutMapping
//    public void update(ApplyStatus applyStatus){
//        mapper.update(applyStatus);
//    }
//    //删除数据
//    @DeleteMapping("/{id}")
//    public ApplyStatus delete(@PathVariable("id") Integer Id){
//        return mapper.delete(Id);
//    }
}
