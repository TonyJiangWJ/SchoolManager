package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.Finance;
import com.dao.FinanceDao;

/**
 * 财务信息数据库查询、插入、删改操作接口的实现
 * @author 夏超男
 *
 */

public class FinanceDaoImpl extends BaseDaoImpl<Finance> implements FinanceDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Finance> findAll() {
		// TODO Auto-generated method stub
		return (List<Finance>) getHibernateTemplate().find("from Finance");
	}

	@Override
	public List<Finance> find(Finance entity) {
		DetachedCriteria dc = DetachedCriteria.forClass(Finance.class);
		if(entity.getRefStuNo()!=null)
			dc.add(Restrictions.eq("refStuNo", entity.getRefStuNo()));
		return (List<Finance>) getHibernateTemplate().findByCriteria(dc);
	}

}
