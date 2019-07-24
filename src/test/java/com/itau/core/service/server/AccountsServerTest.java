package com.itau.core.service.server;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itau.api.service.accounts.main.ItauApiAccountsApplication;
import com.itau.core.entity.Account;
import com.itau.core.service.client.AccountsClientImpl;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItauApiAccountsApplication.class)
public class AccountsServerTest {

	@Test
	public void test() {
		try {
			AccountsClientImpl accountsClientImpl = new AccountsClientImpl();
			AccountsServer accountsServer = accountsClientImpl.getAccountsImplPort();
			
			if(accountsServer != null) {
				if(accountsServer.getList("1") == null) {
					fail(getClass().getName() + ": ERRO Objeto Vazio");
				}
				
				if(accountsServer.getRead("1", "1") == null) {
					fail(getClass().getName() + ": ERRO Objeto Vazio");
				}
			} else {
				fail(getClass().getName() + ": ERRO Objeto Vazio");
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}

}
