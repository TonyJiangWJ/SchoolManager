package com.base.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.sql.Timestamp;
import java.util.List;

import org.hibernate.FlushMode;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import com.base.dao.BaseDao;
import com.base.entity.BaseEntity;

@Transactional(readOnly = false)
public abstract class BaseDaoImpl<T extends BaseEntity> extends
		HibernateDaoSupport implements BaseDao<T> {

	@SuppressWarnings("unchecked")
	private Class<T> entityClass = (Class<T>) ((ParameterizedType) getClass()
			.getGenericSuperclass()).getActualTypeArguments()[0];

	@Override
	public void insert(T entity) {
		// TODO Auto-generated method stub
		try {
			entity.setCreateTime(new Timestamp(System.currentTimeMillis()));
			entity.setVersion(1);
			getHibernateTemplate().save(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(T entity) {
		// TODO Auto-generated method stub
		try {
			entity.setModifyTime(new Timestamp(System.currentTimeMillis()));
			entity.setVersion(entity.getVersion() + 1);
			getHibernateTemplate().saveOrUpdate(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		try {
			getHibernateTemplate().delete(entity);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		try {
			getHibernateTemplate().delete(
					getHibernateTemplate().get(entityClass, id));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public T getById(Integer id) {
		// TODO Auto-generated method stub
		try {
			System.out.println(id);
			return (T) getHibernateTemplate().get(entityClass, id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	abstract public List<T> findAll() throws Exception;

	@Override
	abstract public List<T> find(T entity) throws Exception;

}
