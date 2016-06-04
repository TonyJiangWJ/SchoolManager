package com.facade.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.base.util.ResultCodeDesc;
import com.base.util.ResultMessageDesc;
import com.bean.Finance;
import com.facade.FinanceFacade;
import com.request.FinanceRequest;
import com.response.FinanceResponse;
import com.service.FinanceService;

public class FinanceFacadeImpl implements FinanceFacade {
	private FinanceService financeService;
	@Override
	public FinanceResponse listAll() {
		FinanceResponse response = new FinanceResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		try {
			List<Finance> result = financeService.findAll();
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
	public FinanceResponse find(FinanceRequest request) {
		FinanceResponse response = new FinanceResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		
		try {
			Finance t = new Finance();
			if(!StringUtils.isEmpty(request.getClassMoney()))
				t.setClassMoney(request.getClassMoney());
			if(!StringUtils.isEmpty(request.getHouseFee()))
				t.setHouseFee(request.getHouseFee());
			if(!StringUtils.isEmpty(request.getRefStuNo()))
				t.setRefStuNo(request.getRefStuNo());
			if(!StringUtils.isEmpty(request.getTuition()))
				t.setTuition(request.getTuition());
			List<Finance> result = financeService.find(t);
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
	public FinanceResponse update(FinanceRequest request) {
		FinanceResponse response = new FinanceResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if(StringUtils.isEmpty(request.getId())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			Finance t = financeService.findById(request.getId());
			if(t==null){
				response.setResultCode(ResultCodeDesc.DATA_MISSING);
				response.setResultMsg(ResultMessageDesc.DATA_MISSING);
				return response;
			}
			if(!StringUtils.isEmpty(request.getClassMoney()))
				t.setClassMoney(request.getClassMoney());
			if(!StringUtils.isEmpty(request.getHouseFee()))
				t.setHouseFee(request.getHouseFee());
			if(!StringUtils.isEmpty(request.getRefStuNo()))
				t.setRefStuNo(request.getRefStuNo());
			if(!StringUtils.isEmpty(request.getTuition()))
				t.setTuition(request.getTuition());
			financeService.update(t);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public FinanceResponse delete(FinanceRequest request) {
		FinanceResponse response = new FinanceResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if(StringUtils.isEmpty(request.getId())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			financeService.deleteById(request.getId());
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public FinanceResponse insert(FinanceRequest request) {
		FinanceResponse response = new FinanceResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if(StringUtils.isEmpty(request.getClassMoney())
				||StringUtils.isEmpty(request.getHouseFee())
				||StringUtils.isEmpty(request.getRefStuNo())
				||StringUtils.isEmpty(request.getTuition())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
		}
		try {
			Finance newRecord = new Finance();
			newRecord.setClassMoney(request.getClassMoney());
			newRecord.setHouseFee(request.getHouseFee());
			newRecord.setTuition(request.getTuition());
			newRecord.setRefStuNo(request.getRefStuNo());

			financeService.insert(newRecord);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	public FinanceService getFinanceService() {
		return financeService;
	}

	public void setFinanceService(FinanceService financeService) {
		this.financeService = financeService;
	}

}
