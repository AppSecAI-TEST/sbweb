package com.wtyt.bas.mapper;

import com.wtyt.bas.bean.BasProBean;
import com.wtyt.util.mybatis.MyMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BasProMapper extends MyMapper<BasProBean> {

    List<BasProBean> getBasProList(BasProBean bean);

}
