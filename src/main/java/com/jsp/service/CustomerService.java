package com.jsp.service;

import java.util.List;

import com.jsp.dao.CustomerDao;
import com.jsp.dto.Customer;

public class CustomerService {
	CustomerDao customerDao = new CustomerDao();
	
//	save Customer
	public Customer SaveCustomer(Customer customer) {
		if(customer!=null) {
			customer.setStatus("Approved");
		}
		return customerDao.saveCustomer(customer);
	}
		
		
//	Get Customer By ID
		public Customer getCustomerbyId(int id) {
			return customerDao.getCustomerbyId(id);
		}
		
//		update CUstomer
		public Customer updateCustomer(Customer customer, int id) {
			Customer customer2 = customerDao.getCustomerbyId(id);
			if (customer.getName() != null)
				customer2.setName(customer.getName());
			if (customer.getEmail() != null)
				customer2.setEmail(customer.getEmail());
			if (customer2 != null) {
				return customerDao.updateCustomer(customer2);
			}
			return null;
		}
		
//		delete Customer
		public Customer deleteCustomer(int id) {
			Customer customer= customerDao.getCustomerbyId(id);
			if(customer!=null) {
				customerDao.deleteCustomer(customer);
				
				return null;
			}
			return customer;
	}
//			Get All Customer
			public List<Customer> getACustomers(){
			{
				return customerDao.getAllCustomer();
			}
			
		}
}

		
			
	
	
	

