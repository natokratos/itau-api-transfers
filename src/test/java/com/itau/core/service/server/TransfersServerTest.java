package com.itau.core.service.server;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itau.api.service.transfers.main.ItauApiTransfersApplication;
import com.itau.core.entity.Transfer;
import com.itau.core.service.client.TransfersClientImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItauApiTransfersApplication.class)
public class TransfersServerTest {

	@Test
	public void test() {
		try {
			TransfersClientImpl transfersClientImpl = new TransfersClientImpl();
			TransfersServer transfersServer = transfersClientImpl.getTransfersImplPort();
			
			if(transfersServer != null) {
				transfersServer.postCreate(new Transfer());
			} else {
				fail(getClass().getName() + ": ERRO Objeto Vazio");
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}

}
