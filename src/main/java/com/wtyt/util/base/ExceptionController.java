package com.wtyt.util.base;

import com.wtyt.demo.bean.DemoResultBean;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by zhouxiaoxiao on 17/4/19.
 */
@ControllerAdvice
public class ExceptionController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @ResponseStatus(value= HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public DemoResultBean handleValidationException(BaseException baseException) {
        log.info(baseException.getMessage());
        return  DemoResultBean.build(DemoResultBean.Type.NOT_FOUND,baseException.getMessage());
    }

    @ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public DemoResultBean handleException(Exception exception) {
        log.info(exception.getMessage());
        return DemoResultBean.build(DemoResultBean.Type.SYSTEM_ERR);
    }
}
