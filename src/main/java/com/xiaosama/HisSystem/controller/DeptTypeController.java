//package com.xiaosama.HisSystem.controller;
//
//import com.xiaosama.HisSystem.entity.DeptType;
//import com.xiaosama.HisSystem.mapper.DeptTypeMapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping("/dept")
//public class DeptTypeController {
//    @Autowired
//    DeptTypeMapper mapper;
//
//    @GetMapping("/{id}")
//    public DeptType select(@PathVariable("id")Integer id){
//        return mapper.select(id);
//    }
//
//
//    @GetMapping
//    public DeptType insert(DeptType deptType){
//        mapper.insert(deptType);
//        return deptType;
//    }
//}
