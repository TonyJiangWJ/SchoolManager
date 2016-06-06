package com.dao.impl;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;

import com.base.dao.impl.BaseDaoImpl;
import com.bean.MedicalTreat;
import com.dao.MedicalTreatDao;

/**
 * 医疗信息数据库查询、插入、删改操作接口的实现
 * @author 夏超男
 *
 */

public class MedicalTreatDaoImpl extends BaseDaoImpl<MedicalTreat> implements MedicalTreatDao{

	@Override
	public List<MedicalTreat> findAll() {
		return (List<MedicalTreat>) getHibernateTemplate().find("from MedicalTreat");
	}

	@Override
	public List<MedicalTreat> find(MedicalTreat entity) {
		DetachedCriteria dc = DetachedCriteria.forClass(MedicalTreat.class);
		if(entity.getRefStuNo()!=null)
			dc.add(Restrictions.eq("refStuNo", entity.getRefStuNo()));
		if(entity.getMDate()!=null)
			dc.add(Restrictions.eq("MDate", entity.getMDate()));
		if(entity.getMType()!=null)
			dc.add(Restrictions.eq("MType", entity.getMType()));
		return (List<MedicalTreat>) getHibernateTemplate().findByCriteria(dc);
	}
	
}
