package com.itau.core.entity;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AccountTest {

	@Test
	public void testIfCreated() {
		try {
			Account a = new Account();
			
			if(a.getAccountId() != null && a.getAccountId().isEmpty()) {
				a = new Account("1", "1", "1", "Renato", "cc", 100.0, 20.0, 80.0);
				if(a.getAccountId() != "1" ||
						a.getAccountNumber() != "1" ||
						a.getOwnerCustomerId() != "1" ||
						a.getName() != "Renato" ||
						a.getAccountType() != "cc" ||
						a.getAvailable() != 100.0 ||
						a.getBalance() != 20.0 ||
						a.getCreditLimit() != 80.0) {
					fail(getClass().getName() + ": ERRO Objeto Vazio");
				}
			} else {
				fail(getClass().getName() + ": ERRO Objeto Vazio");
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());			
		}
	}

	@Test
	public void testIfFilled() {
		try {
			Account a = new Account();
			
			if(a.getAccountId() != null && a.getAccountId().isEmpty()) {
				a.setAccountId("1");
				a.setAccountNumber("1");
				a.setOwnerCustomerId("1");
				a.setName("Renato");
				a.setAccountType("cc");
				a.setAvailable(100.0);
				a.setBalance(20.0);
				a.setCreditLimit(80.0);				
	
				if(a.getAccountId() != "1" ||
						a.getAccountNumber() != "1" ||
						a.getOwnerCustomerId() != "1" ||
						a.getName() != "Renato" ||
						a.getAccountType() != "cc" ||
						a.getAvailable() != 100.0 ||
						a.getBalance() != 20.0 ||
						a.getCreditLimit() != 80.0) {
					fail(getClass().getName() + ": ERRO Dados divergentes" );
				}
			}
		} catch(Exception e) {
			fail(getClass().getName() + ": ERRO " + e.getLocalizedMessage());			
		}
	}

}
