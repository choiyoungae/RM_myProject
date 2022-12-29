package com.cya.rm.myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cya.rm.myproject.repository.CompanyRepository;
import com.cya.rm.myproject.vo.Company;

@Service
public class CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;

	public List<Company> getCompanies() {
		return companyRepository.getForPrintCompanies();
	}

	public int getCompaniesCount() {
		return companyRepository.getCompaniesCount();
	}
}
