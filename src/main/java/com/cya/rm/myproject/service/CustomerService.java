package com.cya.rm.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cya.rm.myproject.repository.CustomerRepository;
import com.cya.rm.myproject.vo.Customer;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository coustomerRepository;

	public List<Customer> getCustomers() {
		return coustomerRepository.getForPrintCustomers();
	}

	public int getCustomersCount() {
		return coustomerRepository.getCustomersCount();
	}
}
