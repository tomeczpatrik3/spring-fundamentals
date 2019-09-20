package com.pluralsight.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.pluralsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {
	
	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll() {
		System.out.println(this.dbUsername);
		
		Customer customer = new Customer();
		customer.setFirstname("Patrik");
		customer.setLastname("Tomecz");
		
		return Arrays.asList(customer);
	}
	
}
