package com.bean;

// default package

import java.sql.Timestamp;

import com.base.entity.BaseEntity;

public class MedicalTreat extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String refStuNo;
	private Timestamp MDate;
	private Double price;
	private Integer MType;

	public String getRefStuNo() {
		return refStuNo;
	}

	public void setRefStuNo(String refStuNo) {
		this.refStuNo = refStuNo;
	}

	public Timestamp getMDate() {
		return MDate;
	}

	public void setMDate(Timestamp mDate) {
		MDate = mDate;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getMType() {
		return MType;
	}

	public void setMType(Integer mType) {
		MType = mType;
	}

}