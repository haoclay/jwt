package com.sgq.jwt.utils;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.Verification;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : SGQ
 * @create 2021/6/8 14:47
 */
public class JwtUtil {
    private static final String SIGNATURE= "q!W@e#g%%&ddf^";

    public static String getToken(Map<String,String> map){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,7);

        HashMap<String, Object> headMap = new HashMap<>();
        JWTCreator.Builder builder = JWT.create();
        builder.withHeader(headMap);

        map.forEach((k,v)->{
            builder.withClaim(k,v);
        });

        return builder.withExpiresAt(calendar.getTime())
         .sign(Algorithm.HMAC256(SIGNATURE));

    }

    public static DecodedJWT verify(String token){

      return JWT.require(Algorithm.HMAC256(SIGNATURE)).build().verify(token);

    }
}
