package com.facade.impl;

import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.util.StringUtils;

import com.alibaba.fastjson.JSON;
import com.base.util.ResultCodeDesc;
import com.base.util.ResultMessageDesc;
import com.bean.MClass;
import com.facade.ClassFacade;
import com.request.ClassRequest;
import com.response.ClassResponse;
import com.service.ClassService;
/**
 * 
 * @author 江文杰
 *
 */
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
		System.out.println("ClassFacadeImpl Request:"+JSON.toJSONString(request));
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
		System.out.println("ClassFacadeImpl Request:"+JSON.toJSONString(request));
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
		System.out.println("ClassFacadeImpl Request:"+JSON.toJSONString(request));
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

	@Override
	public ClassResponse find(ClassRequest request) {
		System.out.println("ClassFacadeImpl Request:"+JSON.toJSONString(request));
		ClassResponse response = new ClassResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		
		try {
			MClass t = new MClass();
			if(!StringUtils.isEmpty(request.getClassName())){
				t.setClassName(request.getClassName());
				System.out.println("lala caonima");
			}
			if(!StringUtils.isEmpty(request.getClassNo()))
				t.setClassNo(request.getClassNo());
			if(!StringUtils.isEmpty(request.getGrade()))
				t.setGrade(request.getGrade());
			List<MClass> result = classService.find(t);
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
