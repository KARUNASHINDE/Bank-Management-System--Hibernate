package com.jsp.customer.controller;

import com.jsp.dto.Customer;
import com.jsp.service.CustomerService;

public class Update_Customer_Controller {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setName("rohit");
		customer.setEmail("rohit@gmail.com");
		customer.setStatus("approved");
		
	
		CustomerService customerService= new CustomerService();
		Customer customer2= customerService.updateCustomer(customer, 1);
		
		
		if(customer2!=null) {
			System.out.println("record updated");
		}
	}
	


}