package com.xiaosama.HisSystem.service.impl;

import com.xiaosama.HisSystem.dao.*;
import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.pojo.dto.DtoDoctor;
import com.xiaosama.HisSystem.pojo.dto.StatusCode;
import com.xiaosama.HisSystem.pojo.po.*;
import com.xiaosama.HisSystem.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class RegisterServiceImpl implements RegisterService, StatusCode {
    @Autowired
    PatientMapper patientMapper;
    @Autowired
    DeptMapper deptMapper ;
    @Autowired
    DoctorMapper doctorMapper ;
    @Autowired
    RegisterLevelMapper registerLevelMapper;
    @Autowired
    SettlementTypeMapper settlementTypeMapper;
    @Autowired
    RegisterInfoMapper registerInfoMapper;

    @Override
    public DataWithStatus getPatientInfoByMedicalId(Integer id) {
        Patient patient=patientMapper.selectByPrimaryKey(id);
        if (patient!=null) {
            return new DataWithStatus(patient, SUCCESS);
        }else{
            return new DataWithStatus(null, FAIL);
        }
    }

    @Override
    public List<String> getAllDepts() {
        List<Dept> depts = deptMapper.all();
        List<String> data=new ArrayList<>();
        for (Dept de :depts
        ) {
            data.add(de.getName());
        }
        return data;
    }

    @Override
    public List<DtoDoctor> getAllDoctors() {
        List<Doctor> doctors = doctorMapper.all();
        List<DtoDoctor> dtoDoctors = new ArrayList<>();
        List<RegisterLevel> registerLevels = registerLevelMapper.all();
        for (Doctor d :
                doctors) {
            Double integer=registerLevels.stream().filter((x)->x.getName().equals(d.getRegisterLevel())).findFirst().get().getFee().doubleValue();
            dtoDoctors.add(new DtoDoctor(d.getId(),d.getDeptName(),d.getRealName(),d.getRegisterLevel(), (int) integer.doubleValue()));
        }
        return dtoDoctors;
    }

    @Override
    public List<String> getAllSettlementType() {
        return settlementTypeMapper.selectByExample(new SettlementTypeExample()).stream().map(SettlementType::getValue).collect(Collectors.toList());
    }
    @Override
    public DataWithStatus addRegisterInfo(RegisterInfo registerInfo){
        Integer a=registerInfoMapper.insertSelective(registerInfo);;
        if (a==1){
            return new DataWithStatus(registerInfo, SUCCESS);
        }else{
            return new DataWithStatus(registerInfo, FAIL);
        }
    }

    @Override
    public DataWithStatus addPatientInfo(Patient patient) {
        Integer a=patientMapper.insertSelective(patient);
        if (a==1){
            return new DataWithStatus(patient, SUCCESS);
        }else{
            return new DataWithStatus(patient, FAIL);
        }

    }
    @Override
    public List<RegisterInfo> getRegisterInfoByMedicalId(Integer id){
        RegisterInfoExample example=new RegisterInfoExample();
        example.or().andMedicalIdEqualTo(id);
        return registerInfoMapper.selectByExample(example);
    }

}
