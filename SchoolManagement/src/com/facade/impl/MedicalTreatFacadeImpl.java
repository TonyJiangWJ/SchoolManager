package com.facade.impl;

import com.facade.MedicalTreatFacade;
import com.request.MedicalTreatRequest;
import com.response.MedicalTreatResponse;
import com.service.MedicalTreatService;

public class MedicalTreatFacadeImpl implements MedicalTreatFacade {
	private MedicalTreatService medicalTreatService;
	@Override
	public MedicalTreatResponse listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicalTreatResponse find(MedicalTreatRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicalTreatResponse update(MedicalTreatRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicalTreatResponse delete(MedicalTreatRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MedicalTreatResponse insert(MedicalTreatRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public MedicalTreatService getMedicalTreatService() {
		return medicalTreatService;
	}

	public void setMedicalTreatService(MedicalTreatService medicalTreatService) {
		this.medicalTreatService = medicalTreatService;
	}

}
