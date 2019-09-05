package com.xiaosama.HisSystem.pojo.po;

import java.util.Date;

public class ScheduleResult {
    private Integer id;

    private String doctorName;

    private Boolean isInMorning;

    private String ruleName;

    private String dept;

    private Date scheduleDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName == null ? null : doctorName.trim();
    }

    public Boolean getIsInMorning() {
        return isInMorning;
    }

    public void setIsInMorning(Boolean isInMorning) {
        this.isInMorning = isInMorning;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    public Date getScheduleDate() {
        return scheduleDate;
    }

    public void setScheduleDate(Date scheduleDate) {
        this.scheduleDate = scheduleDate;
    }
}