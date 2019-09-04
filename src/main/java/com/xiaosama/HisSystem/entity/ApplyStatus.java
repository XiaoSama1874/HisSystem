package com.xiaosama.HisSystem.entity;

public class ApplyStatus {
    private Integer ID;
    private String value;

    public ApplyStatus(Integer ID, String value) {
        this.ID = ID;
        this.value = value;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
