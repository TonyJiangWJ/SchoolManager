package com.action.mclass;

import java.util.Map;

import com.facade.ClassFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.response.ClassResponse;
/**
 * 查看所有的班级信息
 * @author 江文杰
 *
 */
public class ListClassAction  extends ActionSupport{
	private ClassFacade classFacade;

	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		ClassResponse classResponse;
		classResponse = classFacade.listAll();
		requestMap.put("classResponse", classResponse);
		return"SUCCESS";
	}

	public ClassFacade getClassFacade() {
		return classFacade;
	}

	public void setClassFacade(ClassFacade classFacade) {
		this.classFacade = classFacade;
	}
	
}

