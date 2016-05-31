package com.base.response;

import java.util.List;


public class BaseResponse<T> {
	private List<T> result;
	private String resultCode;
	public List<T> getResult() {
		return result;
	}
	public void setResult(List<T> result) {
		this.result = result;
	}
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	
}
