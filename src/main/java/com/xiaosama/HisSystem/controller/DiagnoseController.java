package com.xiaosama.HisSystem.controller;

import com.xiaosama.HisSystem.pojo.dto.DTODiseaseDiagnose;
import com.xiaosama.HisSystem.pojo.dto.DTOMedicine;
import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.pojo.dto.DtoPatient;
import com.xiaosama.HisSystem.pojo.po.Disease;
import com.xiaosama.HisSystem.pojo.po.MedicalDescription;
import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrescription;
import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrescriptionDtl;
import com.xiaosama.HisSystem.pojo.vo.VODDiagnose;
import com.xiaosama.HisSystem.service.DiagnoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
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
    public List<Disease> getDiseaseByInitialCode(@PathVariable("initial_code") String initial_code) {
        return diagnoseService.getDiseaseByInitialCode(initial_code);
    }

    @GetMapping("/medicine/{type}/{name}")
    public List<DTOMedicine> getMedicineByNameAndDrugType(@PathVariable("name") String name, @PathVariable("type") String type) {
        return diagnoseService.getMedicineByNameAndDrugType(name, type);
    }

    @PostMapping("/medicalDescription")
    public Integer addMedicalDescription(@RequestBody MedicalDescription medicalDescription) {
        return diagnoseService.addMedicalDescription(medicalDescription);
    }

    @PostMapping("/diagnose")
    public Integer addDiagnose(@RequestBody VODDiagnose vodDiagnose) {
        return diagnoseService.addDiagnose(vodDiagnose);
    }

    @GetMapping("/diagnose/{registerId}")
    public ArrayList<DTODiseaseDiagnose> getDiagnose(@PathVariable("registerId") Integer registerId) {
        return diagnoseService.getDiagnose(registerId);
    }

    @GetMapping("/westernPresp/{registerId}")
    public List<WesternMedicinePrescription> getWesternPresp(@PathVariable("registerId") Integer registerId) {
        return diagnoseService.getWesternPresp(registerId);
    }

    @PostMapping("/westernPresp")
    public DataWithStatus addWesternPresp(@RequestBody WesternMedicinePrescription westernMedicinePrescription) {
        return diagnoseService.addWesternPresp(westernMedicinePrescription);
    }

    @GetMapping("/westernPrespDtl/{prescriptionId}")
    public List<WesternMedicinePrescriptionDtl> getWesterPrespDtl(@PathVariable("prescriptionId") Integer prescriptionId) {
        return diagnoseService.getWesterPrespDtl(prescriptionId);
    }

    @PostMapping("/westernPrespDtl")
    public DataWithStatus addWesterPrespDtl(@RequestBody WesternMedicinePrescriptionDtl westernMedicinePrescriptionDtl) {
        return diagnoseService.addWesternPrespDtl(westernMedicinePrescriptionDtl);
    }
}