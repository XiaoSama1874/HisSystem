package com.xiaosama.HisSystem.service;

import com.xiaosama.HisSystem.pojo.dto.DtoDoctor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RegisterServiceImplTest {
    @Autowired
    RegisterService registerService;
    @Test
    public void testGetAllDoctors(){
        List<DtoDoctor> a = registerService.getAllDoctors();
        System.out.println(a);
    }
}
