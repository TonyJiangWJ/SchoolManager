package com.service;


import com.base.service.BaseService;
/**
 * 管理员Service
 * @author 江文杰
 *
 */
import com.bean.Admin;
public interface AdminService extends BaseService<Admin>{
	//查看是否已经存在同名的用户信息
	public boolean check(Admin admin);
}
