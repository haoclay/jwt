package com.sgq.jwt.controller;

import com.sgq.jwt.pojo.UserInfo;
import com.sgq.jwt.service.IUserInfoService;
import com.sgq.jwt.utils.JwtUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : SGQ
 * @create 2021/6/9 12:35
 */
@RestController
@Slf4j
public class UserInfoController {
    @Autowired
    private IUserInfoService userInfoService;

    @GetMapping("/user/login")
    public Map login(UserInfo userInfo){
        System.out.println(userInfo);
        Map resultMap = new HashMap();
        try {
            UserInfo userDB  = userInfoService.login(userInfo);
            Map payload = new HashMap();
            payload.put("id",userDB.getId().toString());
            payload.put("nickname",userDB.getNickname());
            String token = JwtUtil.getToken(payload);
            resultMap.put("token",token);
            resultMap.put("state",true);
            resultMap.put("msg","认证成功");
        } catch (Exception e) {
            resultMap.put("state",false);
            resultMap.put("msg", e.getMessage());

        }
           return resultMap;
    }

    @PostMapping("/find/findAllFriends")
    public Map<String,Object>  findAllFriends(){
        System.out.println("做业务...");
        Map resultMap = new HashMap();
        resultMap.put("state",true);
        resultMap.put("msg","处理成功");
        return resultMap;
    }

    @PostMapping("/user/findGoods")
    public Map<String,Object>  findGoods(){
        System.out.println("做业务...");
        Map resultMap = new HashMap();
        resultMap.put("state",true);
        resultMap.put("msg","处理成功");
        return resultMap;
    }
}
