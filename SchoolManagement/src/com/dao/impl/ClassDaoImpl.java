package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.MClass;
import com.dao.ClassDao;

/**
 * 班级信息数据库查询、插入、删改操作接口的实现
 * @author 夏超男
 *
 */

public class ClassDaoImpl extends BaseDaoImpl<MClass> implements ClassDao{

	@Override
	public List<MClass> findAll() {
		// TODO Auto-generated method stub
		return (List<MClass>) getHibernateTemplate().find("from MClass");
	}

	@Override
	public List<MClass> find(MClass entity) {
		DetachedCriteria dc = DetachedCriteria.forClass(MClass.class);
		if(entity.getClassName()!=null)
			dc.add(Restrictions.eq("className", entity.getClassName()));
		if(entity.getClassNo()!=null)
			dc.add(Restrictions.eq("classNo", entity.getClassNo()));
		if(entity.getGrade()!=null)
			dc.add(Restrictions.eq("grade", entity.getGrade()));
		if(entity.getStudentNum()!=null)
			dc.add(Restrictions.eq("studentNum", entity.getStudentNum()));
		return (List<MClass>) getHibernateTemplate().findByCriteria(dc);
	}

}
