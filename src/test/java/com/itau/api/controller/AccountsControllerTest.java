package com.itau.api.controller;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itau.api.service.accounts.main.ItauApiAccountsApplication;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItauApiAccountsApplication.class)
public class AccountsControllerTest {

	@Autowired
	AccountsController accountsController;
	
	@Test
	public void testGetList() {
		try {
			accountsController.getList("1", "TESTE");
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}
	@Test
	public void testGetRead() {
		try {
			accountsController.getRead("1", "1", "TESTE");
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}
}