package com.bean;

import com.base.entity.BaseEntity;


/**
 * 财务信息
 * @author 沈金番
 *
 */
public class Finance extends BaseEntity{


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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