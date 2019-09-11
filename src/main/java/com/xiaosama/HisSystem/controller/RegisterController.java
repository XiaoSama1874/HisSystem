package com.xiaosama.HisSystem.controller;

import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.pojo.dto.DTODoctor;
import com.xiaosama.HisSystem.pojo.po.Patient;
import com.xiaosama.HisSystem.pojo.po.RegisterInfo;
import com.xiaosama.HisSystem.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins="*")
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
    public List<DTODoctor> getAllDoctors(){
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
    @PostMapping("/patient")
    public Integer addPatient(@RequestBody Patient patient){
        return  registerService.addPatientInfo(patient);
    }

    @GetMapping("/registerInfo/{medicalId}")
    public List<RegisterInfo> getRegisterInfoByMedicalId(@PathVariable("medicalId") Integer medicalId){
        return registerService.getRegisterInfoByMedicalId(medicalId);
    }
    @GetMapping("/payApproach")
    public List<String> getPayApproach(){
        return registerService.getPayApproach();
    }
}
