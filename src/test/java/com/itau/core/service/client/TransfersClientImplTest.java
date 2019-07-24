package com.itau.core.service.client;

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
public class TransfersClientImplTest {
	@Test
	public void test() {
		try {
			TransfersClientImpl transfersClientImpl = new TransfersClientImpl();
			transfersClientImpl.getTransfersImplPort().postCreate(new Transfer());
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}

}
