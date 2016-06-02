package com.facade;

import com.request.FinanceRequest;
import com.response.FinanceResponse;

public interface FinanceFacade {
	public FinanceResponse listAll();
	public FinanceResponse find(FinanceRequest request);
	public FinanceResponse update(FinanceRequest request);
	public FinanceResponse delete(FinanceRequest request);
	public FinanceResponse insert(FinanceRequest request);
}
