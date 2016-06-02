package com.action;

import com.bean.Admin;
import com.opensymphony.xwork2.ActionSupport;
import com.service.AdminService;

public class TestAction extends ActionSupport{

	private AdminService adminService;
	@Override
	public String execute() throws Exception {
		Admin admin = adminService.findById(1);
		admin.setUserName("bushi lala");
		adminService.update(admin);
		return "SUCCESS";
	}
	public AdminService getAdminService() {
		return adminService;
	}
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
}
