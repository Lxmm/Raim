package com.adcc.raim.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by i on 2017/10/13.
 */
@ControllerAdvice
public class ErrorProcessControllerAdvice {
    private static final Logger logger = Logger.getLogger(ErrorProcessControllerAdvice.class);
    /**
     * 统一异常处理
     *
     * @param exception
     *            exception
     * @return
     */
    @ExceptionHandler({ RuntimeException.class })
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public String processException(RuntimeException exception) {
        logger.info("自定义异常处理-RuntimeException");
//        ModelAndView m = new ModelAndView();
//        m.addObject("roncooException", exception.getMessage());
//        m.setViewName("public/error/500");
        return "error/500";  //暂时无法跳转到错误页，此处改为向前端发送字符串
    }

    /**
     * 统一异常处理
     *
     * @param exception
     *            exception
     * @return
     */
    @ExceptionHandler({ Exception.class })
    @ResponseStatus(HttpStatus.OK)
    public ModelAndView processException(Exception exception) {
        logger.info("自定义异常处理-Exception");
        ModelAndView m = new ModelAndView();
        m.addObject("roncooException", exception.getMessage());
        m.setViewName("error/500");
        return m;
    }
}
