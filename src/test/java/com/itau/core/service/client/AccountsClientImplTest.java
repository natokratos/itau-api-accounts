package com.itau.core.service.client;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.itau.api.service.accounts.main.ItauApiAccountsApplication;
import com.itau.core.entity.Account;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ItauApiAccountsApplication.class)
public class AccountsClientImplTest {
	@Test
	public void testGetList() {
		try {
			AccountsClientImpl accountsClientImpl = new AccountsClientImpl();
			List<Account> l = accountsClientImpl.getAccountsImplPort().getList("1");
			
			if (l == null) {
				fail(getClass().getName() + ": ERRO List not found");
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}

	@Test
	public void testGetRead() {
		try {
			AccountsClientImpl accountsClientImpl = new AccountsClientImpl();
			Account a = accountsClientImpl.getAccountsImplPort().getRead("1", "1");
			
			if (a == null) {
				fail(getClass().getName() + ": ERRO List not found");
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());
		}
	}
}
