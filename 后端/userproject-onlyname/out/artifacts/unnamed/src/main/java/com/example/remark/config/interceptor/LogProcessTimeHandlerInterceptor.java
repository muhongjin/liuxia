package com.example.remark.config.interceptor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class LogProcessTimeHandlerInterceptor implements HandlerInterceptor, org.springframework.web.servlet.HandlerInterceptor {
    ThreadLocal<Long> processTimeThreadLocal = new ThreadLocal<>();

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        log.info("execute LogProcessTimeHandlerInterceptor's preHandle method");
        long beginTime = System.currentTimeMillis();
        processTimeThreadLocal.set(beginTime);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler, ModelAndView modelAndView) throws
            Exception {
        log.info("execute LogProcessTimeHandlerInterceptor's postHandle method");
    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("execute LogProcessTimeHandlerInterceptor's afterCompletion method");
        long endTime = System.currentTimeMillis();
        long processTime = endTime - processTimeThreadLocal.get();
        log.info("this request process time={} ms", processTime);
    }
}

