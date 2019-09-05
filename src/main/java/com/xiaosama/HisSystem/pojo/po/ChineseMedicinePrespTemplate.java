package com.xiaosama.HisSystem.pojo.po;

import java.util.Date;

public class ChineseMedicinePrespTemplate {
    private Integer id;

    private Integer creatorId;

    private String creatorName;

    private Date createTime;

    private String name;

    private String category;

    private Integer amount;

    private String useType;

    private String func;

    private String funcDtl;

    private String instruction;

    private String usableRange;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUseType() {
        return useType;
    }

    public void setUseType(String useType) {
        this.useType = useType == null ? null : useType.trim();
    }

    public String getFunc() {
        return func;
    }

    public void setFunc(String func) {
        this.func = func == null ? null : func.trim();
    }

    public String getFuncDtl() {
        return funcDtl;
    }

    public void setFuncDtl(String funcDtl) {
        this.funcDtl = funcDtl == null ? null : funcDtl.trim();
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public String getUsableRange() {
        return usableRange;
    }

    public void setUsableRange(String usableRange) {
        this.usableRange = usableRange == null ? null : usableRange.trim();
    }
}