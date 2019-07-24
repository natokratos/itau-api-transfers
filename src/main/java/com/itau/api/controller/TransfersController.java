package com.itau.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.core.entity.Transfer;
import com.itau.core.service.client.TransfersClientImpl;

@RestController
@RequestMapping("/transfers")
public class TransfersController {
	@PostMapping(value = "/send")
	public void postCreate(String customerId, String authorization, Transfer transfer) {
		TransfersClientImpl transfersClientImpl = new TransfersClientImpl();
		transfersClientImpl.getTransfersImplPort().postCreate(transfer);
	}
}
