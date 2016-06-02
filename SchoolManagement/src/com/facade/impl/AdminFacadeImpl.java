package com.facade.impl;

import java.util.List;

import org.springframework.util.StringUtils;

import com.base.util.ResultCodeDesc;
import com.base.util.ResultMessageDesc;
import com.bean.Admin;
import com.facade.AdminFacade;
import com.request.AdminRequest;
import com.response.AdminResponse;
import com.service.AdminService;

public class AdminFacadeImpl implements AdminFacade {
	private AdminService adminService;
	@Override
	public AdminResponse login(AdminRequest request)  {
		AdminResponse response = new AdminResponse();
		response.setResultCode(ResultCodeDesc.ERROR);
		response.setResultMsg(ResultMessageDesc.ERROR);
		if(StringUtils.isEmpty(request.getPassword())
				||StringUtils.isEmpty(request.getUserName())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		Admin admin = new Admin();
		admin.setUserName(request.getUserName());
		admin.setPassword(request.getPassword());
		try {
			if(adminService.find(admin)!=null){
				response.setResultCode(ResultCodeDesc.SUCCESS);
				response.setResultMsg(ResultMessageDesc.SUCCESS);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
		}
		return response;
	}

	@Override
	public AdminResponse register(AdminRequest request) {
		AdminResponse response = new AdminResponse();
		response.setResultCode(ResultCodeDesc.ERROR);
		response.setResultMsg(ResultMessageDesc.ERROR);
		if(StringUtils.isEmpty(request.getPassword())
				||StringUtils.isEmpty(request.getUserName())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		Admin admin = new Admin();
		admin.setUserName(request.getUserName());
		try {
			if(adminService.find(admin)!=null){
				response.setResultCode(ResultCodeDesc.USER_EXISTS);
				response.setResultCode(ResultMessageDesc.USER_EXISTS);
				return response;
			}else{
				admin.setPassword(request.getPassword());
				adminService.insert(admin);
				response.setResultCode(ResultCodeDesc.SUCCESS);
				response.setResultMsg(ResultMessageDesc.SUCCESS);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public AdminResponse resetPassword(AdminRequest request) {
		AdminResponse response = new AdminResponse();
		response.setResultCode(ResultCodeDesc.ERROR);
		response.setResultMsg(ResultMessageDesc.ERROR);
		if(StringUtils.isEmpty(request.getPassword())
				||StringUtils.isEmpty(request.getUserName())
				||StringUtils.isEmpty(request.getNewPassword())){
			response.setResultCode(ResultCodeDesc.PARAMS_ERROR);
			response.setResultMsg(ResultMessageDesc.PARAMS_ERROR);
			return response;
		}
		Admin record = new Admin();
		record.setPassword(request.getPassword());
		record.setUserName(request.getUserName());
		List<Admin> result;
		try {
			result = adminService.find(record);
			if(result==null||result.size()==0){
				response.setResultCode( ResultCodeDesc.USER_ERROR);
				response.setResultMsg(ResultMessageDesc.USER_ERROR);
				return response;
			}
			record = result.get(0);
			record.setPassword(request.getNewPassword());
			adminService.update(record);
			response.setResultCode(ResultCodeDesc.SUCCESS);
			response.setResultMsg(ResultMessageDesc.SUCCESS);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			response.setResultCode(ResultCodeDesc.SYSTEM_ERROR);
			response.setResultMsg(ResultMessageDesc.SYSTEM_ERROR);
			e.printStackTrace();
		}
		
		return response;
	}

	public AdminService getAdminService() {
		return adminService;
	}

	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}

}
