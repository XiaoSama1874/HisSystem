package com.xiaosama.HisSystem.pojo.po;

public class MedicalDescriptionWithBLOBs extends MedicalDescription {
    private String presentIllnessHistory;

    private String presentIllnessDiagnose;

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
}