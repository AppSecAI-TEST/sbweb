package com.wtyt.pub.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.wtyt.pub.bean.PubUserBean;

@Controller
public class PubCommController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/")
    public String index(Model model) {
        log.info("进入index");
        PubUserBean pubUserBean = new PubUserBean();
        model.addAttribute("user", pubUserBean);
        log.info("离开index");
        return "/login";
    }

    @RequestMapping("*")
    public String page404() {
        log.info("进入index");
        log.info("离开index");
        return "/404";
    }

    @RequestMapping("logout")
    public String logout(Model model) {
        log.info("进入logout");
        PubUserBean pubUserBean = new PubUserBean();
        model.addAttribute("user", pubUserBean);
        log.info("离开logout");
        return "/login";
    }

    @RequestMapping("left")
    public String left() {
        return "/left";
    }

    @RequestMapping("welcome")
    public String welcome() {
        return "/welcome";
    }
}
