package com.action.dormitory;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.facade.DormitoryFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.DormitoryRequest;
import com.response.DormitoryResponse;
/**
 * 删除宿舍信息
 * @author 沈金番
 *	2016-6-6
 */
public class DeleteDorAction  extends ActionSupport{
	private DormitoryFacade dormitoryFacade;
	private String id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		DormitoryResponse dormitoryResponse;
		DormitoryRequest request = new DormitoryRequest();
		if(!StringUtils.isEmpty(id))
			request.setId(Integer.valueOf(id));
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



}
