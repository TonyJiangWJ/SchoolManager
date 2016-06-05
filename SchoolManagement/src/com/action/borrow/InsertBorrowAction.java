package com.action.borrow;

import java.sql.Timestamp;
import java.util.Map;

import com.bean.Borrow;
import com.facade.BorrowFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.BorrowRequest;
import com.response.BorrowResponse;

public class InsertBorrowAction extends ActionSupport {
	private BorrowFacade borrowFacade;
	private Timestamp BDate;
	private String BName;
	private Integer BType;
	private Integer BStatus;
	private String refStuNo;

	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext
				.getContext().get("request");
		BorrowResponse borrowResponse;
		BorrowRequest request = new BorrowRequest();
		request.setBDate(BDate);
		request.setBName(BName);
		request.setBStatus(BStatus);
		request.setBType(BType);
		request.setRefStuNo(refStuNo);
		borrowResponse = borrowFacade.insert(request);
		requestMap.put("borrowResponse", borrowResponse);
		return "SUCCESS";
	}

	public BorrowFacade getBorrowFacade() {
		return borrowFacade;
	}

	public void setBorrowFacade(BorrowFacade borrowFacade) {
		this.borrowFacade = borrowFacade;
	}

	public Timestamp getBDate() {
		return BDate;
	}

	public void setBDate(Timestamp bDate) {
		BDate = bDate;
	}

	public String getBName() {
		return BName;
	}

	public void setBName(String bName) {
		BName = bName;
	}

	public Integer getBType() {
		return BType;
	}

	public void setBType(Integer bType) {
		BType = bType;
	}

	public Integer getBStatus() {
		return BStatus;
	}

	public void setBStatus(Integer bStatus) {
		BStatus = bStatus;
	}

	public String getRefStuNo() {
		return refStuNo;
	}

	public void setRefStuNo(String refStuNo) {
		this.refStuNo = refStuNo;
	}

}
