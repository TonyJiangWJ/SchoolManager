package com.base.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.base.entity.BaseEntity;
/**
 * 最基本的Dao接口
 * @author 江文杰
 *	2016-05-29
 * @param <T> 填充泛型
 */
@Transactional(readOnly=false)
public interface BaseDao<T extends BaseEntity> {
	public void insert(T entity);
	public void update(T entity);
	public void delete(T entity);
	
	public void deleteById(Integer id);
	public T getById(Integer id);
	public List<T> findAll() throws Exception;
	public List<T> find(T entity) throws Exception;
}
