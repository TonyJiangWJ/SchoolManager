package com.request;

import java.sql.Timestamp;

import com.base.request.BaseRequest;
/**
 * 医疗信息request
 * @author 沈金番
 *
 */
public class MedicalTreatRequest extends BaseRequest{
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
