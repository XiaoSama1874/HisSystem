package com.xiaosama.HisSystem.pojo.po;

import java.math.BigDecimal;
import java.util.Date;

public class Medicine {
    private Integer id;

    private String code;

    private String name;

    private String specification;

    private String packingUnit;

    private BigDecimal unitPrice;

    private String manuerfacture;

    private String dosageForm;

    private String drugType;

    private Date createTime;

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

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public String getPackingUnit() {
        return packingUnit;
    }

    public void setPackingUnit(String packingUnit) {
        this.packingUnit = packingUnit == null ? null : packingUnit.trim();
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getManuerfacture() {
        return manuerfacture;
    }

    public void setManuerfacture(String manuerfacture) {
        this.manuerfacture = manuerfacture == null ? null : manuerfacture.trim();
    }

    public String getDosageForm() {
        return dosageForm;
    }

    public void setDosageForm(String dosageForm) {
        this.dosageForm = dosageForm == null ? null : dosageForm.trim();
    }

    public String getDrugType() {
        return drugType;
    }

    public void setDrugType(String drugType) {
        this.drugType = drugType == null ? null : drugType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}