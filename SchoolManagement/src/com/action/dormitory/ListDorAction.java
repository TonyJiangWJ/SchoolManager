package com.action.dormitory;

import java.util.Map;

import com.facade.DormitoryFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.response.DormitoryResponse;
/**
 * 查看所有宿舍信息
 * @author 沈金番
 *
 */
public class ListDorAction extends ActionSupport{
	private DormitoryFacade dormitoryFacade;

	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		DormitoryResponse dormitoryResponse;
		dormitoryResponse = dormitoryFacade.listAll();
		requestMap.put("dormitoryResponse", dormitoryResponse);
		return"SUCCESS";
	}

	public DormitoryFacade getDormitoryFacade() {
		return dormitoryFacade;
	}

	public void setDormitoryFacade(DormitoryFacade dormitoryFacade) {
		this.dormitoryFacade = dormitoryFacade;
	}
	
}
