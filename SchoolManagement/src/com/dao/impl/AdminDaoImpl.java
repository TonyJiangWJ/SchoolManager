package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSON;
import com.base.dao.impl.BaseDaoImpl;
import com.bean.Admin;
import com.dao.AdminDao;

/**
 * 登录功能的数据库查询、插入、删改操作接口的实现
 * @author 夏超男
 *
 */

public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{
	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> findAll() {
		return (List<Admin>) getHibernateTemplate().find("from Admin");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> find(Admin entity) {
		
		System.out.println("Entity:"+JSON.toJSONString(entity));
		DetachedCriteria dc = DetachedCriteria.forClass(Admin.class);
		if(entity.getUserName()!=null&&entity.getPassword()!=null){
			dc.add(Restrictions.eq("userName", entity.getUserName()));
			dc.add(Restrictions.eq("password", entity.getPassword()));
			List<Admin> result = (List<Admin>) getHibernateTemplate().findByCriteria(dc);
			if(result==null||result.size()==0){
				return null;
			}else{
				return result;
			}
		}
		
		return null;
	}

	@Override
	public boolean check(Admin entity) {
		DetachedCriteria dc = DetachedCriteria.forClass(Admin.class);
		if(entity.getUserName()!=null){
			dc.add(Restrictions.eq("userName", entity.getUserName()));
			List<Admin> result = (List<Admin>) getHibernateTemplate().findByCriteria(dc);
			if(result==null||result.size()==0){
				return false;
			}else{
				return true;
			}
		}
		
		return false;
	}
	
}
