package com.action.borrow;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.facade.BorrowFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.BorrowRequest;
import com.response.BorrowResponse;
/**
 * 更新借阅信息
 * @author 沈金番
 *
 */
public class UpdateBorrowAction extends ActionSupport {
	private BorrowFacade borrowFacade;
	private String BName;
	private String BType;
	private String BStatus;
	private String refStuNo;
	private String id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		BorrowResponse borrowResponse;
		BorrowRequest request = new BorrowRequest();
		request.setBName(BName);
		if(!StringUtils.isEmpty(BStatus))
			request.setBStatus(Integer.valueOf(BStatus));
		if(!StringUtils.isEmpty(BType))
			request.setBType(Integer.valueOf(BType));
		request.setRefStuNo(refStuNo);
		if(!StringUtils.isEmpty(id))
			request.setId(Integer.valueOf(id));
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
