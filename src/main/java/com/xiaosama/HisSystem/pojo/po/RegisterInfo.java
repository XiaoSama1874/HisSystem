package com.xiaosama.HisSystem.pojo.po;

import java.util.Date;

public class RegisterInfo {
    private Integer id;

    private Integer medicalId;

    private String patientName;

    private String dept;

    private String registerLevel;

    private Integer doctorId;

    private String doctorName;

    private String settlementType;

    private String status;

    private Boolean isInMorning;

    private Boolean isNeedMedicalBook;

    private Date diagnoseDate;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Integer medicalId) {
        this.medicalId = medicalId;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName == null ? null : patientName.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public String getRegisterLevel() {
        return registerLevel;
    }

    public void setRegisterLevel(String registerLevel) {
        this.registerLevel = registerLevel == null ? null : registerLevel.trim();
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public String getSettlementType() {
        return settlementType;
    }

    public void setSettlementType(String settlementType) {
        this.settlementType = settlementType == null ? null : settlementType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Boolean getIsInMorning() {
        return isInMorning;
    }

    public void setIsInMorning(Boolean isInMorning) {
        this.isInMorning = isInMorning;
    }

    public Boolean getIsNeedMedicalBook() {
        return isNeedMedicalBook;
    }

    public void setIsNeedMedicalBook(Boolean isNeedMedicalBook) {
        this.isNeedMedicalBook = isNeedMedicalBook;
    }

    public Date getDiagnoseDate() {
        return diagnoseDate;
    }

    public void setDiagnoseDate(Date diagnoseDate) {
        this.diagnoseDate = diagnoseDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}