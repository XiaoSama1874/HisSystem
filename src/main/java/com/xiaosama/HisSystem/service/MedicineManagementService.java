package com.xiaosama.HisSystem.service;

import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;

public interface MedicineManagementService {
    public DataWithStatus getFetchMedicineListByRegisterIdMedicineId(String MedicineId, String RegisterId);

    DataWithStatus getFetchFeeItemListByRegisterIdMedicineId(String medicalId, String registerId);
}
