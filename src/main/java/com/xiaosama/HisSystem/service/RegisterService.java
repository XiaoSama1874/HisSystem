package com.xiaosama.HisSystem.service;

import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.pojo.dto.DtoDoctor;
import com.xiaosama.HisSystem.pojo.po.Patient;
import com.xiaosama.HisSystem.pojo.po.RegisterInfo;

import java.util.List;


public interface RegisterService {
    public DataWithStatus getPatientInfoByMedicalId(Integer id);
    public List<String> getAllDepts();
    public List<DtoDoctor> getAllDoctors();
    public List<String> getAllSettlementType();
    public DataWithStatus addRegisterInfo(RegisterInfo registerInfo);
    public Integer addPatientInfo(Patient patient);
    List<RegisterInfo> getRegisterInfoByMedicalId(Integer id);

    List<String> getPayApproach();
}
