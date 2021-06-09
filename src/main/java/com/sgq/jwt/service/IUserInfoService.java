package com.sgq.jwt.service;

import com.sgq.jwt.dao.UserInfoMapper;
import com.sgq.jwt.pojo.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : SGQ
 * @create 2021/6/9 12:04
 */


public interface IUserInfoService {

    UserInfo login(UserInfo userInfo);

}
