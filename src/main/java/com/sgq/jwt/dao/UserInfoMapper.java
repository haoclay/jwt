package com.sgq.jwt.dao;

import com.sgq.jwt.pojo.UserInfo;
import lombok.extern.log4j.Log4j;
import org.springframework.data.repository.query.Param;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : SGQ
 * @create 2021/6/9 11:35
 */

public interface UserInfoMapper {
    /**
     * @Param userInfo
     *
     */

    UserInfo selectUserInfo(UserInfo userInfo);
}
