package com.enjoyfresh.model;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@SuppressWarnings("serial")
@Component
public class RespBean implements Serializable {
	
	private String status = null;
	private String code = null;
	private String desc = null;
	private Object details = null;
	
	
	public RespBean() {
		super();
	}


	public RespBean(String status, String code, String desc, Object details) {
		super();
		this.status = status;
		this.code = code;
		this.desc = desc;
		this.details = details;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public Object getDetails() {
		return details;
	}


	public void setDetails(Object details) {
		this.details = details;
	}
	
	
	

}
