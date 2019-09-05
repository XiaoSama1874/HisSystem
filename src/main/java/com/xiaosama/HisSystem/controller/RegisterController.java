package com.xiaosama.HisSystem.controller;

import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.pojo.dto.DtoDoctor;
import com.xiaosama.HisSystem.pojo.po.RegisterInfo;
import com.xiaosama.HisSystem.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RegisterController {
    @Autowired
    RegisterService registerService;
    @RequestMapping("/patient/{id}")
    public DataWithStatus getPatientInfoByMedicalId(@PathVariable("id") Integer id){
        return registerService.getPatientInfoByMedicalId(id);
    }
    @RequestMapping("/dept/all")
    public List<String> getAllDepts(){
        return registerService.getAllDepts();
    }
    @RequestMapping("/doctor/all")
    public List<DtoDoctor> getAllDoctors(){
        return registerService.getAllDoctors();
    }
    @RequestMapping("/settlementType/all")
    public List<String> getAllSettlementType() {
        return registerService.getAllSettlementType();
    }
    @PostMapping("/registerInfo")
    public DataWithStatus addRegisterInfo(@RequestBody RegisterInfo registerInfo){
        return  registerService.addRegisterInfo(registerInfo);
    }
    @GetMapping("/registerInfo/{medicalId}")
    public List<RegisterInfo> getRegisterInfoByMedicalId(@PathVariable("medicalId") Integer medicalId){
        return registerService.getRegisterInfoByMedicalId(medicalId);
    }
}
