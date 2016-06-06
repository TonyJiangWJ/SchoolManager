package com.request;

import com.base.request.BaseRequest;
/**
 * 管理员的request信息
 * @author 沈金番
 *
 */
public class AdminRequest extends BaseRequest{
	private String userName;
    private String password;
    private String newPassword;
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
	public String getNewPassword() {
		return newPassword;
	}
	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}
    
}
