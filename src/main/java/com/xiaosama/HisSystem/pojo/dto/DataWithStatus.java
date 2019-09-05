package com.xiaosama.HisSystem.pojo.dto;

public class DataWithStatus {
    Object object;
    Integer status;

    public DataWithStatus(Object object, Integer status) {
        this.object = object;
        this.status = status;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
