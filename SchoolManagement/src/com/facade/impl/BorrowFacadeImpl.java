package com.facade.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.base.util.ResultCodeDesc;
import com.base.util.ResultMessageDesc;
import com.bean.Borrow;
import com.facade.BorrowFacade;
import com.request.BorrowRequest;
import com.response.BorrowResponse;
import com.service.BorrowService;
/**
 * 
 * @author 江文杰
 *
 */
public class BorrowFacadeImpl implements BorrowFacade {
	private BorrowService borrowService;
	public BorrowService getBorrowService() {
		return borrowService;
	}

	public void setBorrowService(BorrowService borrowService) {
		this.borrowService = borrowService;
	}

	@Override
	public BorrowResponse listAll() {
		BorrowResponse response = new BorrowResponse();
		response.setResultCode(ResultCodeDesc.ERROR);
		response.setResultMsg(ResultMessageDesc.ERROR);
		try{
			List<Borrow> result = borrowService.findAll();
			if(result!=null){
				response.setResult(result);
				response.setResultCode(ResultCodeDesc.SUCCESS);
				response.setResultMsg(ResultMessageDesc.SUCCESS);
			}else{
				response.setResultCode(ResultCodeDesc.DATA_MISSING);
				response.setResultMsg(ResultMessageDesc.DATA_MISSING);
				
			}
		}catch(Exception e){
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public BorrowResponse update(BorrowRequest request) {
		BorrowResponse response = new BorrowResponse();
		response.setResultCode(ResultCodeDesc.ERROR);
		response.setResultMsg(ResultMessageDesc.ERROR);
		System.out.println("update request"+JSON.toJSONString(request));
		if(StringUtils.isEmpty(request.getId())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try{
			Borrow record = borrowService.findById(request.getId());
			if(!StringUtils.isEmpty(request.getBStatus())){
				record.setBStatus(request.getBStatus());
			}
			if(!StringUtils.isEmpty(request.getBName())){
				record.setBName(request.getBName());
			}
			if(!StringUtils.isEmpty(request.getBType())){
				record.setBDate(request.getBDate());
			}
			if(!StringUtils.isEmpty(request.getRefStuNo())){
				record.setRefStuNo(request.getRefStuNo());
			}
			if(!StringUtils.isEmpty(request.getBType())){
				record.setBType(request.getBType());
			}
			borrowService.update(record);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		}catch(Exception e){
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public BorrowResponse insert(BorrowRequest request) {
		BorrowResponse response = new BorrowResponse();
		response.setResultCode(ResultCodeDesc.ERROR);
		response.setResultMsg(ResultMessageDesc.ERROR);
		try{
			if(StringUtils.isEmpty(request.getBDate())
					||StringUtils.isEmpty(request.getBName())
					||StringUtils.isEmpty(request.getBStatus())
					||StringUtils.isEmpty(request.getBType())
					||StringUtils.isEmpty(request.getRefStuNo())){
				response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
				response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
				return response;
			}
			Borrow newBorrow = new Borrow();
			newBorrow.setBDate(request.getBDate());
			newBorrow.setBName(request.getBName());
			newBorrow.setBStatus(request.getBStatus());
			newBorrow.setBType(request.getBType());
			newBorrow.setRefStuNo(request.getRefStuNo());
			borrowService.insert(newBorrow);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		}catch(Exception e){
			e.printStackTrace();
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public BorrowResponse delete(BorrowRequest request) {
		BorrowResponse response = new BorrowResponse();
		response.setResultCode(ResultCodeDesc.ERROR);
		response.setResultMsg(ResultMessageDesc.ERROR);
		if(StringUtils.isEmpty(request.getId())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try{
			borrowService.deleteById(request.getId());
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		}catch(Exception e){
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public BorrowResponse find(BorrowRequest request) {
		BorrowResponse response = new BorrowResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		
		try {
			Borrow t = new Borrow();
			if(!StringUtils.isEmpty(request.getBName()))
				t.setBName(request.getBName());
			if(!StringUtils.isEmpty(request.getBStatus()))
				t.setBStatus(request.getBStatus());
			if(!StringUtils.isEmpty(request.getBType()))
				t.setBType(request.getBType());
			if(!StringUtils.isEmpty(request.getRefStuNo()))
				t.setRefStuNo(request.getRefStuNo());
			List<Borrow> result = borrowService.find(t);
			response.setResult(result);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

}
