package com.service.impl;

import com.base.dao.BaseDao;
import com.base.service.impl.BaseServiceImpl;
import com.bean.MedicalTreat;
import com.dao.MedicalTreatDao;
import com.service.MedicalTreatService;
/**
 * 
 * @author 江文杰
 *
 */
public class MedicalTreatServiceImpl extends BaseServiceImpl<MedicalTreat> implements MedicalTreatService{

	private MedicalTreatDao medicalTreatDao;
	@Override
	public BaseDao<MedicalTreat> getDao() {
		// TODO Auto-generated method stub
		return medicalTreatDao;
	}
	public MedicalTreatDao getMedicalTreatDao() {
		return medicalTreatDao;
	}
	public void setMedicalTreatDao(MedicalTreatDao medicalTreatDao) {
		this.medicalTreatDao = medicalTreatDao;
	}

}
