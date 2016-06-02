package com.facade;

import com.request.DormitoryRequest;
import com.response.DormitoryResponse;

public interface DormitoryFacade {
	public DormitoryResponse listAll();
	public DormitoryResponse find(DormitoryRequest request);
	public DormitoryResponse update(DormitoryRequest request);
	public DormitoryResponse delete(DormitoryRequest request);
	public DormitoryResponse insert(DormitoryRequest request);
}
