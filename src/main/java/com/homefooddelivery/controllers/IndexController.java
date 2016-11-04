package com.homefooddelivery.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.homefooddelivery.models.Product;
import com.homefooddelivery.models.ProductDao;

@Controller
public class IndexController {
	
	@RequestMapping("/")
	String index(Model model){
		Iterable<Product> findAll = productDao.findAll();
		model.addAttribute("products", findAll);
		return "index";
	}
	
	
	@Autowired
	private ProductDao productDao;

}
