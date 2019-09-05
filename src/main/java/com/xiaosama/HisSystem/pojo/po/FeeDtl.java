package com.xiaosama.HisSystem.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class FeeDtl {
    private Integer id;

    private Integer invoiceId;

    private Integer registerId;

    private String feeName;

    private Boolean isMedicine;

    private BigDecimal unitPrice;

    private Integer amount;

    private String payApproach;

    private Date payReturnTime;

    private Integer operatorId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public String getFeeName() {
        return feeName;
    }

    public void setFeeName(String feeName) {
        this.feeName = feeName == null ? null : feeName.trim();
    }

    public Boolean getIsMedicine() {
        return isMedicine;
    }

    public void setIsMedicine(Boolean isMedicine) {
        this.isMedicine = isMedicine;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getPayApproach() {
        return payApproach;
    }

    public void setPayApproach(String payApproach) {
        this.payApproach = payApproach == null ? null : payApproach.trim();
    }

    public Date getPayReturnTime() {
        return payReturnTime;
    }

    public void setPayReturnTime(Date payReturnTime) {
        this.payReturnTime = payReturnTime;
    }

    public Integer getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Integer operatorId) {
        this.operatorId = operatorId;
    }
}