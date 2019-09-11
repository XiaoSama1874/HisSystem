package com.xiaosama.HisSystem.service.impl;

import com.xiaosama.HisSystem.controller.DTOLoginDoctor;
import com.xiaosama.HisSystem.controller.DTOLoginUser;
import com.xiaosama.HisSystem.dao.DoctorMapper;
import com.xiaosama.HisSystem.dao.UserMapper;
import com.xiaosama.HisSystem.pojo.dto.DataWithStatus;
import com.xiaosama.HisSystem.pojo.dto.StatusCode;
import com.xiaosama.HisSystem.pojo.po.Doctor;
import com.xiaosama.HisSystem.pojo.po.DoctorExample;
import com.xiaosama.HisSystem.pojo.po.User;
import com.xiaosama.HisSystem.pojo.po.UserExample;
import com.xiaosama.HisSystem.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements  LoginService,StatusCode {
    @Autowired
    UserMapper userMapper;
    @Autowired
    DoctorMapper doctorMapper;
    @Override
    public DataWithStatus login(String username,String password){
        UserExample userExample = new UserExample();
        userExample.or().andUserNameEqualTo(username).andUserPasswordEqualTo(password);
        List<User> users = userMapper.selectByExample(userExample);

        if (users.size()!=0){
            //说明登录的用户不是医生是普通用户
            User user=users.get(0);
            return new DataWithStatus( new DTOLoginUser(false,user.getId(), user.getRealName(), user.getDeptName(), user.getUserType()),USER_LOGIN_SUCESS);
        }else{
            DoctorExample doctorExample = new DoctorExample();
            doctorExample.or().andUserNameEqualTo(username).andUserPasswordEqualTo(password);
            List<Doctor> doctors = doctorMapper.selectByExample(doctorExample);
            if (doctors.size()!=0){
                Doctor doctor = doctors.get(0);
                return new DataWithStatus(new DTOLoginDoctor(true, doctor.getId(), doctor.getRealName(), doctor.getUserType(), doctor.getDeptName(), doctor.getRegisterLevel(), doctor.getMedicalLevel()),DOCTOR_LOGIN_SUCCESS);
            }else{
                return new DataWithStatus(null, FAIL);
            }
        }
    }
}
