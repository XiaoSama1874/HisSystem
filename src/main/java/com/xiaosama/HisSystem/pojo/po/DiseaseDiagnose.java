package com.xiaosama.HisSystem.pojo.po;

import java.util.Date;

public class DiseaseDiagnose {
    private Integer registerId;

    private Integer diseaseId;

    private String diseaseName;

    private Boolean isFinalDiagnose;

    private Boolean isWesternDisease;

    private Date happenTime;

    public DiseaseDiagnose(Integer registerId, Integer diseaseId, String diseaseName, Boolean isFinalDiagnose, Boolean isWesternDisease, Date happenTime) {
        this.registerId = registerId;
        this.diseaseId = diseaseId;
        this.diseaseName = diseaseName;
        this.isFinalDiagnose = isFinalDiagnose;
        this.isWesternDisease = isWesternDisease;
        this.happenTime = happenTime;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public Integer getDiseaseId() {
        return diseaseId;
    }

    public void setDiseaseId(Integer diseaseId) {
        this.diseaseId = diseaseId;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public void setDiseaseName(String diseaseName) {
        this.diseaseName = diseaseName == null ? null : diseaseName.trim();
    }

    public Boolean getIsFinalDiagnose() {
        return isFinalDiagnose;
    }

    public void setIsFinalDiagnose(Boolean isFinalDiagnose) {
        this.isFinalDiagnose = isFinalDiagnose;
    }

    public Boolean getIsWesternDisease() {
        return isWesternDisease;
    }

    public void setIsWesternDisease(Boolean isWesternDisease) {
        this.isWesternDisease = isWesternDisease;
    }

    public Date getHappenTime() {
        return happenTime;
    }

    public void setHappenTime(Date happenTime) {
        this.happenTime = happenTime;
    }
}