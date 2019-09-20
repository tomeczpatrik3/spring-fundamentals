package com.pluralsight.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Override
	public List<Customer> findAll() {
		Customer customer = new Customer();
		customer.setFirstname("Patrik");
		customer.setLastname("Tomecz");
		
		return Arrays.asList(customer);
	}
	
}
