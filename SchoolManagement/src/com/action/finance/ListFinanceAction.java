package com.action.finance;

import java.util.Map;

import com.facade.FinanceFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.response.FinanceResponse;
/**
 * 查看所有的财务信息
 * @author 江文杰
 *
 */
public class ListFinanceAction  extends ActionSupport{
	private FinanceFacade financeFacade;

	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		FinanceResponse financeResponse;
		financeResponse = financeFacade.listAll();
		requestMap.put("financeResponse", financeResponse);
		return"SUCCESS";
	}

	public FinanceFacade getFinanceFacade() {
		return financeFacade;
	}

	public void setFinanceFacade(FinanceFacade financeFacade) {
		this.financeFacade = financeFacade;
	}
	
}

