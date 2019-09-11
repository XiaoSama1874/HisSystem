package com.xiaosama.HisSystem.pojo.vo;

import java.util.Date;

public class VODDiagnose {
    public String registerId;
    public String diseaseId;
    public String name;
    public String initialCode;
    public String icdCode;
    public String category;

    public String type;
    //传入的是
    public String diagnoseType;

    public VODDiagnose(String registerId, String diseaseId, String name, String initialCode, String icdCode, String category, String type, String diagnoseType) {
        this.registerId = registerId;
        this.diseaseId = diseaseId;
        this.name = name;
        this.initialCode = initialCode;
        this.icdCode = icdCode;
        this.category = category;
        this.type = type;
        this.diagnoseType = diagnoseType;
    }

    public String getRegisterId() {
        return registerId;
    }

    public void setRegisterId(String registerId) {
        this.registerId = registerId;
    }

    public String getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(String diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInitialCode() {
        return initialCode;
    }

    public void setInitialCode(String initialCode) {
        this.initialCode = initialCode;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDiagnoseType() {
        return diagnoseType;
    }

    public void setDiagnoseType(String diagnoseType) {
        this.diagnoseType = diagnoseType;
    }
}

