package com.itau.core.service.server;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import org.springframework.stereotype.Component;

import com.itau.core.entity.Account;

@Component(value = "accountsImpl")
@WebService
public interface AccountsServer {
	@WebMethod
	public List<Account> getList(@WebParam(name = "customerId") String customerId);

	@WebMethod
	public Account getRead(@WebParam(name = "accountId") String accountId, @WebParam(name = "customerId") String customerId);
}
