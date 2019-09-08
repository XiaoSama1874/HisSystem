package com.xiaosama.HisSystem.pojo.dto;

public class DtoPatient {
    public Integer registerId;
    public Integer medicalId;
    public Integer doctorId;
    public String doctorName;
    public String name;
    public Integer age;
    public String sex;
    public String status;

    public DtoPatient(Integer registerId, Integer medicalId, Integer doctorId, String doctorName, String name, Integer age, String sex, String status) {
        this.registerId = registerId;
        this.medicalId = medicalId;
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.status = status;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public Integer getMedicalId() {
        return medicalId;
    }

    public void setMedicalId(Integer medicalId) {
        this.medicalId = medicalId;
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
        this.doctorName = doctorName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
