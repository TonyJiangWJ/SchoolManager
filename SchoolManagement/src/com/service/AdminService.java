package com.service;


import com.base.service.BaseService;
import com.bean.Admin;
public interface AdminService extends BaseService<Admin>{
	public boolean check(Admin admin);
}
