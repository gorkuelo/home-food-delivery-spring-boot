package com.homefooddelivery.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/orderHomeFood")
public class OrderFoodController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String orderHomeFood(Model model) {
		 System.out.println("evaluate");
		 return "";
		}

}
