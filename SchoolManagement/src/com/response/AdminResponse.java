package com.response;

import com.base.response.BaseResponse;
import com.bean.Admin;

public class AdminResponse extends BaseResponse<Admin>{
	private Admin admin;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
}
