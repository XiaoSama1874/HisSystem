package com.xiaosama.HisSystem.service;

import com.xiaosama.HisSystem.pojo.dto.DTOMedicine;
import com.xiaosama.HisSystem.pojo.dto.DtoPatient;
import com.xiaosama.HisSystem.pojo.po.Disease;

import java.text.ParseException;
import java.util.List;

public interface DiagnoseService {
    List<DtoPatient> getTodayRegisterInfoByDeptName(String deptName) throws ParseException;
    List<Disease> getDiseaseByInitialCode(String initialCode);

    List<DTOMedicine> getMedicineByNameAndDrugType(String name, String type);
}
