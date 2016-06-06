package com.action.borrow;

import java.util.Map;

import com.facade.BorrowFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.BorrowRequest;
import com.response.BorrowResponse;

public class UpdateBorrowAction extends ActionSupport {
	private BorrowFacade borrowFacade;
	private String BName;
	private String BType;
	private String BStatus;
	private String refStuNo;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		BorrowResponse borrowResponse;
		BorrowRequest request = new BorrowRequest();
		request.setBName(BName);
		request.setBStatus(Integer.valueOf(BStatus));
		request.setBType(Integer.valueOf(BType));
		request.setRefStuNo(refStuNo);
		borrowResponse = borrowFacade.update(request);
		requestMap.put("borrowResponse", borrowResponse);
		return"SUCCESS";
	}

	public BorrowFacade getBorrowFacade() {
		return borrowFacade;
	}

	public void setBorrowFacade(BorrowFacade borrowFacade) {
		this.borrowFacade = borrowFacade;
	}

	public String getBName() {
		return BName;
	}

	public void setBName(String bName) {
		BName = bName;
	}

//	public Integer getBType() {
//		return BType;
//	}
//
//	public void setBType(Integer bType) {
//		BType = bType;
//	}
//
//	public Integer getBStatus() {
//		return BStatus;
//	}
//
//	public void setBStatus(Integer bStatus) {
//		BStatus = bStatus;
//	}

	public String getRefStuNo() {
		return refStuNo;
	}

	public String getBType() {
		return BType;
	}

	public void setBType(String bType) {
		BType = bType;
	}

	public String getBStatus() {
		return BStatus;
	}

	public void setBStatus(String bStatus) {
		BStatus = bStatus;
	}

	public void setRefStuNo(String refStuNo) {
		this.refStuNo = refStuNo;
	}
}
