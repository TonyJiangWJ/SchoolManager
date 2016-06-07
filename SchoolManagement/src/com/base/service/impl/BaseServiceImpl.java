package com.base.service.impl;

import java.util.List;

import com.base.dao.BaseDao;
import com.base.entity.BaseEntity;
import com.base.service.BaseService;
/**
 * 抽象基类 实现基类接口的功能
 * @author 江文杰
 *
 * @param <T>
 */
public abstract class BaseServiceImpl<T extends BaseEntity> implements BaseService<T> {
	

	abstract public BaseDao<T> getDao();
	
	@Override
	public void insert(T t) {
		getDao().insert(t);
		
	}

	@Override
	public void delete(T t) {
		getDao().delete(t);
	}

	@Override
	public void update(T t) {
		getDao().update(t);
	}

	@Override
	public T findById(Integer id) {
		return getDao().getById(id);
	}

	@Override
	public List<T> findAll() throws Exception {
		return getDao().findAll();
	}

	@Override
	public void deleteById(Integer id) {
		getDao().deleteById(id);
	}

	@Override
	public List<T> find(T t) throws Exception {
		// TODO Auto-generated method stub
		return getDao().find(t);
	}
	
	
	
}
