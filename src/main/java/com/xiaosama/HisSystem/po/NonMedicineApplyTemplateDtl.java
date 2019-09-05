package com.xiaosama.HisSystem.po;

public class NonMedicineApplyTemplateDtl {
    private Integer templateId;

    private Integer applyId;

    private String applyType;

    private String name;

    private String request;

    private String checkPart;

    private Boolean isEmergent;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public Integer getApplyId() {
        return applyId;
    }

    public void setApplyId(Integer applyId) {
        this.applyId = applyId;
    }

    public String getApplyType() {
        return applyType;
    }

    public void setApplyType(String applyType) {
        this.applyType = applyType == null ? null : applyType.trim();
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
}