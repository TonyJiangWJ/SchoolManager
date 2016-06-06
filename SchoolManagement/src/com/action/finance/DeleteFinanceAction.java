package com.action.finance;

import java.util.Map;

import com.facade.FinanceFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.FinanceRequest;
import com.response.FinanceResponse;
/**
 * 删除财务信息
 * @author 江文杰
 *
 */
public class DeleteFinanceAction  extends ActionSupport{
	private FinanceFacade financeFacade;
	private Integer id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		FinanceResponse financeResponse;
		FinanceRequest request = new FinanceRequest();
		request.setId(id);
		financeResponse = financeFacade.delete(request);
		requestMap.put("financeResponse", financeResponse);
		return"SUCCESS";
	}

	public FinanceFacade getFinanceFacade() {
		return financeFacade;
	}

	public void setFinanceFacade(FinanceFacade financeFacade) {
		this.financeFacade = financeFacade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
