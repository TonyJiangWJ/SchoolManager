package com.action.dormitory;

import java.util.Map;

import com.facade.DormitoryFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.DormitoryRequest;
import com.response.DormitoryResponse;

public class DeleteDorAction  extends ActionSupport{
	private DormitoryFacade dormitoryFacade;
	private Integer id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		DormitoryResponse dormitoryResponse;
		DormitoryRequest request = new DormitoryRequest();
		request.setId(id);
		dormitoryResponse = dormitoryFacade.delete(request);
		requestMap.put("dormitoryResponse", dormitoryResponse);
		return"SUCCESS";
	}

	public DormitoryFacade getDormitoryFacade() {
		return dormitoryFacade;
	}

	public void setDormitoryFacade(DormitoryFacade dormitoryFacade) {
		this.dormitoryFacade = dormitoryFacade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
