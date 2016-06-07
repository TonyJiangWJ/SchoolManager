package com.action.borrow;

import java.sql.Timestamp;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.bean.Borrow;
import com.facade.BorrowFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.BorrowRequest;
import com.response.BorrowResponse;
/**
 * 添加借阅信息
 * @author 沈金番
 *
 */
public class InsertBorrowAction extends ActionSupport {
	private BorrowFacade borrowFacade;
	private Timestamp BDate;
	private String BName;
	private String BType;
	private String BStatus;
	private String refStuNo;

	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext
				.getContext().get("request");
		BorrowResponse borrowResponse;
		BorrowRequest request = new BorrowRequest();
		BDate = new Timestamp(System.currentTimeMillis());
		request.setBDate(BDate);
		request.setBName(BName);
		if(!StringUtils.isEmpty(BStatus))
			request.setBStatus(Integer.valueOf(BStatus));
		if(!StringUtils.isEmpty(BType))
			request.setBType(Integer.valueOf(BType));
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
