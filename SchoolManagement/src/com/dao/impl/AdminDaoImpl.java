package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.Admin;
import com.dao.AdminDao;

public class AdminDaoImpl extends BaseDaoImpl<Admin> implements AdminDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> findAll() {
		return (List<Admin>) getHibernateTemplate().find("from Admin");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Admin> find(Admin entity) {
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
	
}
