package com.bean;

import com.base.entity.BaseEntity;
// default package
/**
 * 管理员信息
 * @author 沈金番
 *
 */
public class Admin  extends BaseEntity{



     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userName;
     private String password;

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

   



}