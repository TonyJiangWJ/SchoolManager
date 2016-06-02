package com.facade;

import com.request.MedicalTreatRequest;
import com.response.MedicalTreatResponse;

public interface MedicalTreatFacade {
	public MedicalTreatResponse listAll();
	public MedicalTreatResponse find(MedicalTreatRequest request);
	public MedicalTreatResponse update(MedicalTreatRequest request);
	public MedicalTreatResponse delete(MedicalTreatRequest request);
	public MedicalTreatResponse insert(MedicalTreatRequest request);
}
