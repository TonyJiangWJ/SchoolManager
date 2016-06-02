package com.facade;

import com.request.StudentRequest;
import com.response.StudentResponse;


public interface StudentFacade {
	public StudentResponse listAll();
	public StudentResponse find(StudentRequest request);
	public StudentResponse update(StudentRequest request);
	public StudentResponse delete(StudentRequest request);
	public StudentResponse insert(StudentRequest request);
}
