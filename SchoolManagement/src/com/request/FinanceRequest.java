package com.request;

import com.base.request.BaseRequest;
/**
 * 财务信息request
 * @author 沈金番
 *
 */
public class FinanceRequest extends BaseRequest{
	private String refStuNo;
    private Double tuition;
    private Double classMoney;
    private Double houseFee;
	public String getRefStuNo() {
		return refStuNo;
	}
	public void setRefStuNo(String refStuNo) {
		this.refStuNo = refStuNo;
	}
	public Double getTuition() {
		return tuition;
	}
	public void setTuition(Double tuition) {
		this.tuition = tuition;
	}
	public Double getClassMoney() {
		return classMoney;
	}
	public void setClassMoney(Double classMoney) {
		this.classMoney = classMoney;
	}
	public Double getHouseFee() {
		return houseFee;
	}
	public void setHouseFee(Double houseFee) {
		this.houseFee = houseFee;
	}
    
}
