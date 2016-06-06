package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.Dormitory;
import com.dao.DormitoryDao;

/**
 * 宿舍信息数据库查询、插入、删改操作接口的实现
 * @author 夏超男
 *
 */

public class DormitoryDaoImpl extends BaseDaoImpl<Dormitory> implements DormitoryDao{

	@Override
	public List<Dormitory> findAll() {
		// TODO Auto-generated method stub
		return (List<Dormitory>) getHibernateTemplate().find("from Dormitory");
	}

	@Override
	public List<Dormitory> find(Dormitory entity) {
		DetachedCriteria dc = DetachedCriteria.forClass(Dormitory.class);
		if(entity.getBedNo()!=null)
			dc.add(Restrictions.eq("bedNo", entity.getBedNo()));
		if(entity.getDorNo()!=null)
			dc.add(Restrictions.eq("dorNo", entity.getDorNo()));
		if(entity.getLocation()!=null)
			dc.add(Restrictions.eq("location", entity.getLocation()));
		if(entity.getRefStuNo()!=null)
			dc.add(Restrictions.eq("refStuNo", entity.getRefStuNo()));
		
		return (List<Dormitory>) getHibernateTemplate().findByCriteria(dc);
	}

}
