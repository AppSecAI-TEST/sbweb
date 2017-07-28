package com.wtyt.bas.bean;


import com.wtyt.util.bean.BaseBean;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;


@Table(name = "T_SB_PRO")
public class BasProBean extends BaseBean {
	@SequenceGenerator(name="Any",sequenceName="SE_SB_PRO_ID")
	@Id
	private Integer id;
	@Column
	private String pro_name;
	@Column
	private String pro_code;
	@OrderBy("desc")
	@Column
	private Date created_time;
	@Column
	private Date last_modified_time;
	@Transient
	private List<BasProBean> proList;


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

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

	public Date getCreated_time() {
		return created_time;
	}

	public void setCreated_time(Date created_time) {
		this.created_time = created_time;
	}

	public Date getLast_modified_time() {
		return last_modified_time;
	}

	public void setLast_modified_time(Date last_modified_time) {
		this.last_modified_time = last_modified_time;
	}

	public List<BasProBean> getProList() {
		return proList;
	}

	public void setProList(List<BasProBean> proList) {
		this.proList = proList;
	}

}

