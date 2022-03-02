package com.example.remark.config.interceptor;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface HandlerInterceptor {
    default boolean preHandle(HttpServletRequest request, HttpServletResponse
            response, Object handler)
            throws Exception {
        return true;
    }
    default void postHandle(HttpServletRequest request, HttpServletResponse
            response, Object handler,
                            @Nullable ModelAndView modelAndView) throws Exception {
    }
    default void afterCompletion(HttpServletRequest request,
                                 HttpServletResponse response, Object handler,
                                 @Nullable Exception ex) throws Exception {
    }
}
