package com.jsp.Account.Controller;

import com.jsp.dto.Account;
import com.jsp.dto.Customer;
import com.jsp.service.AccountService;
import com.jsp.service.CustomerService;

public class Save_Account {
public static void main(String[] args) {
	CustomerService customerService = new CustomerService();
	 Customer customer=  customerService.getCustomerbyId(3);
	 Customer customer2 = customerService.getCustomerbyId(2);
	
	Account account = new Account();
	account.setName("Saving ccount");
	account.setIfsc_code("678gkh");
	account.setCustomer(customer);
	account.setBalance(5879860);
	account.setAccount_no("786978049037");
	
	Account account2 = new Account();
	account.setName("saving Account");
	account.setIfsc_code("70gnltn5");
	account.setCustomer(customer2);
	account.setBalance(58956);
	account.setAccount_no("786905659807");
	
	
	AccountService accountService = new AccountService();
Account account3=	accountService.saveAccount(account);
if(account3!=null) {
	System.out.println("Account Id" + account3.getId()+"Added");
	
	Account account4 = accountService.saveAccount(account2);
	if(account4 !=null)
 System.out.println("Account Id" + account4.getId()+"Added");
 

}
}
}
