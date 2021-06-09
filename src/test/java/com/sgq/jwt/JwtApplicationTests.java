package com.sgq.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;


class JwtApplicationTests {

    @Test
    void t1() {

        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE,20);
        Map map = new HashMap();

        String token = JWT.create().withHeader(map)
                .withClaim("userName","sgq")
                .withClaim("userId",197221)
                .withExpiresAt(calendar.getTime())
                .sign(Algorithm.HMAC256("%g5^78B&%Vg*&"));

        System.out.println(token);

    }
@Test
    void test2(){
        JWTVerifier jWTVerifier =  JWT.require(Algorithm.HMAC256("%g5^78B&%Vg*&")).build();
        DecodedJWT verify = jWTVerifier.verify("eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyTmFtZSI6InNncSIsImV4cCI6MTYyNDg2Mjc2NywidXNlcklkIjoxOTcyMjF9.pBzUXr6KeHoUWYMt3eeSxSQtbaRwOrdoFmJ1vNbWtGQ");
        String name = verify.getClaim("userName").asString();
        Integer id = verify.getClaim("userId").asInt();
        System.out.println("name:"+name+"  id:"+id);
    }

}
