package com.wtyt.demo.bean;


import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/21.
 */
public class DemoSendBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private String pro_name;
    
    @JSONField(serialize=false)//将bean转为json时需要该注解指定字段
    private String pro_code;

    public String getPro_name() {
        return pro_name;
    }

    public void setPro_name(String pro_name) {
        this.pro_name = pro_name;
    }

    public String getPro_code() {
        return pro_code;
    }

    public void setPro_code(String pro_code) {
        this.pro_code = pro_code;
    }
}
