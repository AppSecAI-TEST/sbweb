package com.wtyt.util.bean;

public class CountiesInfoBean {
    private String county_no;
    private String county_name;
    private String pinyin;
    private String city_code;
    private String city_name;
    private String province_code;
    private String province_name;
    private String full_name;
    private String jian_pin;
    private int c_level;
    private String sys_code;

    public String getCounty_no() {
        return county_no;
    }

    public void setCounty_no(String countyNo) {
        county_no = countyNo;
    }

    public String getCounty_name() {
        return county_name;
    }

    public void setCounty_name(String countyName) {
        county_name = countyName;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }

    public String getCity_code() {
        return city_code;
    }

    public void setCity_code(String cityCode) {
        city_code = cityCode;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String cityName) {
        city_name = cityName;
    }

    public String getProvince_code() {
        return province_code;
    }

    public void setProvince_code(String provinceCode) {
        province_code = provinceCode;
    }

    public String getProvince_name() {
        return province_name;
    }

    public void setProvince_name(String provinceName) {
        province_name = provinceName;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String fullName) {
        full_name = fullName;
    }

    public String getJian_pin() {
        return jian_pin;
    }

    public void setJian_pin(String jianPin) {
        jian_pin = jianPin;
    }

    public int getC_level() {
        return c_level;
    }

    public void setC_level(int cLevel) {
        c_level = cLevel;
    }

    public String getSys_code() {
        return sys_code;
    }

    public void setSys_code(String sysCode) {
        sys_code = sysCode;
    }

}
