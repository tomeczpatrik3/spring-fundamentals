package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepo;
	
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		System.out.println("We are using constructor injection");
		this.customerRepo = customerRepo;
	}

	//@Autowired
	public void setCustomerRepo(CustomerRepository customerRepo) {
		System.out.println("We are using setter injection");
		this.customerRepo = customerRepo;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

}
