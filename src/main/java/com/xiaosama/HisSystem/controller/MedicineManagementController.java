package com.xiaosama.HisSystem.controller;

import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.service.MedicineManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineManagementController {
    @Autowired
    MedicineManagementService medicineManagementService;

    @GetMapping("/fetchMedicine")
    public DataWithStatus getFetchMedicineListByRegisterIdMedicineId(String medicalId, String registerId) {
        return medicineManagementService.getFetchMedicineListByRegisterIdMedicineId(medicalId, registerId);
    }
    @GetMapping("/fetchFeeItem")
    public DataWithStatus getFetchFeeItem(String medicalId,String registerId){
        return medicineManagementService.getFetchFeeItemListByRegisterIdMedicineId(medicalId, registerId);
    }
}