package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.MClass;
import com.dao.ClassDao;
import com.service.ClassService;
/**
 * 
 * @author 江文杰
 *
 */
public class ClassServiceImpl extends BaseServiceImpl<MClass> implements ClassService{

	private ClassDao classDao;
	@Override
	public BaseDao<MClass> getDao() {
		// TODO Auto-generated method stub
		return classDao;
	}
	public ClassDao getClassDao() {
		return classDao;
	}
	public void setClassDao(ClassDao classDao) {
		this.classDao = classDao;
	}

}
