package com.action.mclass;

import java.util.Map;

import com.facade.ClassFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.ClassRequest;
import com.response.ClassResponse;
/**
 * 查找班级信息
 * @author 江文杰
 *
 */
public class SearchClassAction  extends ActionSupport{
	private ClassFacade classFacade;
	private String classNo;
    private String className;
    private String grade;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		ClassResponse classResponse = null;
		ClassRequest request = new ClassRequest();
		request.setClassName(className);
		request.setClassNo(classNo);
		request.setGrade(grade);
		classResponse = classFacade.find(request);
		requestMap.put("classResponse", classResponse);
		return"SUCCESS";
	}

	public ClassFacade getClassFacade() {
		return classFacade;
	}

	public void setClassFacade(ClassFacade classFacade) {
		this.classFacade = classFacade;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}


	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}