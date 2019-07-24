package com.itau.core.service.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.itau.core.entity.Transfer;

@Component(value = "transfersImpl")
@WebService
public interface TransfersServer {
	
	@WebMethod
	public void postCreate(@WebParam(name = "transfer") Transfer transfer);

}
