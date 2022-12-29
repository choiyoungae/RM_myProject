package com.cya.rm.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cya.rm.myproject.repository.ProductRepository;
import com.cya.rm.myproject.vo.Product;

@Service
public class HomeService {
	
	@Autowired
	ProductRepository productRepository;

	public List<Product> getProducts() {
		return productRepository.getForPrintProducts();
	}
}
