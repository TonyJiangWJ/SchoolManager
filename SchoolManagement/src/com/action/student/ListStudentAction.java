package com.action.student;

import java.util.Map;

import com.facade.StudentFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.response.StudentResponse;

public class ListStudentAction  extends ActionSupport{
	private StudentFacade studentFacade;

	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		StudentResponse studentResponse;
		studentResponse = studentFacade.listAll();
		requestMap.put("studentResponse", studentResponse);
		return"SUCCESS";
	}

	public StudentFacade getStudentFacade() {
		return studentFacade;
	}

	public void setStudentFacade(StudentFacade studentFacade) {
		this.studentFacade = studentFacade;
	}
	
}
