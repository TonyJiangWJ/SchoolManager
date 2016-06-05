package com.action.admin;

import java.util.Map;

import com.facade.AdminFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.AdminRequest;
import com.response.AdminResponse;

public class ResetAction extends ActionSupport{
	private AdminFacade adminFacade;
	private String userName;
	private String password;
	private String newPwd;
	
	public String execute(){
		
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		AdminRequest request = new AdminRequest();
		request.setNewPassword(newPwd);
		request.setPassword(password);
		request.setUserName(userName);
		AdminResponse adminResponse = adminFacade.resetPassword(request);
		requestMap.put("adminResponse", adminResponse);
		return "SUCCESS";
	}
	
	
	
	public AdminFacade getAdminFacade() {
		return adminFacade;
	}
	public void setAdminFacade(AdminFacade adminFacade) {
		this.adminFacade = adminFacade;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNewPwd() {
		return newPwd;
	}
	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}
	
	
}
