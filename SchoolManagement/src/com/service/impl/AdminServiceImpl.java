package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.Admin;
import com.dao.AdminDao;
import com.service.AdminService;

public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService{
	private AdminDao adminDao;
	
	@Override
	public BaseDao<Admin> getDao() {
		// TODO Auto-generated method stub
		return adminDao;
	}

	public AdminDao getAdminDao() {
		return adminDao;
	}

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
	
}
