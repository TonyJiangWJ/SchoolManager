package com.action.dormitory;

import java.util.Map;

import com.facade.DormitoryFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.DormitoryRequest;
import com.response.DormitoryResponse;
/**
 * 更新住宿信息
 * @author 江文杰
 *
 */
public class UpdateDorAction  extends ActionSupport {
	private DormitoryFacade dormitoryFacade;
	private String size;
    private String location;
    private String dorNo;
    private String bedNo;
    private String refStuNo;
    private String id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		DormitoryResponse dormitoryResponse;
		DormitoryRequest request = new DormitoryRequest();
		request.setBedNo(bedNo);
		request.setDorNo(dorNo);
		request.setLocation(location);
		request.setRefStuNo(refStuNo);
		request.setSize(Integer.valueOf(size));
		request.setId(Integer.valueOf(id));
		dormitoryResponse = dormitoryFacade.update(request);
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setRefStuNo(String refStuNo) {
		this.refStuNo = refStuNo;
	}
	
}