package com.dao;

import com.base.dao.BaseDao;
import com.bean.Admin;

public interface AdminDao extends BaseDao<Admin>{
	public boolean check(Admin admin);
}
