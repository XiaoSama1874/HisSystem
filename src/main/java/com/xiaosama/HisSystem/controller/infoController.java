package com.xiaosama.HisSystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class infoController {
    @Autowired
    JdbcTemplate template;

    @RequestMapping("/applyStatuses")
    @ResponseBody
    public Map<String,Object> showAllApplyStatus(){
        List<Map<String, Object>> a = template.queryForList("select * from apply_status");
        return a.get(0);
    }
}
