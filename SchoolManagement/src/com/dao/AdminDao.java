package com.dao;

import com.base.dao.BaseDao;
import com.bean.Admin;

/**
 * 登录功能的数据库查询、删改、插入操作接口
 * @author 夏超男
 *
 */

public interface AdminDao extends BaseDao<Admin>{
	public boolean check(Admin admin);
}
