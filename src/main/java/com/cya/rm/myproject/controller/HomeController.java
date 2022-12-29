package com.cya.rm.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cya.rm.myproject.service.CompanyService;
import com.cya.rm.myproject.service.CustomerService;
import com.cya.rm.myproject.service.ProductService;
import com.cya.rm.myproject.service.PurchaseInfoService;
import com.cya.rm.myproject.vo.Company;
import com.cya.rm.myproject.vo.Customer;
import com.cya.rm.myproject.vo.Product;
import com.cya.rm.myproject.vo.PurchaseInfo;
import com.cya.rm.myproject.vo.ResultData;

@Controller
public class HomeController {
	
	@Autowired
	ProductService productService;
	@Autowired
	CompanyService companyService;
	@Autowired
	CustomerService customerService;
	@Autowired
	PurchaseInfoService purchaseInfoService;
	
	@RequestMapping("/")
	@ResponseBody 
	public String showMain() {
		String mainText = "상품 정보 -> /product <br/>등록업체 -> /company<br/>구매자 -> /customer<br/>구매정보 -> /purchaseInfo";
		
		return mainText;
	}
	
	@RequestMapping("/product")
	@ResponseBody
	public <DT> ResultData<DT> showProducts() {
		
		int productCount = productService.getProductsCount();

		List<Product> products = productService.getProducts();
		ResultData<DT> rd = ResultData.from(productCount,products);
		
		return rd;
	}
	
	@RequestMapping("/company")
	@ResponseBody
	public <DT> ResultData<DT> showCompanies() {
		
		int companyCount = companyService.getCompaniesCount();

		List<Company> companies = companyService.getCompanies();
		ResultData<DT> rd = ResultData.from(companyCount,companies);
		
		return rd;
	}
	
	@RequestMapping("/customer")
	@ResponseBody
	public <DT> ResultData<DT> showCustomers() {
		
		int customerCount = customerService.getCustomersCount();

		List<Customer> customers = customerService.getCustomers();
		ResultData<DT> rd = ResultData.from(customerCount,customers);
		
		return rd;
	}
	
	@RequestMapping("/purchaseInfo")
	@ResponseBody
	public <DT> ResultData<DT> showPurchaseInfos() {
		
		int purchaseInfoCount = purchaseInfoService.getPurchaseInfosCount();

		List<PurchaseInfo> purchaseInfos = purchaseInfoService.getPurchaseInfos();
		ResultData<DT> rd = ResultData.from(purchaseInfoCount,purchaseInfos);
		
		return rd;
	}

}
