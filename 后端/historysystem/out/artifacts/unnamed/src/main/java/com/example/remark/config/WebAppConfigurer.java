package com.example.remark.config;
import com.example.remark.config.interceptor.LogProcessTimeHandlerInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
@Configuration
public class WebAppConfigurer implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LogProcessTimeHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/register");
       // registry.addInterceptor(new LoginCheckHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/login","/register");
    }
}