package com.sgq.jwt.service.impl;

import com.sgq.jwt.dao.UserInfoMapper;
import com.sgq.jwt.pojo.UserInfo;
import com.sgq.jwt.service.IUserInfoService;
import lombok.extern.log4j.Log4j;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : SGQ
 * @create 2021/6/9 12:05
 */
@Service
public class UserInfoServiceImpl implements IUserInfoService {
    @Autowired
    private UserInfoMapper mapper;

     @Override
     public UserInfo login(UserInfo userInfo){

      UserInfo userDB = mapper.selectUserInfo(userInfo);
         if(userDB!=null){
             return userDB;
         }
         throw new RuntimeException("登陆失败");
    }
}
