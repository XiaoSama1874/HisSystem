package com.xiaosama.HisSystem.pojo.po;

import java.math.BigDecimal;

public class RegisterLevel {
    private Integer id;

    private String code;

    private String name;

    private Boolean isShowOrder;

    private Integer dayLimit;

    private BigDecimal fee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getIsShowOrder() {
        return isShowOrder;
    }

    public void setIsShowOrder(Boolean isShowOrder) {
        this.isShowOrder = isShowOrder;
    }

    public Integer getDayLimit() {
        return dayLimit;
    }

    public void setDayLimit(Integer dayLimit) {
        this.dayLimit = dayLimit;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }
}