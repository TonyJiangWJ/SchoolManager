package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.Student;
import com.dao.StudentDao;
import com.service.StudentService;
/**
 * 
 * @author 江文杰
 *
 */
public class StudentServiceImpl extends BaseServiceImpl<Student> implements StudentService{

	private StudentDao studentDao;
	@Override
	public BaseDao<Student> getDao() {
		// TODO Auto-generated method stub
		return studentDao;
	}
	public StudentDao getStudentDao() {
		return studentDao;
	}
	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

}
