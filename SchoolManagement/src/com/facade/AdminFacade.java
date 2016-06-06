package com.facade;

import com.request.AdminRequest;
import com.response.AdminResponse;

/**
 * 管理员操作的方法
 * @author 江文杰
 *
 */
public interface AdminFacade {
	//登陆
	public AdminResponse login(AdminRequest request) throws Exception;
	//注册
	public AdminResponse register(AdminRequest request);
	//重置密码
	public AdminResponse resetPassword(AdminRequest request);
}
