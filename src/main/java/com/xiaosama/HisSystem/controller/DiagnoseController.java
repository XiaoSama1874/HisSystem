package com.xiaosama.HisSystem.controller;

import com.xiaosama.HisSystem.pojo.dto.DTOMedicine;
import com.xiaosama.HisSystem.pojo.dto.DtoPatient;
import com.xiaosama.HisSystem.pojo.po.Disease;
import com.xiaosama.HisSystem.service.DiagnoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.util.List;

@RestController
public class DiagnoseController {
    @Autowired
    DiagnoseService diagnoseService;

    @GetMapping("/register")
    public List<DtoPatient> getPatientListByDeptAndDate(String deptName) throws ParseException {
        return diagnoseService.getTodayRegisterInfoByDeptName(deptName);
    }

    @GetMapping("/disease/{initial_code}")
    public List<Disease> getDiseaseByInitialCode(@PathVariable("initial_code") String initial_code){
        return diagnoseService.getDiseaseByInitialCode(initial_code);
    }

    @GetMapping("/medicine/{type}/{name}")
    public List<DTOMedicine> getMedicineByNameAndDrugType(@PathVariable("name") String name,@PathVariable("type") String type){
        return diagnoseService.getMedicineByNameAndDrugType(name, type);
    }


}
