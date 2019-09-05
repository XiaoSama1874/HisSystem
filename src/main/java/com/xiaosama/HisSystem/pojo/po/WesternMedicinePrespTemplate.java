package com.xiaosama.HisSystem.pojo.po;

import java.util.Date;

public class WesternMedicinePrespTemplate {
    private Integer id;

    private String name;

    private Integer creatorId;

    private String creatorName;

    private String usableRange;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(Integer creatorId) {
        this.creatorId = creatorId;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public String getUsableRange() {
        return usableRange;
    }

    public void setUsableRange(String usableRange) {
        this.usableRange = usableRange == null ? null : usableRange.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}