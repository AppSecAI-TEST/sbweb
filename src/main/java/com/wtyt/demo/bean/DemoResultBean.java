package com.wtyt.demo.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/2/21.
 */
public class DemoResultBean implements Serializable {
    private static final long serialVersionUID = 1L;

    private int result_code;
    private String result_message;

    public DemoResultBean() {

    }

    public DemoResultBean(int result_code, String result_message) {
        this.result_code = result_code;
        this.result_message = result_message;
    }

    public int getResult_code() {
        return result_code;
    }

    public void setResult_code(int result_code) {
        this.result_code = result_code;
    }

    public String getResult_message() {
        return result_message;
    }

    public void setResult_message(String result_message) {
        this.result_message = result_message;
    }

    public static DemoResultBean build(Type type, String message) {
        DemoResultBean resultBean = new DemoResultBean();
        resultBean.result_code = type.getResult_code();
        resultBean.result_message = message;
        return resultBean;
    }

    public static DemoResultBean build(Type type) {
        DemoResultBean resultBean = new DemoResultBean();
        resultBean.result_code = type.getResult_code();
        resultBean.result_message = type.getResult_message();
        return resultBean;
    }

    public enum Type {

        OK(0, "OK"),
        SYSTEM_ERR(500, "System error"),
        NOT_FOUND(404, "Not found");

        private int result_code;

        private String result_message;

        private int getResult_code() {
            return result_code;
        }

        private void setResult_code(int result_code) {
            this.result_code = result_code;
        }

        private String getResult_message() {
            return result_message;
        }

        private void setResult_message(String result_message) {
            this.result_message = result_message;
        }

        Type(int result_code, String result_message) {
            this.result_code = result_code;
            this.result_message = result_message;
        }
    }
}
