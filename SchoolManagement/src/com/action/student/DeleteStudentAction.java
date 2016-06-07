package com.action.student;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.facade.StudentFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.StudentRequest;
import com.response.StudentResponse;
/**
 * 删除学生信息
 * @author 夏超男
 *
 */

public class DeleteStudentAction  extends ActionSupport{
	private StudentFacade studentFacade;
	private String id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		StudentResponse studentResponse;
		StudentRequest request = new StudentRequest();
		if(!StringUtils.isEmpty(id))
			request.setId(Integer.valueOf(id));
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}



}
