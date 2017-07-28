package com.wtyt.demo.mapper;

import com.wtyt.demo.bean.DemoSendBean;
import org.springframework.stereotype.Repository;

/**
 * Created by Administrator on 2017/2/21.
 */
@Repository
public interface DemoMapper {

    void insDemoBean(DemoSendBean bean);
}
