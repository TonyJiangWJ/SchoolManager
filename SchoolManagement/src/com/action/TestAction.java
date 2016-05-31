package com.action;

import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;

public class TestAction extends ActionSupport{

	private AdminService adminService;
	@Override
	public String execute() throws Exception {
		adminService.deleteById(1);
		return "SUCCESS";
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
}
