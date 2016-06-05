package com.action.admin;

import java.util.Map;


import com.alibaba.fastjson.JSON;
import com.facade.AdminFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.AdminRequest;
import com.response.AdminResponse;

public class RegisterAction extends ActionSupport{
	private Map<String, Object> requestMap;
	private String password;
	private String userName;

	private AdminFacade adminFacade;
	@Override
	public String execute() throws Exception {
		AdminRequest request = new AdminRequest();
		request.setUserName(userName);
		request.setPassword(password);
		AdminResponse response1 = adminFacade.register(request);
		requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		requestMap.put("adminResponse", response1);
		return "SUCCESS";
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public AdminFacade getAdminFacade() {
		return adminFacade;
	}
	public void setAdminFacade(AdminFacade adminFacade) {
		this.adminFacade = adminFacade;
	}
	

}
