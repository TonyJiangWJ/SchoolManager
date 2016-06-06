package com.action.medicaltreat;

import java.util.Map;

import com.facade.MedicalTreatFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.response.MedicalTreatResponse;
/**
 * 查看所有的医疗记录
 * @author 江文杰
 *
 */
public class ListMedAction  extends ActionSupport{
	private MedicalTreatFacade medicalTreatFacade;

	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		MedicalTreatResponse medicalTreatResponse;
		medicalTreatResponse = medicalTreatFacade.listAll();
		requestMap.put("medicalTreatResponse", medicalTreatResponse);
		return"SUCCESS";
	}

	public MedicalTreatFacade getMedicalTreatFacade() {
		return medicalTreatFacade;
	}

	public void setMedicalTreatFacade(MedicalTreatFacade medicalTreatFacade) {
		this.medicalTreatFacade = medicalTreatFacade;
	}
	
}
