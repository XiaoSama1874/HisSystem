package com.xiaosama.HisSystem.controller;

public class DTOLoginUser {
    private Boolean isDoctor;
    private Integer id;
    private String name;
    private String deptName;
    private String userType;

    public DTOLoginUser(Boolean isDoctor, Integer id, String name, String deptName, String userType) {
        this.isDoctor = isDoctor;
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.userType = userType;
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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }
}
