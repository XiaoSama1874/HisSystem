package com.xiaosama.HisSystem.po;

import java.util.Date;

public class NonMedicineApply {
    private Integer registerId;

    private Integer nonMedicineId;

    private String name;

    private String request;

    private String checkPart;

    private Boolean isEmergent;

    private Date createTime;

    private Integer inspectorId;

    private String inspectorName;

    private Date checkTime;

    private String checkResult;

    private String checkType;

    private String status;

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
    }

    public Integer getNonMedicineId() {
        return nonMedicineId;
    }

    public void setNonMedicineId(Integer nonMedicineId) {
        this.nonMedicineId = nonMedicineId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request == null ? null : request.trim();
    }

    public String getCheckPart() {
        return checkPart;
    }

    public void setCheckPart(String checkPart) {
        this.checkPart = checkPart == null ? null : checkPart.trim();
    }

    public Boolean getIsEmergent() {
        return isEmergent;
    }

    public void setIsEmergent(Boolean isEmergent) {
        this.isEmergent = isEmergent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getInspectorId() {
        return inspectorId;
    }

    public void setInspectorId(Integer inspectorId) {
        this.inspectorId = inspectorId;
    }

    public String getInspectorName() {
        return inspectorName;
    }

    public void setInspectorName(String inspectorName) {
        this.inspectorName = inspectorName == null ? null : inspectorName.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult == null ? null : checkResult.trim();
    }

    public String getCheckType() {
        return checkType;
    }

    public void setCheckType(String checkType) {
        this.checkType = checkType == null ? null : checkType.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}