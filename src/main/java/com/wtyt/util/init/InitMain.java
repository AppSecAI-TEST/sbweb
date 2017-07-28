package com.wtyt.util.init;

import com.wtyt.util.bean.CountiesInfoBean;
import com.wtyt.util.bean.SystemParameterBean;
import com.wtyt.util.mapper.InitMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;

@Component
public class InitMain {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    // 流向map key:城市名 value:CountiesInfoBean
    public static HashMap<String, CountiesInfoBean> cityNameMap = new HashMap<String, CountiesInfoBean>();
    @Autowired
    private InitMapper initMapper;

//    @Override
//    public void run(String... args) throws Exception {
//        log.info("进入InitMain");
//        // 初始化系统参数
//        initSystemParameters();
//        // 初始化城市表信息
//        initCountiesInfo();
//        log.info("离开InitMain");
//    }

    /**
     * 初始化系统参数
     */
    private void initSystemParameters() {
        log.info("进入initSystemParameters");
        try {
            List<SystemParameterBean> list = initMapper.getSysPaList();
            for (SystemParameterBean param : list) {
                System.setProperty(param.getParam_name(),
                        param.getParam_value());
            }
            log.info("initSystemParameters成功");
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            System.exit(0);
        }
        log.info("离开initSystemParameters");
    }

    /**
     * 初始化城市表信息
     */
    private void initCountiesInfo() {
        log.info("进入initCountiesInfo");
        try {
            List<CountiesInfoBean> list = initMapper.getSysCounties();
            for (CountiesInfoBean bean : list) {
                if (bean.getC_level() == 2) {
                    cityNameMap.put(bean.getCity_name(), bean);
                }
            }
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            System.exit(0);
        }
        log.info("离开initCountiesInfo");
    }

}
