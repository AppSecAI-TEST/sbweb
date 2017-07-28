package com.wtyt.demo.service.impl;

import com.wtyt.demo.bean.DemoSendBean;
import com.wtyt.demo.mapper.DemoMapper;
import com.wtyt.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/2/21.
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

    @Override
    public void insDemoBean(DemoSendBean bean) throws Exception {
        demoMapper.insDemoBean(bean);
    }
}
