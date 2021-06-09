package com.sgq.jwt.config;

import com.sgq.jwt.interceptors.JwtInterceptors;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created by IntelliJ IDEA.
 *
 * @Author : SGQ
 * @create 2021/6/9 13:32
 */
@Configuration
public class JwtInterceptorConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new JwtInterceptors())
                .addPathPatterns("/**")
                .excludePathPatterns("/user/**");
    }
}
