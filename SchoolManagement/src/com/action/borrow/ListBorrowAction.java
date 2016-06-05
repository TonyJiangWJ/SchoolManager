package com.action.borrow;

import java.util.Map;

import com.facade.BorrowFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.BorrowRequest;
import com.response.BorrowResponse;

public class ListBorrowAction extends ActionSupport{
	private BorrowFacade borrowFacade;

	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		BorrowResponse borrowResponse;
		borrowResponse = borrowFacade.listAll();
		requestMap.put("borrowResponse", borrowResponse);
		return"SUCCESS";
	}

	public BorrowFacade getBorrowFacade() {
		return borrowFacade;
	}

	public void setBorrowFacade(BorrowFacade borrowFacade) {
		this.borrowFacade = borrowFacade;
	}
	
}
