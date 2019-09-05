package com.xiaosama.HisSystem.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class Invoice {
    private Integer number;

    private Integer registerId;

    private Integer operatorId;

    private BigDecimal money;

    private Date payReturnTime;

    private String payApproach;

    private Integer rushRedNumber;

    private String feeCategory;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public Date getPayReturnTime() {
        return payReturnTime;
    }

    public void setPayReturnTime(Date payReturnTime) {
        this.payReturnTime = payReturnTime;
    }

    public String getPayApproach() {
        return payApproach;
    }

    public void setPayApproach(String payApproach) {
        this.payApproach = payApproach == null ? null : payApproach.trim();
    }

    public Integer getRushRedNumber() {
        return rushRedNumber;
    }

    public void setRushRedNumber(Integer rushRedNumber) {
        this.rushRedNumber = rushRedNumber;
    }

    public String getFeeCategory() {
        return feeCategory;
    }

    public void setFeeCategory(String feeCategory) {
        this.feeCategory = feeCategory == null ? null : feeCategory.trim();
    }
}