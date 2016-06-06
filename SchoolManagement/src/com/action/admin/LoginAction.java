package com.action.admin;

import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.base.util.ResultCodeDesc;
import com.facade.AdminFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.AdminRequest;
import com.response.AdminResponse;
/**
 * 登陆用的Action
 * @author 沈金番
 *
 */
public class LoginAction extends ActionSupport{
	private String userName;
	private String password;
	private AdminFacade adminFacade;
	@Override
	public String execute() throws Exception {
		AdminRequest request = new AdminRequest();
		request.setUserName(userName);
		request.setPassword(password);
		//用于存放返回的Response信息  传到JSP页面
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");  
		
		AdminResponse response1 = adminFacade.login(request);
		requestMap.put("adminResponse", response1);
		if(response1.getResultCode().equals(ResultCodeDesc.SUCCESS)){
			Map<String, Object> session = ActionContext.getContext().getSession();
			session.put("userInfo", response1.getAdmin().getUserName());
		}
		System.out.println("Response"+JSON.toJSONString(requestMap.get("adminResponse")));
		return "SUCCESS";
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
	public AdminFacade getAdminFacade() {
		return adminFacade;
	}
	public void setAdminFacade(AdminFacade adminFacade) {
		this.adminFacade = adminFacade;
	}
	
}
