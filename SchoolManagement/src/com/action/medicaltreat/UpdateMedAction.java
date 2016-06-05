package com.action.medicaltreat;

import java.sql.Timestamp;
import java.util.Map;

import com.facade.MedicalTreatFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.MedicalTreatRequest;
import com.response.MedicalTreatResponse;

public class UpdateMedAction extends ActionSupport {
	private MedicalTreatFacade medicalTreatFacade;
	private String refStuNo;
    private Timestamp MDate;
    private Double price;
    private Integer MType;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		MedicalTreatResponse medicalTreatResponse;
		MedicalTreatRequest request = new MedicalTreatRequest();
		request.setMDate(MDate);
		request.setMType(MType);
		request.setPrice(price);
		request.setRefStuNo(refStuNo);
		medicalTreatResponse = medicalTreatFacade.update(request);
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