package com.action.mclass;

import java.util.Map;

import org.springframework.util.StringUtils;

import com.facade.ClassFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.ClassRequest;
import com.response.ClassResponse;
/**
 * 删除班级信息
 * @author 江文杰
 *
 */
public class DeleteClassAction  extends ActionSupport{
	private ClassFacade classFacade;
	private String id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		ClassResponse mClassResponse;
		ClassRequest request = new ClassRequest();
		if(!StringUtils.isEmpty(id))
			request.setId(Integer.valueOf(id));
		mClassResponse = classFacade.delete(request);
		requestMap.put("classResponse", mClassResponse);
		return"SUCCESS";
	}

	public ClassFacade getClassFacade() {
		return classFacade;
	}

	public void setClassFacade(ClassFacade classFacade) {
		this.classFacade = classFacade;
	}


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}


}
