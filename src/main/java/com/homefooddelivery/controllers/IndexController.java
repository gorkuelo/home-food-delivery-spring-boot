package com.homefooddelivery.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homefooddelivery.models.Product;
import com.homefooddelivery.models.ProductDao;
import com.homefooddelivery.services.IProductServices;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	String index(){
		Iterable<Product> findAll = productDao.findAll();
		return "index";
	}
	
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private IProductServices productServices;

}
