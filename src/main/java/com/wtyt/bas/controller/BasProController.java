package com.wtyt.bas.controller;

import com.wtyt.bas.bean.BasProBean;
import com.wtyt.bas.service.BasProService;
import com.wtyt.util.base.BaseController;
import com.wtyt.util.common.SbConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("bas")
public class BasProController extends BaseController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BasProService basProService;

    /**
     * 查询产品列表
     *
     * @return
     */
    @RequestMapping("/pro")
    public String querypro(ModelMap modelMap, BasProBean bean) {
        log.info("进入queryPro");
        try {
            log.info("pro_name:" + bean.getPro_name());
            log.info("pro_code:" + bean.getPro_code());
            basProService.queryBasPro(bean);
            modelMap.addAttribute("proBean", bean);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            modelMap.addAttribute("info", SbConstants.SYS_EXCEPTION);
            return EXCEPTION_PAGE;
        } finally {
            log.info("离开queryPro");
        }
        return "/bas/bas_pro";
    }

    /**
     * 进入新增产品页面
     *
     * @return
     */
    @RequestMapping("/goinspro")
    public String goinspro(ModelMap modelMap) {
        log.info("进入goinspro");
        log.info("离开goinspro");
        return "/bas/bas_pro_add";
    }

    /**
     * 新增产品
     *
     * @return
     */
    @RequestMapping("/inspro")
    @ResponseBody
    public Map<String, Object> inspro(BasProBean bean) {
        log.info("进入inspro");
        log.info("pro_name:" + bean.getPro_name());
        log.info("pro_code:" + bean.getPro_code());
        Map<String, Object> ajaxMap = new HashMap<String, Object>();
        try {
            basProService.insBasPro(bean);
            ajaxMap.put("res", "suc");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            ajaxMap.put("res", "err");
            ajaxMap.put("msg", SbConstants.SYS_EXCEPTION);
            ajaxMap.put("info", SbConstants.SYS_EXCEPTION);
            return ajaxMap;
        } finally {
            log.info("离开inspro");
        }
        return ajaxMap;
    }

    /**
     * 新增产品-用异常来测试事物
     *
     * @return
     */
    @RequestMapping("/insproerr")
    @ResponseBody
    public Map<String, Object> insproerr(BasProBean bean) {
        log.info("进入inspro");
        log.info("pro_name:" + bean.getPro_name());
        log.info("pro_code:" + bean.getPro_code());
        Map<String, Object> ajaxMap = new HashMap<String, Object>();
        try {
            basProService.insBasProErr(bean);
            ajaxMap.put("res", "suc");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            ajaxMap.put("res", "err");
            ajaxMap.put("msg", SbConstants.SYS_EXCEPTION);
            ajaxMap.put("info", SbConstants.SYS_EXCEPTION);
            return ajaxMap;
        } finally {
            log.info("离开inspro");
        }
        return ajaxMap;
    }

    /**
     * 删除产品
     *
     * @return
     */
    @RequestMapping("/delpro/{id}")
    @ResponseBody
    public Map<String, Object> delBasPro(@PathVariable String id) {
        log.info("进入delBasPro");
        BasProBean bean = new BasProBean();
        bean.setId(Integer.valueOf(id));
        Map<String, Object> ajaxMap = new HashMap<String, Object>();
        try {
            basProService.delBasPro(bean);
            ajaxMap.put("res", "suc");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            ajaxMap.put("res", "err");
            ajaxMap.put("info", SbConstants.SYS_EXCEPTION);
            return ajaxMap;
        } finally {
            log.info("离开delBasPro");
        }
        return ajaxMap;
    }

}
