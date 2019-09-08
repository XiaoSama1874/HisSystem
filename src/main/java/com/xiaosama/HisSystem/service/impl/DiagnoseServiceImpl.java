package com.xiaosama.HisSystem.service.impl;

import com.xiaosama.HisSystem.dao.DiseaseMapper;
import com.xiaosama.HisSystem.dao.MedicineMapper;
import com.xiaosama.HisSystem.dao.PatientMapper;
import com.xiaosama.HisSystem.dao.RegisterInfoMapper;
import com.xiaosama.HisSystem.pojo.dto.DTOMedicine;
import com.xiaosama.HisSystem.pojo.dto.DtoPatient;
import com.xiaosama.HisSystem.pojo.dto.StatusCode;
import com.xiaosama.HisSystem.pojo.po.*;
import com.xiaosama.HisSystem.service.DiagnoseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class DiagnoseServiceImpl implements StatusCode, DiagnoseService {

    @Autowired
    RegisterInfoMapper registerInfoMapper;
    @Autowired
    PatientMapper patientMapper;
    @Autowired
    DiseaseMapper diseaseMapper;
    @Autowired
    MedicineMapper medicineMapper;

    @Override
    public List<DtoPatient> getTodayRegisterInfoByDeptName(String deptName) {
        RegisterInfoExample registerInfoExample=new RegisterInfoExample();

//      获取当天的日期对象 local date 并转化为的date对象
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDate localDate1 = LocalDate.now();
        ZonedDateTime zdt = localDate1.atStartOfDay(zoneId);

        Date now = Date.from(zdt.toInstant());

        registerInfoExample.or().andDeptEqualTo(deptName).andDiagnoseDateEqualTo(now);
        List<RegisterInfo>  registerInfos=registerInfoMapper.selectByExample(registerInfoExample);

        List<DtoPatient> dtoPatients = new ArrayList<>();
        for(RegisterInfo registerInfo:registerInfos){
            Patient respondingPatient = patientMapper.selectByPrimaryKey(registerInfo.getMedicalId());
            Date birthDate=respondingPatient.getBirthDate();


            LocalDate localDate2 = birthDate.toInstant().atZone(zoneId).toLocalDate();
            Integer age = localDate2.until(localDate1).getYears();

            dtoPatients.add(new DtoPatient(registerInfo.getId(),registerInfo.getMedicalId(),registerInfo.getDoctorId(),registerInfo.getDoctorName(),registerInfo.getPatientName(),age,respondingPatient.getSex(),registerInfo.getStatus()));
        }
        return dtoPatients;
    }

    @Override
    public List<Disease> getDiseaseByInitialCode(String initialCode) {
        DiseaseExample diseaseExample=new DiseaseExample();
        diseaseExample.or().andInitialCodeLike("%"+initialCode+"%");
        return diseaseMapper.selectByExample(diseaseExample);
    }

    @Override
    public List<DTOMedicine> getMedicineByNameAndDrugType(String name, String type) {
        MedicineExample medicineExample = new MedicineExample();
        medicineExample.or().andNameLike("%" + name + "%").andDrugTypeEqualTo(type);
        List<Medicine> medicines = medicineMapper.selectByExample(medicineExample);
        List<DTOMedicine> results = new ArrayList<>();
        for (Medicine m :medicines
                ) {
            results.add(new DTOMedicine(m.getId(), m.getCode(), m.getName(), m.getSpecification(), m.getUnitPrice().doubleValue()));

        }
        return results;
    }
}
