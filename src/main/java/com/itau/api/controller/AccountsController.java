package com.itau.api.controller;

import java.util.List;

import javax.jws.WebParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.itau.core.entity.Account;
import com.itau.core.service.client.AccountsClientImpl;

@RestController
@RequestMapping("/accounts")
public class AccountsController {
	@GetMapping(value = "/list")
	public List<Account> getList(String customerId, String authorization) {
		return new AccountsClientImpl().getAccountsImplPort().getList(customerId);
	}
	
	@GetMapping(value = "/get")
	//public Account getRead(@WebParam(name = "accountId") String accountId, @WebParam(name = "customerId") String customerId, String authorization) {
	public Account getRead(String accountId, String customerId, String authorization) {
		return new AccountsClientImpl().getAccountsImplPort().getRead(accountId, customerId);
	}

}
