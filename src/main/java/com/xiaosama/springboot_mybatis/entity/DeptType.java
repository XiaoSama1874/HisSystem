package com.xiaosama.springboot_mybatis.entity;

public class DeptType {
    public Integer ID;
    public String value;

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

    public DeptType(Integer ID, String value) {
        this.ID = ID;
        this.value = value;
    }
}
