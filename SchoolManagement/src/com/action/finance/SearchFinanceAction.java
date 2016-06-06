package com.action.finance;

import java.util.Map;

import com.facade.FinanceFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.FinanceRequest;
import com.response.FinanceResponse;

public class SearchFinanceAction  extends ActionSupport{
	private FinanceFacade financeFacade;
	private String refStuNo;
    private String tuition;
    private String classMoney;
    private String houseFee;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		FinanceResponse financeResponse = null;
		FinanceRequest request = new FinanceRequest();
		request.setClassMoney(Double.valueOf(classMoney));
		request.setHouseFee(Double.valueOf(houseFee));
		request.setRefStuNo(refStuNo);
		request.setTuition(Double.valueOf(tuition));
		financeResponse = financeFacade.find(request);
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

	public String getTuition() {
		return tuition;
	}

	public void setTuition(String tuition) {
		this.tuition = tuition;
	}

	public String getClassMoney() {
		return classMoney;
	}

	public void setClassMoney(String classMoney) {
		this.classMoney = classMoney;
	}

	public String getHouseFee() {
		return houseFee;
	}

	public void setHouseFee(String houseFee) {
		this.houseFee = houseFee;
	}

}
