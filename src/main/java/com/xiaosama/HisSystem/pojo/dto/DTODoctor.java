package com.xiaosama.HisSystem.pojo.dto;

public class DTODoctor {
    private Integer id;
    private String dept;
    private String name;
    private String registerLevel;
    private Integer registerFee;

    public DTODoctor(Integer id, String dept, String name, String registerLevel, Integer registerFee) {
        this.id = id;
        this.dept = dept;
        this.name = name;
        this.registerLevel = registerLevel;
        this.registerFee = registerFee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegisterLevel() {
        return registerLevel;
    }

    public void setRegisterLevel(String registerLevel) {
        this.registerLevel = registerLevel;
    }

    public Integer getRegisterFee() {
        return registerFee;
    }

    public void setRegisterFee(Integer registerFee) {
        this.registerFee = registerFee;
    }
}
