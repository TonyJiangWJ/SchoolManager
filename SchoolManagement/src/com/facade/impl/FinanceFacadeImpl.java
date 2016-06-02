package com.facade.impl;

import com.facade.FinanceFacade;
import com.request.FinanceRequest;
import com.response.FinanceResponse;
import com.service.FinanceService;

public class FinanceFacadeImpl implements FinanceFacade {
	private FinanceService financeService;
	@Override
	public FinanceResponse listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinanceResponse find(FinanceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinanceResponse update(FinanceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinanceResponse delete(FinanceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FinanceResponse insert(FinanceRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public FinanceService getFinanceService() {
		return financeService;
	}

	public void setFinanceService(FinanceService financeService) {
		this.financeService = financeService;
	}

}
