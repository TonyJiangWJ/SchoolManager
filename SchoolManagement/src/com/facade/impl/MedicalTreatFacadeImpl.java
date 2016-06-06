package com.facade.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.base.util.ResultCodeDesc;
import com.base.util.ResultMessageDesc;
import com.bean.MedicalTreat;
import com.facade.MedicalTreatFacade;
import com.request.MedicalTreatRequest;
import com.response.MedicalTreatResponse;
import com.service.MedicalTreatService;
/**
 * 
 * @author 江文杰
 *
 */
public class MedicalTreatFacadeImpl implements MedicalTreatFacade {
	private MedicalTreatService medicalTreatService;

	@Override
	public MedicalTreatResponse listAll() {
		MedicalTreatResponse response = new MedicalTreatResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		try {
			List<MedicalTreat> result = medicalTreatService.findAll();
			if (result == null || result.size() == 0) {
				response.setResultCode(ResultCodeDesc.DATA_MISSING);
				response.setResultMsg(ResultMessageDesc.DATA_MISSING);
				return response;
			}
			response.setResult(result);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public MedicalTreatResponse find(MedicalTreatRequest request) {
		MedicalTreatResponse response = new MedicalTreatResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);

		try {
			MedicalTreat t = new MedicalTreat();
			if (!StringUtils.isEmpty(request.getMDate()))
				t.setMDate(request.getMDate());
			if (!StringUtils.isEmpty(request.getMType()))
				t.setMType(request.getMType());
			if (!StringUtils.isEmpty(request.getPrice()))
				t.setPrice(request.getPrice());
			if (!StringUtils.isEmpty(request.getRefStuNo()))
				t.setRefStuNo(request.getRefStuNo());
			List<MedicalTreat> result = medicalTreatService.find(t);
			response.setResult(result);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public MedicalTreatResponse update(MedicalTreatRequest request) {
		MedicalTreatResponse response = new MedicalTreatResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if (StringUtils.isEmpty(request.getId())) {
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			MedicalTreat t = medicalTreatService.findById(request.getId());
			if (t == null) {
				response.setResultCode(ResultCodeDesc.DATA_MISSING);
				response.setResultMsg(ResultMessageDesc.DATA_MISSING);
				return response;
			}
			if (!StringUtils.isEmpty(request.getMDate()))
				t.setMDate(request.getMDate());
			if (!StringUtils.isEmpty(request.getMType()))
				t.setMType(request.getMType());
			if (!StringUtils.isEmpty(request.getPrice()))
				t.setPrice(request.getPrice());
			if (!StringUtils.isEmpty(request.getRefStuNo()))
				t.setRefStuNo(request.getRefStuNo());
			medicalTreatService.update(t);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public MedicalTreatResponse delete(MedicalTreatRequest request) {
		MedicalTreatResponse response = new MedicalTreatResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if (StringUtils.isEmpty(request.getId())) {
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			medicalTreatService.deleteById(request.getId());
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public MedicalTreatResponse insert(MedicalTreatRequest request) {
		MedicalTreatResponse response = new MedicalTreatResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if (StringUtils.isEmpty(request.getMDate())
				|| StringUtils.isEmpty(request.getMType())
				|| StringUtils.isEmpty(request.getRefStuNo())
				|| StringUtils.isEmpty(request.getPrice())) {
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
		}
		try {
			MedicalTreat newRecord = new MedicalTreat();
			newRecord.setMDate(request.getMDate());
			newRecord.setMType(request.getMType());
			newRecord.setPrice(request.getPrice());
			newRecord.setRefStuNo(request.getRefStuNo());

			medicalTreatService.insert(newRecord);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	public MedicalTreatService getMedicalTreatService() {
		return medicalTreatService;
	}

	public void setMedicalTreatService(MedicalTreatService medicalTreatService) {
		this.medicalTreatService = medicalTreatService;
	}

}
