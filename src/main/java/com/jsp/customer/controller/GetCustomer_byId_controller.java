package com.jsp.customer.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class GetCustomer_byId_controller {
	public static void main(String[] args) {
	 CustomerService customerService = new CustomerService();
	Customer customer= 	customerService.getCustomerbyId(1);
	
	
	if(customer!=null) {
		System.out.println(customer.getName());
		System.out.println(customer.getStatus() );	
	
		
	
	
	}


	}

}

