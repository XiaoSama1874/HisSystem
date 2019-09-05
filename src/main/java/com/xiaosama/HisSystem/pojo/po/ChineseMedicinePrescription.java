package com.xiaosama.HisSystem.pojo.po;

import java.util.Date;

public class ChineseMedicinePrescription {
    private Integer id;

    private Integer registerId;

    private Date createTime;

    private String name;

    private String category;

    private Integer amount;

    private String frequency;

    private String status;

    private String useType;

    private String func;

    private String instruction;

    private String subscript;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegisterId() {
        return registerId;
    }

    public void setRegisterId(Integer registerId) {
        this.registerId = registerId;
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

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency == null ? null : frequency.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction == null ? null : instruction.trim();
    }

    public String getSubscript() {
        return subscript;
    }

    public void setSubscript(String subscript) {
        this.subscript = subscript == null ? null : subscript.trim();
    }
}