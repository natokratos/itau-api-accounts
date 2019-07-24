package com.itau.api.service.transfers.main;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itau.api.service.accounts.main.ItauApiAccountsApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItauApiAccountsApplication.class)
public class ItauApiAccountsApplicationTest {
	
	@Test
	public void contextLoads() {
	}
	 
	@Test
	public void start() {
		ItauApiAccountsApplication.main(new String[] {});
	}

}
