package com.action.student;

import java.util.Map;

import com.facade.StudentFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.StudentRequest;
import com.response.StudentResponse;

public class DeleteStudentAction  extends ActionSupport{
	private StudentFacade studentFacade;
	private Integer id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		StudentResponse studentResponse;
		StudentRequest request = new StudentRequest();
		request.setId(id);
		studentResponse = studentFacade.delete(request);
		requestMap.put("studentResponse", studentResponse);
		return"SUCCESS";
	}

	public StudentFacade getStudentFacade() {
		return studentFacade;
	}

	public void setStudentFacade(StudentFacade studentFacade) {
		this.studentFacade = studentFacade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
