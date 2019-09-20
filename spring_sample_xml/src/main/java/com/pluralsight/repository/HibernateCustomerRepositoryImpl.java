package com.pluralsight.repository;

import java.util.Arrays;
import java.util.List;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	private String dbUsername;

	public void setDbUsername(String dbUsername) {
		this.dbUsername = dbUsername;
	}

	@Override
	public List<Customer> findAll() {
		System.out.println(this.dbUsername);
		
		Customer customer = new Customer();
		customer.setFirstname("Patrik");
		customer.setLastname("Tomecz");

		return Arrays.asList(customer);
	}

}
