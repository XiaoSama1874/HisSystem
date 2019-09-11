package com.xiaosama.HisSystem.pojo.po;

public class MedicalDescription {
    private Integer registerId;

    private String chiefComplaint;

    private String presentIllnessHistory;

    private String presentIllnessDiagnose;

    private String pastHistory;

    private String allergicHistory;

    private String physicalExamination;

    private String checkAdvice;

    private String announcement;

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public String getChiefComplaint() {
        return chiefComplaint;
    }

    public void setChiefComplaint(String chiefComplaint) {
        this.chiefComplaint = chiefComplaint == null ? null : chiefComplaint.trim();
    }

    public String getPresentIllnessHistory() {
        return presentIllnessHistory;
    }

    public void setPresentIllnessHistory(String presentIllnessHistory) {
        this.presentIllnessHistory = presentIllnessHistory == null ? null : presentIllnessHistory.trim();
    }

    public String getPresentIllnessDiagnose() {
        return presentIllnessDiagnose;
    }

    public void setPresentIllnessDiagnose(String presentIllnessDiagnose) {
        this.presentIllnessDiagnose = presentIllnessDiagnose == null ? null : presentIllnessDiagnose.trim();
    }

    public String getPastHistory() {
        return pastHistory;
    }

    public void setPastHistory(String pastHistory) {
        this.pastHistory = pastHistory == null ? null : pastHistory.trim();
    }

    public String getAllergicHistory() {
        return allergicHistory;
    }

    public void setAllergicHistory(String allergicHistory) {
        this.allergicHistory = allergicHistory == null ? null : allergicHistory.trim();
    }

    public String getPhysicalExamination() {
        return physicalExamination;
    }

    public void setPhysicalExamination(String physicalExamination) {
        this.physicalExamination = physicalExamination == null ? null : physicalExamination.trim();
    }

    public String getCheckAdvice() {
        return checkAdvice;
    }

    public void setCheckAdvice(String checkAdvice) {
        this.checkAdvice = checkAdvice == null ? null : checkAdvice.trim();
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement == null ? null : announcement.trim();
    }
}