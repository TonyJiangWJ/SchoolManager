package com.facade.impl;

import com.facade.ClassFacade;
import com.request.ClassRequest;
import com.response.ClassResponse;
import com.service.ClassService;

public class ClassFacadeImpl implements ClassFacade {
	private ClassService classService;
	@Override
	public ClassResponse listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassResponse update(ClassRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassResponse insert(ClassRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClassResponse delete(ClassRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public ClassService getClassService() {
		return classService;
	}

	public void setClassService(ClassService classService) {
		this.classService = classService;
	}

}
