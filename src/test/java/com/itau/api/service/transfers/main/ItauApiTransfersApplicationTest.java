package com.itau.api.service.transfers.main;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItauApiTransfersApplication.class)
public class ItauApiTransfersApplicationTest {
	
	@Test
	public void contextLoads() {
	}
	 
	@Test
	public void start() {
		ItauApiTransfersApplication.main(new String[] {});
	}

}
