package com.facade.impl;

import com.facade.BorrowFacade;
import com.request.BorrowRequest;
import com.response.BorrowResponse;
import com.service.BorrowService;

public class BorrowFacadeImpl implements BorrowFacade {
	private BorrowService borrowService;
	public BorrowService getBorrowService() {
		return borrowService;
	}

	public void setBorrowService(BorrowService borrowService) {
		this.borrowService = borrowService;
	}

	@Override
	public BorrowResponse listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BorrowResponse update(BorrowRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BorrowResponse insert(BorrowRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BorrowResponse delete(BorrowRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
