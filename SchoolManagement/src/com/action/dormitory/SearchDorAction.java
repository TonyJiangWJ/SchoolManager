package com.action.dormitory;

import java.util.Map;

import com.facade.DormitoryFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.DormitoryRequest;
import com.response.DormitoryResponse;
/**
 * 查询住宿信息
 * @author 沈金番
 *
 */
public class SearchDorAction extends ActionSupport{
	private DormitoryFacade dormitoryFacade;
	private String size;
    private String location;
    private String dorNo;
    private String bedNo;
    private String refStuNo;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		DormitoryResponse dormitoryResponse = null;
		DormitoryRequest request = new DormitoryRequest();
		request.setBedNo(bedNo);
		request.setDorNo(dorNo);
		request.setLocation(location);
		request.setRefStuNo(refStuNo);
		request.setSize(Integer.valueOf(size));
		dormitoryResponse = dormitoryFacade.find(request);
		requestMap.put("dormitoryResponse", dormitoryResponse);
		return"SUCCESS";
	}

	public DormitoryFacade getDormitoryFacade() {
		return dormitoryFacade;
	}

	public void setDormitoryFacade(DormitoryFacade dormitoryFacade) {
		this.dormitoryFacade = dormitoryFacade;
	}


	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDorNo() {
		return dorNo;
	}

	public void setDorNo(String dorNo) {
		this.dorNo = dorNo;
	}

	public String getBedNo() {
		return bedNo;
	}

	public void setBedNo(String bedNo) {
		this.bedNo = bedNo;
	}

	public String getRefStuNo() {
		return refStuNo;
	}

	public void setRefStuNo(String refStuNo) {
		this.refStuNo = refStuNo;
	}
	
}