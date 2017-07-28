package com.wtyt.util.mapper;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.wtyt.util.bean.CountiesInfoBean;
import com.wtyt.util.bean.SystemParameterBean;

@Repository
public interface InitMapper {
	List<SystemParameterBean> getSysPaList();

	List<CountiesInfoBean> getSysCounties();
}
