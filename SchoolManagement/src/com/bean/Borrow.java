package com.bean;
// default package

import java.sql.Timestamp;

import com.base.entity.BaseEntity;

/**
 * 借阅信息
 * @author 沈金番
 *
 */
public class Borrow  extends BaseEntity{


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String refStuNo;
     private Timestamp BDate;
     private String BName;
     private Integer BType;
     private Integer BStatus;
	public String getRefStuNo() {
		return refStuNo;
	}
	public void setRefStuNo(String refStuNo) {
		this.refStuNo = refStuNo;
	}
	public Timestamp getBDate() {
		return BDate;
	}
	public void setBDate(Timestamp bDate) {
		BDate = bDate;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public Integer getBType() {
		return BType;
	}
	public void setBType(Integer bType) {
		BType = bType;
	}
	public Integer getBStatus() {
		return BStatus;
	}
	public void setBStatus(Integer bStatus) {
		BStatus = bStatus;
	}




}