package com.service.impl;


import com.base.dao.BaseDao;

import com.base.service.impl.BaseServiceImpl;
import com.bean.Admin;
import com.dao.AdminDao;
import com.service.AdminService;
/**
 * 
 * @author 江文杰
 *
 */
public class AdminServiceImpl extends BaseServiceImpl<Admin> implements AdminService{
	//设置对应的Dao
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

	@Override
	public boolean check(Admin admin) {
		// TODO Auto-generated method stub
		return getAdminDao().check(admin);
	}
	
}
