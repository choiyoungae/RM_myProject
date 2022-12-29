package com.cya.rm.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cya.rm.myproject.service.HomeService;
import com.cya.rm.myproject.vo.Product;

@Controller
public class HomeController {
	
	@Autowired
	HomeService homeService;
	
	@RequestMapping("/")
	@ResponseBody
	public List<Product> showMain() {
		return homeService.getProducts();
	}

}
