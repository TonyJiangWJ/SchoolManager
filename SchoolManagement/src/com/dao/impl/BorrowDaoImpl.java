package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.Borrow;
import com.dao.BorrowDao;

public class BorrowDaoImpl extends BaseDaoImpl<Borrow> implements BorrowDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Borrow> findAll() {
		// TODO Auto-generated method stub
		return (List<Borrow>) getHibernateTemplate().find("from Borrow");
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Borrow> find(Borrow entity) {
		DetachedCriteria dc = DetachedCriteria.forClass(Borrow.class);
		
		if(entity.getBName()!=null)
			dc.add(Restrictions.eq("BName", entity.getBName()));
		if(entity.getBStatus()!=null)
			dc.add(Restrictions.eq("BStatus", entity.getBStatus()));
		if(entity.getBType()!=null)
			dc.add(Restrictions.eq("BType", entity.getBType()));
		if(entity.getRefStuNo()!=null)
			dc.add(Restrictions.eq("refStuNo", entity.getRefStuNo()));
		
		
		return (List<Borrow>) getHibernateTemplate().findByCriteria(dc);
	}

}
