package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
import com.jsp.dto.Customer;


public class CustomerDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karuna");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
//	saveustomer
	public Customer saveCustomer(Customer customer ) {
		if(customer !=null) {
		entityTransaction.begin();
		entityManager.persist(customer);
		entityTransaction.commit();
		return customer;
	}
		return null;
	}
//	getCustomerbyid
	
	public Customer getCustomerbyId(int id) {
		return entityManager.find(Customer.class, id);
	}
	
//	updatecustomerbyid
	public Customer updateCustomer(Customer  customer) {
		if(customer!=null) {
			entityTransaction.begin();
			entityManager.persist(customer);
			entityTransaction.commit();
		}
		return null;
	}
//	deleteCustomer
	public Customer deleteCustomer(Customer customer) {
		if (customer != null) {
			entityTransaction.begin();
			entityManager.remove(customer);
			entityTransaction.commit();
			return customer;
		} else {
			
			return null;
	
		}}
//	getAllCustomer
	public List<Customer> getAllCustomer(){
		String sql="select s from Customer s";
	Query query=entityManager.createQuery(sql);
		List<Customer> customers= query.getResultList();
		return customers;
	}
	
}
	
	
		
		
	
	


