package com.xiaosama.HisSystem.controller;

public class DTOLoginDoctor {
    private Boolean isDoctor;
    private Integer id;
    private String name;
    private String userType;
    private String deptName;
    private String registerLevel;
    private String medicalLevel;

    public DTOLoginDoctor(Boolean isDoctor, Integer id, String name, String userType, String deptName, String registerLevel, String medicalLevel) {
        this.isDoctor = isDoctor;
        this.id = id;
        this.name = name;
        this.userType = userType;
        this.deptName = deptName;
        this.registerLevel = registerLevel;
        this.medicalLevel = medicalLevel;
    }

    public Boolean getDoctor() {
        return isDoctor;
    }

    public void setDoctor(Boolean doctor) {
        isDoctor = doctor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getRegisterLevel() {
        return registerLevel;
    }

    public void setRegisterLevel(String registerLevel) {
        this.registerLevel = registerLevel;
    }

    public String getMedicalLevel() {
        return medicalLevel;
    }

    public void setMedicalLevel(String medicalLevel) {
        this.medicalLevel = medicalLevel;
    }
}
