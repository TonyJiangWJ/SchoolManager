package com.action.student;

import java.util.Map;

import com.facade.StudentFacade;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.request.StudentRequest;
import com.response.StudentResponse;

public class SearchStudentAction  extends ActionSupport{
	private StudentFacade studentFacade;
	private String name;
    private Integer age;
    private String year;
    private String birthPlace;
    private String specialty;
    private String classNo;
    private String stuNo;
    private String sex;
	@Override
	public String execute() throws Exception {
		Map<String, Object> requestMap = (Map<String, Object>) ActionContext.getContext().get("request");
		StudentResponse studentResponse = null;
		StudentRequest request = new StudentRequest();
		request.setAge(age);
		request.setBirthPlace(birthPlace);
		request.setClassNo(classNo);
		request.setName(name);
		request.setSex(sex);
		request.setSpecialty(specialty);
		request.setStuNo(stuNo);
		request.setYear(year);
		studentResponse = studentFacade.find(request);
		requestMap.put("studentResponse", studentResponse);
		return"SUCCESS";
	}

	public StudentFacade getStudentFacade() {
		return studentFacade;
	}

	public void setStudentFacade(StudentFacade studentFacade) {
		this.studentFacade = studentFacade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getBirthPlace() {
		return birthPlace;
	}

	public void setBirthPlace(String birthPlace) {
		this.birthPlace = birthPlace;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public String getClassNo() {
		return classNo;
	}

	public void setClassNo(String classNo) {
		this.classNo = classNo;
	}

	public String getStuNo() {
		return stuNo;
	}

	public void setStuNo(String stuNo) {
		this.stuNo = stuNo;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}
}
