package com.action.finance;

import java.util.Map;

import com.facade.FinanceFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.FinanceRequest;
import com.response.FinanceResponse;
/**
 * 
 * @author tonyjiang
 *
 */
public class UpdateFinanceAction extends ActionSupport {
	private FinanceFacade financeFacade;
	private String refStuNo;
    private String tuition;
    private String classMoney;
    private String houseFee;
    private String id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		FinanceResponse financeResponse;
		FinanceRequest request = new FinanceRequest();
		request.setClassMoney(Double.valueOf(classMoney));
		request.setHouseFee(Double.valueOf(houseFee));
		request.setRefStuNo(refStuNo);
		request.setTuition(Double.valueOf(tuition));
		request.setId(Integer.valueOf(id));
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
