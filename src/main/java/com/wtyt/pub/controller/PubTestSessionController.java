package com.wtyt.pub.controller;

import com.wtyt.util.common.SbConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"sa", SbConstants.ORG_KEY})
public class PubTestSessionController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("ts1")
    public String ts1(ModelMap modelMap) {
        log.info("进入ts1");
        try {
            modelMap.addAttribute("sa", "user1");
            modelMap.addAttribute(SbConstants.ORG_KEY, "org1");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }
        log.info("离开ts1");
        return "se";
    }

    @RequestMapping("ts2")
    public String ts2(@ModelAttribute("sa") String sb1,
                      @ModelAttribute(SbConstants.ORG_KEY) String sb2) {
        log.info("进入ts2");
        log.info("sb_user:" + sb1);
        log.info("sb_org:" + sb2);
        log.info("离开ts2");
        return "se";
    }

}
