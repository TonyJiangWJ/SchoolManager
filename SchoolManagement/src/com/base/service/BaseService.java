package com.base.service;

import java.util.List;

import com.base.entity.BaseEntity;

public interface BaseService<T extends BaseEntity> {
	public void insert(T t);
	
	public void delete(T t);
	
	public void update(T t);
	
	public T findById(Integer id);
	
	public List<T> findAll() throws Exception;
	
	public void deleteById(Integer id);
	
	public List<T> find(T t) throws Exception;
}
