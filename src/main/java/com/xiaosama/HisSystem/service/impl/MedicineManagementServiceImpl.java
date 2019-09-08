package com.xiaosama.HisSystem.service.impl;

import com.xiaosama.HisSystem.dao.*;
import com.xiaosama.HisSystem.pojo.dto.DTOFeeItem;
import com.xiaosama.HisSystem.pojo.dto.DTOFetchMedicine;
import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.pojo.dto.StatusCode;
import com.xiaosama.HisSystem.pojo.po.*;
import com.xiaosama.HisSystem.service.MedicineManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MedicineManagementServiceImpl implements MedicineManagementService, StatusCode {

    @Autowired
    RegisterInfoMapper registerInfoMapper;
    @Autowired
    WesternMedicinePrescriptionMapper westernMedicinePrescriptionMapper;
    @Autowired
    WesternMedicinePrescriptionDtlMapper westernMedicinePrescriptionDtlMapper;
    @Autowired
    PatientMapper patientMapper;
    @Autowired
    MedicineMapper medicineMapper;
    @Override
    public DataWithStatus getFetchMedicineListByRegisterIdMedicineId(String medicialId, String registerId) {
        //第一步查询 registerInfo 确认medicineId 和 registerId 是不是对应的
        RegisterInfoExample registerInfoExample=new RegisterInfoExample();
        registerInfoExample.or().andMedicalIdEqualTo(Integer.valueOf(medicialId)).andIdEqualTo(Integer.valueOf(registerId));
        boolean exists=registerInfoMapper.selectByExample(registerInfoExample).size()!=0;
        if (!exists){
            //如果不存在返回错误
            return new DataWithStatus(null, FAIL);
        }else{
            //如果存在 查询western_medicine_prescription 和 western_medicine_prescriptionDtl 得到列表
            WesternMedicinePrescriptionExample e1 = new WesternMedicinePrescriptionExample();
            e1.or().andRegisterIdEqualTo(Integer.valueOf(registerId));
            List<WesternMedicinePrescription> prescriptions = westernMedicinePrescriptionMapper.selectByExample(e1);

            List<DTOFetchMedicine> medicines = new ArrayList<>();
            //首先获取该挂号ID开的所有处方
            for (WesternMedicinePrescription w1 :
                    prescriptions) {
                WesternMedicinePrescriptionDtlExample e2 = new WesternMedicinePrescriptionDtlExample();
                e2.or().andPrescriptionIdEqualTo(w1.getId());
                List<WesternMedicinePrescriptionDtl> dtls = westernMedicinePrescriptionDtlMapper.selectByExample(e2);
                //其次获取处方内的所有明细
                for (WesternMedicinePrescriptionDtl w2 :
                        dtls) {

                    medicines.add(new DTOFetchMedicine(w2.getMedicineName(), w2.getAmount(), w1.getName(), w2.getStatus()));
                }
            }
            return new DataWithStatus(medicines, SUCCESS);
        }
    }
    @Override
    public DataWithStatus getFetchFeeItemListByRegisterIdMedicineId(String medicalId, String registerId) {
        //第一步查询 registerInfo 确认medicineId 和 registerId 是不是对应的
        RegisterInfoExample registerInfoExample=new RegisterInfoExample();
        registerInfoExample.or().andMedicalIdEqualTo(Integer.valueOf(medicalId)).andIdEqualTo(Integer.valueOf(registerId));
        boolean exists=registerInfoMapper.selectByExample(registerInfoExample).size()!=0;
        if (!exists){
            //如果不存在返回错误
            return new DataWithStatus(null, FAIL);
        }else{
            //如果存在 查询western_medicine_prescription 和 western_medicine_prescriptionDtl 得到列表
            WesternMedicinePrescriptionExample e1 = new WesternMedicinePrescriptionExample();
            e1.or().andRegisterIdEqualTo(Integer.valueOf(registerId));
            List<WesternMedicinePrescription> prescriptions = westernMedicinePrescriptionMapper.selectByExample(e1);

            List<DTOFeeItem> feeItems = new ArrayList<>();
            //首先获取该挂号ID开的所有处方
            for (WesternMedicinePrescription w1 :
                    prescriptions) {
                WesternMedicinePrescriptionDtlExample e2 = new WesternMedicinePrescriptionDtlExample();
                e2.or().andPrescriptionIdEqualTo(w1.getId());
                List<WesternMedicinePrescriptionDtl> dtls = westernMedicinePrescriptionDtlMapper.selectByExample(e2);
                //其次获取处方内的所有明细
                for (WesternMedicinePrescriptionDtl w2 :
                        dtls) {
                    Medicine m = medicineMapper.selectByPrimaryKey(w2.getMedicineId());
                    feeItems.add(new DTOFeeItem(w2.getMedicineName(), w2.getAmount(), m.getUnitPrice().doubleValue(), "西药", w1.getCreateTime(), w2.getStatus()));
                }
            }
            return new DataWithStatus(feeItems, SUCCESS);
        }
    }
}
