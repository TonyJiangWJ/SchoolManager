package com.action.medicaltreat;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.facade.MedicalTreatFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.MedicalTreatRequest;
import com.response.MedicalTreatResponse;
/**
 * 删除医疗记录
 * @author 江文杰
 *
 */
public class DeleteMedAction  extends ActionSupport{
	private MedicalTreatFacade medicalTreatFacade;
	private String id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		MedicalTreatResponse medicalTreatResponse;
		MedicalTreatRequest request = new MedicalTreatRequest();
		if(!StringUtils.isEmpty(id))
			request.setId(Integer.valueOf(id));
		medicalTreatResponse = medicalTreatFacade.delete(request);
		requestMap.put("medicalTreatResponse", medicalTreatResponse);
		return"SUCCESS";
	}

	public MedicalTreatFacade getMedicalTreatFacade() {
		return medicalTreatFacade;
	}

	public void setMedicalTreatFacade(MedicalTreatFacade medicalTreatFacade) {
		this.medicalTreatFacade = medicalTreatFacade;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



}
