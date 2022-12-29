package com.cya.rm.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cya.rm.myproject.service.ProductService;
import com.cya.rm.myproject.vo.Product;
import com.cya.rm.myproject.vo.ResultData;

@Controller
public class HomeController {
	
	@Autowired
	ProductService productService;
	
	@RequestMapping("/product")
	@ResponseBody
	public <DT> ResultData<DT> showMain() {
		
		int productCount = productService.getProductsCount();

		List<Product> product = productService.getProducts();
		ResultData<DT> rd = ResultData.from(productCount,product);
		
		return rd;
	}

}
