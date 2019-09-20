package com.pluralsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.pluralsight.model.Customer;
import com.pluralsight.repository.CustomerRepository;

@Service("customerService")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) 
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerRepository customerRepo;
	
	public CustomerServiceImpl() {
		
	}
	
	public CustomerServiceImpl(CustomerRepository customerRepo) {
		System.out.println("We are using constructor injection");
		this.customerRepo = customerRepo;
	}

	public void setCustomerRepo(CustomerRepository customerRepo) {
		System.out.println("We are using setter injection");
		this.customerRepo = customerRepo;
	}

	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}
	
}
