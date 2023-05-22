package com.jsp.customer.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class DeleteCustomer_Controller {
	public static void main(String[] args) {
		
		CustomerService customerService = new CustomerService();
		Customer customer= customerService.deleteCustomer(1);
		
		if(customer!=null) {
			System.out.println("recorded is deleteed");
	}

	}

}
