package com.action.mclass;

import java.util.Map;

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
	private ClassFacade mClassFacade;
	private Integer id;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		ClassResponse mClassResponse;
		ClassRequest request = new ClassRequest();
		request.setId(id);
		mClassResponse = mClassFacade.delete(request);
		requestMap.put("mClassResponse", mClassResponse);
		return"SUCCESS";
	}

	public ClassFacade getClassFacade() {
		return mClassFacade;
	}

	public void setClassFacade(ClassFacade mClassFacade) {
		this.mClassFacade = mClassFacade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
