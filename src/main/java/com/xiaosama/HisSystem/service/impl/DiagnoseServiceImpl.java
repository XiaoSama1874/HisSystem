package com.xiaosama.HisSystem.service.impl;

import com.xiaosama.HisSystem.dao.*;
import com.xiaosama.HisSystem.pojo.dto.*;
import com.xiaosama.HisSystem.pojo.po.*;
import com.xiaosama.HisSystem.pojo.vo.VODDiagnose;
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
public class DiagnoseServiceImpl implements  DiagnoseService,StatusCode {

    @Autowired
    RegisterInfoMapper registerInfoMapper;
    @Autowired
    PatientMapper patientMapper;
    @Autowired
    DiseaseMapper diseaseMapper;
    @Autowired
    MedicineMapper medicineMapper;
    @Autowired
    MedicalDescriptionMapper medicalDescriptionMapper;
    @Autowired
    DiseaseDiagnoseMapper diseaseDiagnoseMapper;
    @Autowired
    WesternMedicinePrescriptionMapper westernMedicinePrescriptionMapper;
    @Autowired
    WesternMedicinePrescriptionDtlMapper westernMedicinePrescriptionDtlMapper;

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

    @Override
    public Integer addMedicalDescription(MedicalDescription medicalDescription) {
        int result = medicalDescriptionMapper.insertSelective(medicalDescription);
        //同时修改状态
        RegisterInfo registerInfo=new RegisterInfo();
        registerInfo.setStatus("已诊");
        registerInfo.setId(medicalDescription.getRegisterId());
        registerInfoMapper.updateByPrimaryKeySelective(registerInfo);

        if (result == 1) {
            return SUCCESS;
        }else{
            return FAIL;
        }
    }

    @Override
    public Integer addDiagnose(VODDiagnose vodDiagnose){
        Boolean isWesternDisease= vodDiagnose.diagnoseType.equals("西医");
        Boolean isFinalDiagnose = vodDiagnose.type.equals("终诊");
        int result = diseaseDiagnoseMapper.insertSelective(new DiseaseDiagnose(Integer.parseInt(vodDiagnose.getRegisterId()), Integer.parseInt(vodDiagnose.getDiseaseId()), vodDiagnose.getName(), isFinalDiagnose, isWesternDisease, new Date()));
        if (result==1){
            return SUCCESS;
        }else{
            return FAIL;
        }
    }
    @Override
    public ArrayList<DTODiseaseDiagnose> getDiagnose(Integer registerId){
        diseaseDiagnoseExample e1=new diseaseDiagnoseExample();
        e1.or().andRegisterIdEqualTo(registerId);
        List<DiseaseDiagnose> diseaseDiagnoses = diseaseDiagnoseMapper.selectByExample(e1);
        ArrayList<DTODiseaseDiagnose> results = new ArrayList<>();
        Disease disease;
        for (DiseaseDiagnose d :
                diseaseDiagnoses) {
            disease = diseaseMapper.selectByPrimaryKey(d.getDiseaseId());
            results.add(new DTODiseaseDiagnose(d.getDiseaseId(), disease.getInitialCode(), disease.getName(), disease.getIcdCode(), disease.getCategory(), d.getIsFinalDiagnose() ? "终诊" : "初诊", d.getHappenTime()));
        }
        return results;
    }
    @Override
    public List<WesternMedicinePrescription> getWesternPresp(Integer registerId){
        WesternMedicinePrescriptionExample westernMedicinePrescriptionExample = new WesternMedicinePrescriptionExample();
        westernMedicinePrescriptionExample.or().andRegisterIdEqualTo(registerId);
        return westernMedicinePrescriptionMapper.selectByExample(westernMedicinePrescriptionExample);
    }

    @Override
    public DataWithStatus addWesternPresp(WesternMedicinePrescription westernMedicinePrescription) {
        westernMedicinePrescription.setCreateTime(new Date());

        int i = westernMedicinePrescriptionMapper.insertSelective(westernMedicinePrescription);
        if (i==1){
            return new DataWithStatus(westernMedicinePrescription.getId(),SUCCESS);
        }else{
            return new DataWithStatus(westernMedicinePrescription.getId(),FAIL);
        }
    }
    @Override
    public List<WesternMedicinePrescriptionDtl> getWesterPrespDtl(Integer prescriptionId){
        WesternMedicinePrescriptionDtlExample e1 = new WesternMedicinePrescriptionDtlExample();
        e1.or().andPrescriptionIdEqualTo(prescriptionId);
        return westernMedicinePrescriptionDtlMapper.selectByExample(e1);
    }

    @Override
    public DataWithStatus addWesternPrespDtl(WesternMedicinePrescriptionDtl westernMedicinePrescriptionDtl) {
        int i = westernMedicinePrescriptionDtlMapper.insertSelective(westernMedicinePrescriptionDtl);
        if(i==1){
            return new DataWithStatus(westernMedicinePrescriptionDtl.getId(), SUCCESS);
        }else{
            return new DataWithStatus(westernMedicinePrescriptionDtl.getId(), FAIL);
        }
    }
}
