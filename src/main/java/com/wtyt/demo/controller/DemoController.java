package com.wtyt.demo.controller;

import com.wtyt.demo.bean.DemoResultBean;
import com.wtyt.demo.bean.DemoSendBean;
import com.wtyt.demo.service.DemoService;
import com.wtyt.util.base.BaseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2017/2/21.
 */
@Controller
@RequestMapping("user")
public class DemoController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/getUser", method = RequestMethod.GET)
    public Object getUser(@RequestParam("code") String code) throws Exception {
        log.info("进入getUser");
        log.info("a:" + code);
        throw new BaseException("BaseException异常全局处理");
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    @ResponseBody
    public Object addUser(@RequestBody DemoSendBean bean) throws Exception {
        log.info("进入addUser");
        log.info("xxxxxxx:" + bean.getPro_name() + bean.getPro_code());
        return bean;
    }

    /**
     * 需要特殊处理的异常可以在Controller这样声明
     * 异常抛出后会首先在Controller里有ExceptionHandler注解的方法里执行
     */
    @ExceptionHandler(NullPointerException.class)
    public DemoResultBean controllerExceptionHandler(Exception e) {
        log.info(e.getMessage());
        return DemoResultBean.build(DemoResultBean.Type.SYSTEM_ERR);
    }
}
