package com.action.medicaltreat;

import java.util.Map;

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
	private Integer id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		MedicalTreatResponse medicalTreatResponse;
		MedicalTreatRequest request = new MedicalTreatRequest();
		request.setId(id);
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

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
