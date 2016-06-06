package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.Finance;
import com.dao.FinanceDao;
import com.service.FinanceService;
/**
 * 
 * @author 江文杰
 *
 */
public class FinanceServiceImpl extends BaseServiceImpl<Finance> implements FinanceService{

	private FinanceDao financeDao;
	@Override
	public BaseDao<Finance> getDao() {
		// TODO Auto-generated method stub
		return financeDao;
	}
	public FinanceDao getFinanceDao() {
		return financeDao;
	}
	public void setFinanceDao(FinanceDao financeDao) {
		this.financeDao = financeDao;
	}

}
