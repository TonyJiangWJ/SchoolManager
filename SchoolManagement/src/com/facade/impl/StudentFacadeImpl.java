package com.facade.impl;

import com.facade.StudentFacade;
import com.request.StudentRequest;
import com.response.StudentResponse;
import com.service.StudentService;

public class StudentFacadeImpl implements StudentFacade {
	private StudentService studentService;
	@Override
	public StudentResponse listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentResponse find(StudentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentResponse update(StudentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentResponse delete(StudentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public StudentResponse insert(StudentRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	public StudentService getStudentService() {
		return studentService;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
