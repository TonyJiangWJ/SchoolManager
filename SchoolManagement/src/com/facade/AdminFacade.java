package com.facade;

import com.request.AdminRequest;
import com.response.AdminResponse;

public interface AdminFacade {
	public AdminResponse login(AdminRequest request) throws Exception;
	public AdminResponse register(AdminRequest request);
	public AdminResponse resetPassword(AdminRequest request);
}
