package com.xiaosama.HisSystem.pojo.po;

public class Doctor {
    private Integer id;

    private String userName;

    private String userPassword;

    private String realName;

    private String deptName;

    private String userType;

    private String medicalLevel;

    private String registerLevel;

    private Boolean isJoinSchedule;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public String getMedicalLevel() {
        return medicalLevel;
    }

    public void setMedicalLevel(String medicalLevel) {
        this.medicalLevel = medicalLevel == null ? null : medicalLevel.trim();
    }

    public String getRegisterLevel() {
        return registerLevel;
    }

    public void setRegisterLevel(String registerLevel) {
        this.registerLevel = registerLevel == null ? null : registerLevel.trim();
    }

    public Boolean getIsJoinSchedule() {
        return isJoinSchedule;
    }

    public void setIsJoinSchedule(Boolean isJoinSchedule) {
        this.isJoinSchedule = isJoinSchedule;
    }
}