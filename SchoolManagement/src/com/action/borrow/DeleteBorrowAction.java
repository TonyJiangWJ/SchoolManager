package com.action.borrow;

import java.util.Map;

import com.facade.BorrowFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.BorrowRequest;
import com.response.BorrowResponse;
/**
 * 删除借阅信息的Action
 * @author 沈金番
 *
 */
public class DeleteBorrowAction extends ActionSupport{
	private BorrowFacade borrowFacade;
	private String id;
	@Override
	public String execute() throws Exception {
		
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		
		BorrowResponse borrowResponse;
		BorrowRequest request = new BorrowRequest();
		request.setId(Integer.valueOf(id));
		borrowResponse = borrowFacade.delete(request);
		requestMap.put("borrowResponse", borrowResponse);
		return"SUCCESS";
	}

	public BorrowFacade getBorrowFacade() {
		return borrowFacade;
	}

	public void setBorrowFacade(BorrowFacade borrowFacade) {
		this.borrowFacade = borrowFacade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


	
}
