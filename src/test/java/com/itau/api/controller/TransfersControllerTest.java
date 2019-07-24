package com.itau.api.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itau.api.service.transfers.main.ItauApiTransfersApplication;
import com.itau.core.entity.Transfer;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItauApiTransfersApplication.class)
public class TransfersControllerTest {

	@Autowired
	TransfersController transfersController;
	
	@Test
	public void test() {
		try {
			transfersController.postCreate("1", "TESTE", new Transfer("1", "2", "Transferindo de 1 para 2", 10.0));
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}
}
