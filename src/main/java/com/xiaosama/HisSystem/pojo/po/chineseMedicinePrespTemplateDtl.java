package com.xiaosama.HisSystem.pojo.po;

public class chineseMedicinePrespTemplateDtl {
    private Integer prescriptionId;

    private Integer medicineId;

    private String medicineName;

    private String dosage;

    private String subscript;

    public Integer getPrescriptionId() {
        return prescriptionId;
    }

    public void setPrescriptionId(Integer prescriptionId) {
        this.prescriptionId = prescriptionId;
    }

    public Integer getMedicineId() {
        return medicineId;
    }

    public void setMedicineId(Integer medicineId) {
        this.medicineId = medicineId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage == null ? null : dosage.trim();
    }

    public String getSubscript() {
        return subscript;
    }

    public void setSubscript(String subscript) {
        this.subscript = subscript == null ? null : subscript.trim();
    }
}