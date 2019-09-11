package com.xiaosama.HisSystem.pojo.dto;

import java.util.Date;

public class DTODiseaseDiagnose {
     private Integer id;
     private String initialCode;
     private String name;
     private String icdCode;
     private String category;
     private String type;
     private Date createTime;

    public DTODiseaseDiagnose(Integer id, String initialCode, String name, String icdCode, String category, String type, Date createTime) {
        this.id = id;
        this.initialCode = initialCode;
        this.name = name;
        this.icdCode = icdCode;
        this.category = category;
        this.type = type;
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInitialCode() {
        return initialCode;
    }

    public void setInitialCode(String initialCode) {
        this.initialCode = initialCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcdCode() {
        return icdCode;
    }

    public void setIcdCode(String icdCode) {
        this.icdCode = icdCode;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
}
