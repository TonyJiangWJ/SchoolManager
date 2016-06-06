package com.request;

import com.base.request.BaseRequest;
/**
 * 住宿信息request
 * @author 沈金番
 *
 */
public class DormitoryRequest extends BaseRequest{
	private Integer size;
    private String location;
    private String dorNo;
    private String bedNo;
    private String refStuNo;
	public Integer getSize() {
		return size;
	}
	public void setSize(Integer size) {
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
