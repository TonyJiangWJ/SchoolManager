package com.facade;

import com.request.BorrowRequest;
import com.response.BorrowResponse;

public interface BorrowFacade {
	public BorrowResponse listAll();
	public BorrowResponse update(BorrowRequest request);
	public BorrowResponse insert(BorrowRequest request);
	public BorrowResponse delete(BorrowRequest request);
	public BorrowResponse find(BorrowRequest request);
}
