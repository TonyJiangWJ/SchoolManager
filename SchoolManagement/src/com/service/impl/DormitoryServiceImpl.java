package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.Dormitory;
import com.dao.DormitoryDao;
import com.service.DormitoryService;
/**
 * 
 * @author 江文杰
 *
 */
public class DormitoryServiceImpl extends BaseServiceImpl<Dormitory> implements DormitoryService{
	
	private DormitoryDao dormitoryDao;
	@Override
	public BaseDao<Dormitory> getDao() {
		// TODO Auto-generated method stub
		return dormitoryDao;
	}
	public DormitoryDao getDormitoryDao() {
		return dormitoryDao;
	}
	public void setDormitoryDao(DormitoryDao dormitoryDao) {
		this.dormitoryDao = dormitoryDao;
	}

}
