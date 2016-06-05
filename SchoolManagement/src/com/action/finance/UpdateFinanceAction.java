package com.action.finance;

import java.util.Map;

import com.facade.FinanceFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.FinanceRequest;
import com.response.FinanceResponse;

public class UpdateFinanceAction extends ActionSupport {
	private FinanceFacade financeFacade;
	private String refStuNo;
    private Double tuition;
    private Double classMoney;
    private Double houseFee;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		FinanceResponse financeResponse;
		FinanceRequest request = new FinanceRequest();
		request.setClassMoney(classMoney);
		request.setHouseFee(houseFee);
		request.setRefStuNo(refStuNo);
		request.setTuition(tuition);
		financeResponse = financeFacade.update(request);
		requestMap.put("financeResponse", financeResponse);
		return"SUCCESS";
	}

	public FinanceFacade getFinanceFacade() {
		return financeFacade;
	}

	public void setFinanceFacade(FinanceFacade financeFacade) {
		this.financeFacade = financeFacade;
	}

	public String getRefStuNo() {
		return refStuNo;
	}

	public void setRefStuNo(String refStuNo) {
		this.refStuNo = refStuNo;
	}

	public Double getTuition() {
		return tuition;
	}

	public void setTuition(Double tuition) {
		this.tuition = tuition;
	}

	public Double getClassMoney() {
		return classMoney;
	}

	public void setClassMoney(Double classMoney) {
		this.classMoney = classMoney;
	}

	public Double getHouseFee() {
		return houseFee;
	}

	public void setHouseFee(Double houseFee) {
		this.houseFee = houseFee;
	}
}
