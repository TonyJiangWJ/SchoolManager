package com.facade.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.base.util.ResultCodeDesc;
import com.base.util.ResultMessageDesc;
import com.bean.Dormitory;
import com.facade.DormitoryFacade;
import com.request.DormitoryRequest;
import com.response.DormitoryResponse;
import com.service.DormitoryService;
/**
 * 
 * @author 江文杰
 *
 */
public class DormitoryFacadeImpl implements DormitoryFacade{

	private DormitoryService dormitoryService;
	@Override
	public DormitoryResponse listAll() {
		DormitoryResponse response = new DormitoryResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		try {
			List<Dormitory> result = dormitoryService.findAll();
			if(result==null || result.size()==0){
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
	public DormitoryResponse find(DormitoryRequest request) {
		DormitoryResponse response = new DormitoryResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		
		try {
			Dormitory t = new Dormitory();
			if(!StringUtils.isEmpty(request.getBedNo()))
				t.setBedNo(request.getBedNo());
			if(!StringUtils.isEmpty(request.getDorNo()))
				t.setDorNo(request.getDorNo());
			if(!StringUtils.isEmpty(request.getLocation()))
				t.setLocation(request.getLocation());
			if(!StringUtils.isEmpty(request.getRefStuNo()))
				t.setRefStuNo(request.getRefStuNo());
			if(!StringUtils.isEmpty(request.getSize()))
				t.setSize(request.getSize());
			List<Dormitory> result = dormitoryService.find(t);
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
	public DormitoryResponse update(DormitoryRequest request) {
		DormitoryResponse response = new DormitoryResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if(StringUtils.isEmpty(request.getId())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			Dormitory t = dormitoryService.findById(request.getId());
			if(t==null){
				response.setResultCode(ResultCodeDesc.DATA_MISSING);
				response.setResultMsg(ResultMessageDesc.DATA_MISSING);
				return response;
			}
			if(!StringUtils.isEmpty(request.getBedNo()))
				t.setBedNo(request.getBedNo());
			if(!StringUtils.isEmpty(request.getDorNo()))
				t.setDorNo(request.getDorNo());
			if(!StringUtils.isEmpty(request.getLocation()))
				t.setLocation(request.getLocation());
			if(!StringUtils.isEmpty(request.getRefStuNo()))
				t.setRefStuNo(request.getRefStuNo());
			if(!StringUtils.isEmpty(request.getSize()))
				t.setSize(request.getSize());
			dormitoryService.update(t);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public DormitoryResponse delete(DormitoryRequest request) {
		DormitoryResponse response = new DormitoryResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if(StringUtils.isEmpty(request.getId())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			dormitoryService.deleteById(request.getId());
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public DormitoryResponse insert(DormitoryRequest request) {
		DormitoryResponse response = new DormitoryResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if(StringUtils.isEmpty(request.getBedNo())
				||StringUtils.isEmpty(request.getDorNo())
				||StringUtils.isEmpty(request.getLocation())
				||StringUtils.isEmpty(request.getRefStuNo())
				||StringUtils.isEmpty(request.getSize())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
		}
		try {
			Dormitory newRecord = new Dormitory();
			newRecord.setBedNo(request.getBedNo());
			newRecord.setDorNo(request.getDorNo());
			newRecord.setLocation(request.getLocation());
			newRecord.setRefStuNo(request.getRefStuNo());
			newRecord.setSize(request.getSize());
			dormitoryService.insert(newRecord);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	public DormitoryService getDormitoryService() {
		return dormitoryService;
	}

	public void setDormitoryService(DormitoryService dormitoryService) {
		this.dormitoryService = dormitoryService;
	}

}
