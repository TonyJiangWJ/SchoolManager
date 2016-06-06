package com.response;

import com.base.response.BaseResponse;
import com.bean.Admin;
/**
 * 管理员信息的response
 * @author 沈金番
 *
 */
public class AdminResponse extends BaseResponse<Admin>{
	private Admin admin;

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}
	
}
