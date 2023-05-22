package com.jsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.dto.Admin;
import com.jsp.dto.BankManager;
import com.jsp.dto.Customer;

public class BankManagerDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("karuna");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();
	
	
	
//	save Bank Manager
	public BankManager saveBankManager(BankManager bankManager) {
		if(bankManager !=null) {
		entityTransaction.begin();
		entityManager.persist(bankManager);
		entityTransaction.commit();
		return bankManager;	
		
	}
		return null;
	}
	
//	find by id
	public BankManager findbyId(int id) {
		return entityManager.find(BankManager.class, id);
		
	}

//	delete Account
	public BankManager deleteBankManager(BankManager bankManager) {
		if (bankManager != null) {
			entityTransaction.begin();
			entityManager.remove(bankManager);
			entityTransaction.commit();
			return bankManager;
		} else {
			return null;

		}
	}
//	update bank manager
	public BankManager update(BankManager bankManager) {
		if (bankManager != null) {
			entityTransaction.begin();
			entityManager.merge(bankManager);
			entityTransaction.commit();
			return bankManager;
		}
		else 
		{
			return null;
			
		}
	
	
	
		
		}
//	getAllbankmanager
	public List<BankManager> getAllBankManagers(){
		String sql= "select s from Bankmanager s";
	Query query =entityManager.createNamedQuery(sql);
	List<BankManager> bankManagers= query.getResultList();
	return bankManagers;
	}
}
