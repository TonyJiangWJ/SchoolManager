package com.base.response;

import java.util.List;

/**
 * Response的基类 包含结果 结果代码 结果描述
 * @author 江文杰
 *
 * @param <T>
 */
public class BaseResponse<T> {
	private List<T> result;
	private String resultCode;
	private String resultMsg;
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
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	
}
