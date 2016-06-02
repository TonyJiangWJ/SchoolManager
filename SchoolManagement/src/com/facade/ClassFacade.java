package com.facade;

import com.request.ClassRequest;
import com.response.ClassResponse;

public interface ClassFacade {
	public ClassResponse listAll();
	public ClassResponse update(ClassRequest request);
	public ClassResponse insert(ClassRequest request);
	public ClassResponse delete(ClassRequest request);
}
