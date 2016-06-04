package com.facade.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.base.util.ResultCodeDesc;
import com.base.util.ResultMessageDesc;
import com.bean.Student;
import com.facade.StudentFacade;
import com.request.StudentRequest;
import com.response.StudentResponse;
import com.service.StudentService;

public class StudentFacadeImpl implements StudentFacade {
	private StudentService studentService;

	@Override
	public StudentResponse listAll() {
		StudentResponse response = new StudentResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		try {
			List<Student> result = studentService.findAll();
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
	public StudentResponse find(StudentRequest request) {
		StudentResponse response = new StudentResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);

		try {
			Student t = new Student();
			if (!StringUtils.isEmpty(request.getAge()))
				t.setAge(request.getAge());
			if (!StringUtils.isEmpty(request.getBirthPlace()))
				t.setBirthPlace(request.getBirthPlace());
			if (!StringUtils.isEmpty(request.getClassNo()))
				t.setClassNo(request.getClassNo());
			if (!StringUtils.isEmpty(request.getName()))
				t.setName(request.getName());
			if (!StringUtils.isEmpty(request.getSex()))
				t.setSex(request.getSex());
			if (!StringUtils.isEmpty(request.getSpecialty()))
				t.setSpecialty(request.getSpecialty());
			if (!StringUtils.isEmpty(request.getStuNo()))
				t.setStuNo(request.getStuNo());
			if (!StringUtils.isEmpty(request.getYear()))
				t.setYear(request.getYear());
			List<Student> result = studentService.find(t);
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
	public StudentResponse update(StudentRequest request) {
		StudentResponse response = new StudentResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if (StringUtils.isEmpty(request.getId())) {
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			Student t = studentService.findById(request.getId());
			if (t == null) {
				response.setResultCode(ResultCodeDesc.DATA_MISSING);
				response.setResultMsg(ResultMessageDesc.DATA_MISSING);
				return response;
			}
			if (!StringUtils.isEmpty(request.getAge()))
				t.setAge(request.getAge());
			if (!StringUtils.isEmpty(request.getBirthPlace()))
				t.setBirthPlace(request.getBirthPlace());
			if (!StringUtils.isEmpty(request.getClassNo()))
				t.setClassNo(request.getClassNo());
			if (!StringUtils.isEmpty(request.getName()))
				t.setName(request.getName());
			if (!StringUtils.isEmpty(request.getSex()))
				t.setSex(request.getSex());
			if (!StringUtils.isEmpty(request.getSpecialty()))
				t.setSpecialty(request.getSpecialty());
			if (!StringUtils.isEmpty(request.getStuNo()))
				t.setStuNo(request.getStuNo());
			if (!StringUtils.isEmpty(request.getYear()))
				t.setYear(request.getYear());
			studentService.update(t);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public StudentResponse delete(StudentRequest request) {
		StudentResponse response = new StudentResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if (StringUtils.isEmpty(request.getId())) {
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		try {
			studentService.deleteById(request.getId());
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public StudentResponse insert(StudentRequest request) {
		StudentResponse response = new StudentResponse();
		response.setResultMsg(ResultMessageDesc.ERROR);
		response.setResultCode(ResultCodeDesc.ERROR);
		if (StringUtils.isEmpty(request.getAge())
				|| StringUtils.isEmpty(request.getBirthPlace())
				|| StringUtils.isEmpty(request.getClassNo())
				|| StringUtils.isEmpty(request.getName())
				|| StringUtils.isEmpty(request.getSex())
				|| StringUtils.isEmpty(request.getSpecialty())
				|| StringUtils.isEmpty(request.getStuNo())
				|| StringUtils.isEmpty(request.getYear())) {
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
		}
		try {
			Student newRecord = new Student();
			newRecord.setAge(request.getAge());
			newRecord.setBirthPlace(request.getBirthPlace());
			newRecord.setClassNo(request.getClassNo());
			newRecord.setName(request.getName());
			newRecord.setSex(request.getSex());
			newRecord.setSpecialty(request.getSpecialty());
			newRecord.setStuNo(request.getStuNo());
			newRecord.setYear(request.getYear());

			studentService.insert(newRecord);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
