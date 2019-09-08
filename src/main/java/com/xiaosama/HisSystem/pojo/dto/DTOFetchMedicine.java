package com.xiaosama.HisSystem.pojo.dto;

public class DTOFetchMedicine {
    public String name;
    public Integer amount;
    public String prescriptionName;
    public String status;

    public DTOFetchMedicine(String name, Integer amount, String prescriptionName, String status) {
        this.name = name;
        this.amount = amount;
        this.prescriptionName = prescriptionName;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPrescriptionName() {
        return prescriptionName;
    }

    public void setPrescriptionName(String prescriptionName) {
        this.prescriptionName = prescriptionName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
