package com.request;

import com.base.request.BaseRequest;
/**
 * 班级信息的request
 * @author 沈金番
 *
 */
public class ClassRequest extends BaseRequest{
	private String classNo;
    private String className;
    private Integer studentNum;
    private String grade;
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
	public Integer getStudentNum() {
		return studentNum;
	}
	public void setStudentNum(Integer studentNum) {
		this.studentNum = studentNum;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
    
}
