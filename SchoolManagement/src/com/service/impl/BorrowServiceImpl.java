package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.Borrow;
import com.dao.BorrowDao;
import com.service.BorrowService;
/**
 * 
 * @author 江文杰
 *
 */
public class BorrowServiceImpl extends BaseServiceImpl<Borrow> implements BorrowService{

	private BorrowDao borrowDao;
	@Override
	public BaseDao<Borrow> getDao() {
		// TODO Auto-generated method stub
		return borrowDao;
	}
	public BorrowDao getBorrowDao() {
		return borrowDao;
	}
	public void setBorrowDao(BorrowDao borrowDao) {
		this.borrowDao = borrowDao;
	}

}
