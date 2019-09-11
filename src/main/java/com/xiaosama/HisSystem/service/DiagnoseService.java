package com.xiaosama.HisSystem.service;

import com.xiaosama.HisSystem.pojo.dto.DTODiseaseDiagnose;
import com.xiaosama.HisSystem.pojo.dto.DTOMedicine;
import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.pojo.dto.DtoPatient;
import com.xiaosama.HisSystem.pojo.po.Disease;
import com.xiaosama.HisSystem.pojo.po.MedicalDescription;
import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrescription;
import com.xiaosama.HisSystem.pojo.po.WesternMedicinePrescriptionDtl;
import com.xiaosama.HisSystem.pojo.vo.VODDiagnose;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public interface DiagnoseService {
    List<DtoPatient> getTodayRegisterInfoByDeptName(String deptName) throws ParseException;
    List<Disease> getDiseaseByInitialCode(String initialCode);

    List<DTOMedicine> getMedicineByNameAndDrugType(String name, String type);

    Integer addMedicalDescription(MedicalDescription medicalDescription);

    Integer addDiagnose(VODDiagnose vodDiagnose);

    ArrayList<DTODiseaseDiagnose> getDiagnose(Integer registerId);

    List<WesternMedicinePrescription> getWesternPresp(Integer registerId);
    DataWithStatus addWesternPresp(WesternMedicinePrescription westernMedicinePrescription);

    List<WesternMedicinePrescriptionDtl> getWesterPrespDtl(Integer prescriptionId);

    DataWithStatus addWesternPrespDtl(WesternMedicinePrescriptionDtl westernMedicinePrescriptionDtl);
}
