package com.action.medicaltreat;

import java.sql.Timestamp;
import java.util.Map;

import org.springframework.util.StringUtils;

import com.bean.MedicalTreat;
import com.facade.MedicalTreatFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.MedicalTreatRequest;
import com.response.MedicalTreatResponse;

public class InsertMedAction extends ActionSupport{
	private MedicalTreatFacade medicalTreatFacade;
	private String refStuNo;
    private Timestamp MDate;
    private String price;
    private String MType;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		MedicalTreatResponse medicalTreatResponse;
		MedicalTreatRequest request = new MedicalTreatRequest();
		MDate = new Timestamp(System.currentTimeMillis());
		request.setMDate(MDate);
		if(!StringUtils.isEmpty(MType))
			request.setMType(Integer.valueOf(MType));
		if(!StringUtils.isEmpty(price))
			request.setPrice(Double.valueOf(price));
		request.setRefStuNo(refStuNo);
		medicalTreatResponse = medicalTreatFacade.insert(request);
		requestMap.put("medicalTreatResponse", medicalTreatResponse);
		return"SUCCESS";
	}

	public MedicalTreatFacade getMedicalTreatFacade() {
		return medicalTreatFacade;
	}

	public void setMedicalTreatFacade(MedicalTreatFacade medicalTreatFacade) {
		this.medicalTreatFacade = medicalTreatFacade;
	}

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

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getMType() {
		return MType;
	}

	public void setMType(String mType) {
		MType = mType;
	}

	

}
