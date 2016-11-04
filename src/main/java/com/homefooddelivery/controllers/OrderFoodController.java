package com.homefooddelivery.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.homefooddelivery.beans.Delivery;
import com.homefooddelivery.models.Product;
import com.homefooddelivery.models.ProductDao;

@Controller
@RequestMapping("/orderHomeFood")
public class OrderFoodController {
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Delivery> orderHomeFood(@RequestParam("orders") String orders){
		return this.fromRequestToOrders(orders);
		
	}
	
	private List<Delivery> fromRequestToOrders(String orders){
		List<Delivery> result = new ArrayList<>();
		String[] ordersStr = orders.split("product_");

		for (String orderStr: ordersStr){
			if (!orderStr.equals("")){
				Product product = new Product();
				
				String[] numbers = orderStr.split("number_");
				product = productDao.findById(Integer.parseInt(numbers[0]));
				Delivery delivery = new Delivery(product, Integer.parseInt(numbers[1]));
				result.add(delivery);
			}
		}
		
		return result;
	}
	
	@Autowired
	private ProductDao productDao;


}
