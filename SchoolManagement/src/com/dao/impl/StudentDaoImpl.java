package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.Student;
import com.dao.StudentDao;

public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao{

	@Override
	public List<Student> findAll() {
		// TODO Auto-generated method stub
		return (List<Student>) getHibernateTemplate().find("from Student");
	}

	@Override
	public List<Student> find(Student entity) {
		DetachedCriteria dc = DetachedCriteria.forClass(Student.class);
		if(entity.getAge()!=null)
			dc.add(Restrictions.eq("age", entity.getAge()));
		if(entity.getBirthPlace()!=null)
			dc.add(Restrictions.eq("brithPlace", entity.getBirthPlace()));
		if(entity.getClassNo()!=null)
			dc.add(Restrictions.eq("classNo", entity.getClassNo()));
		if(entity.getName()!=null)
			dc.add(Restrictions.eq("name", entity.getName()));
		if(entity.getSex()!=null)
			dc.add(Restrictions.eq("sex", entity.getSex()));
		if(entity.getSpecialty()!=null)
			dc.add(Restrictions.eq("specialty", entity.getSpecialty()));
		if(entity.getStuNo()!=null)
			dc.add(Restrictions.eq("stuNo", entity.getStuNo()));
		return (List<Student>) getHibernateTemplate().findByCriteria(dc);
	}

}
