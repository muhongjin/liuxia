//package com.example.remark.config.interceptor;
//import com.alibaba.druid.util.StringUtils;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.web.servlet.ModelAndView;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@Slf4j
//public  class LoginCheckHandlerInterceptor implements HandlerInterceptor, org.springframework.web.servlet.HandlerInterceptor {
//    @Override public boolean preHandle(HttpServletRequest request,
//                                       HttpServletResponse response, Object handler) throws Exception {
//        log.info("execute LoginCheckHandlerInterceptor's preHandle method");
//        String userId = request.getHeader("userId");
//        if (StringUtils.isEmpty(userId)) {//什么数都行
//            response.setStatus(401);
//            response.getWriter().print("please login");
//            response.getWriter().flush();
//            return false;
//        }
//        return true;
//    }
//    @Override public void postHandle(HttpServletRequest request,
//                                     HttpServletResponse response, Object handler, ModelAndView modelAndView) throws
//            Exception {
//        log.info("execute LoginCheckHandlerInterceptor's postHandle method");
//    }
//    @Override public void afterCompletion(HttpServletRequest request,
//                                          HttpServletResponse response, Object handler, Exception ex) throws Exception {
//        log.info("execute LoginCheckHandlerInterceptor's afterCompletion method");
//    }
//}
