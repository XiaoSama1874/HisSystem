package com.xiaosama.HisSystem.service;

import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;

public interface  LoginService {
    DataWithStatus login(String username, String password);
}
