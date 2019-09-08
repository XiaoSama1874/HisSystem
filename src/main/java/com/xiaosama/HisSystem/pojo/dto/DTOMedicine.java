package com.xiaosama.HisSystem.pojo.dto;

import java.math.BigDecimal;
import java.util.Date;

public class DTOMedicine {
    private Integer id;

    private String code;

    private String name;

    private String specification;

    private Double unitPrice;

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
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public DTOMedicine(Integer id, String code, String name, String specification, Double unitPrice) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.specification = specification;
        this.unitPrice = unitPrice;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
