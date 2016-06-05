package com.bean;

import com.base.entity.BaseEntity;

public class MClass extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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