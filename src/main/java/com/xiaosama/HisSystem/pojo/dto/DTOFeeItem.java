package com.xiaosama.HisSystem.pojo.dto;

import java.util.Date;

public class DTOFeeItem {
    public String name;
    public Integer amount;
    public Double unitPrice;
    public String type;
    public Date createTime;
    public String status;

    public DTOFeeItem(String name, Integer amount, Double unitPrice, String type, Date createTime, String status) {
        this.name = name;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.type = type;
        this.createTime = createTime;
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

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
