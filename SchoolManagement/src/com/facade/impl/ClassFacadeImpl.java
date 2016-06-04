package com.facade.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.base.util.ResultCodeDesc;
import com.base.util.ResultMessageDesc;
import com.bean.MClass;
import com.facade.ClassFacade;
import com.request.ClassRequest;
import com.response.ClassResponse;
import com.service.ClassService;

public class ClassFacadeImpl implements ClassFacade {
	private ClassService classService;

	@Override
	public ClassResponse listAll() {
		ClassResponse response = new ClassResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		try {
			List<MClass> result = classService.findAll();
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
	public ClassResponse update(ClassRequest request) {
		ClassResponse response = new ClassResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if (StringUtils.isEmpty(request.getId())) {
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			MClass record = classService.findById(request.getId());
			if (!StringUtils.isEmpty(request.getClassName()))
				record.setClassName(request.getClassName());
			if (!StringUtils.isEmpty(request.getClassNo()))
				record.setClassNo(request.getClassNo());
			if (!StringUtils.isEmpty(request.getGrade()))
				record.setGrade(request.getGrade());
			if (!StringUtils.isEmpty(request.getStudentNum()))
				record.setStudentNum(request.getStudentNum());
			classService.update(record);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public ClassResponse insert(ClassRequest request) {
		// TODO Auto-generated method stub
		ClassResponse response = new ClassResponse();
		response.setResultCode(ResultCodeDesc.ERROR);
		response.setResultMsg(ResultMessageDesc.ERROR);
		if (StringUtils.isEmpty(request.getClassName())
				|| StringUtils.isEmpty(request.getClassNo())
				|| StringUtils.isEmpty(request.getGrade())
				|| StringUtils.isEmpty(request.getStudentNum())) {
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
		}
		try {
			MClass newClass = new MClass();
			newClass.setClassName(request.getClassName());
			newClass.setClassNo(request.getClassNo());
			newClass.setGrade(request.getGrade());
			newClass.setStudentNum(request.getStudentNum());
			classService.insert(newClass);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			e.printStackTrace();
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public ClassResponse delete(ClassRequest request) {
		ClassResponse response = new ClassResponse();
		response.setResultCode(ResultCodeDesc.ERROR);
		response.setResultMsg(ResultMessageDesc.ERROR);
		if(StringUtils.isEmpty(request.getId())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			classService.deleteById(request.getId());
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	public ClassService getClassService() {
		return classService;
	}

	public void setClassService(ClassService classService) {
		this.classService = classService;
	}

}
