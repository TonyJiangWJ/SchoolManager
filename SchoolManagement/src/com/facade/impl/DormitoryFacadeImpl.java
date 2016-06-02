package com.facade.impl;

import com.facade.DormitoryFacade;
import com.request.DormitoryRequest;
import com.response.DormitoryResponse;
import com.service.DormitoryService;

public class DormitoryFacadeImpl implements DormitoryFacade{

	private DormitoryService dormitoryService;
	@Override
	public DormitoryResponse listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DormitoryResponse find(DormitoryRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DormitoryResponse update(DormitoryRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DormitoryResponse delete(DormitoryRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DormitoryResponse insert(DormitoryRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public DormitoryService getDormitoryService() {
		return dormitoryService;
	}

	public void setDormitoryService(DormitoryService dormitoryService) {
		this.dormitoryService = dormitoryService;
	}

}
