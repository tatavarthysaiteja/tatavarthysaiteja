package com.enjoyfresh.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.enjoyfresh.constants.Messages;
import com.enjoyfresh.model.RespBean;

@Component
public class RespBuilder {

	@Autowired
	private RespBean resp;

	public <T> RespBean get(String status, Messages code, T t) {
		resp.setStatus(status);
		resp.setCode(code.toString());
		resp.setDesc(code.toString());
		resp.setDetails(t);
		return resp;
	}
	
	public <T> RespBean getMessage(String status, Messages code ) {
		resp.setStatus(status);
		resp.setCode(code.toString());
		resp.setDesc(code.toString());		
		return resp;
	}

}