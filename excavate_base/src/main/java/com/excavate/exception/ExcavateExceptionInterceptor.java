package com.excavate.exception;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExcavateExceptionInterceptor implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("redirect:/exception.jsp");
       modelAndView.addObject("message",e.getMessage());
        return modelAndView;
    }
}
