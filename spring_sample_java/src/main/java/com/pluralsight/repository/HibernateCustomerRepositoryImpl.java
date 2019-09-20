package com.pluralsight.repository;

import java.util.Arrays;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		Customer customer = new Customer();
		customer.setFirstname("Patrik");
		customer.setLastname("Tomecz");
		
		return Arrays.asList(customer);
	}
	
}
