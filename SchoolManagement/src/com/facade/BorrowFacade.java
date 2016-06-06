package com.facade;

import com.request.BorrowRequest;
import com.response.BorrowResponse;

public interface BorrowFacade {
	//查看所有
	public BorrowResponse listAll();
	//更新
	public BorrowResponse update(BorrowRequest request);
	//插入
	public BorrowResponse insert(BorrowRequest request);
	//删除
	public BorrowResponse delete(BorrowRequest request);
	//查找
	public BorrowResponse find(BorrowRequest request);
}
