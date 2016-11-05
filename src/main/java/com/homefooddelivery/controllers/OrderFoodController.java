package com.homefooddelivery.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.homefooddelivery.beans.Deliveries;
import com.homefooddelivery.beans.Delivery;
import com.homefooddelivery.enums.TypeFoodEnum;
import com.homefooddelivery.models.Product;
import com.homefooddelivery.models.ProductDao;

@Controller
@RequestMapping("/orderHomeFood")
public class OrderFoodController {
	
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody Deliveries orderHomeFood(@RequestParam("orders") String orders){
		Deliveries result = new Deliveries();
		result.setListDeliveries(this.fromRequestToOrders(orders));
		result.setHasDiscount(this.calcDiscount(result.getListDeliveries()));
		return result;
		
	}
	
	private boolean calcDiscount(List<Delivery> listDeliveries) {
		boolean hasPrincipal = false, 
				hasBebida = false, 
				hasPostre = false;
		for (Delivery delivery: listDeliveries){
			if (delivery.getProduct().getTipo().equals(TypeFoodEnum.PRINCIPAL.type())){
				hasPrincipal= true;
			} else if(delivery.getProduct().getTipo().equals(TypeFoodEnum.BEBIDA.type())){
				hasBebida = true;
			} else if(delivery.getProduct().getTipo().equals(TypeFoodEnum.POSTRE.type())){
				hasPostre = true;
			}
			 
		}
		return hasPrincipal && hasBebida && hasPostre;
	}

	private List<Delivery> fromRequestToOrders(String orders){
		List<Delivery> result = new ArrayList<>();
		String[] ordersStr = orders.split("product_");

		for (String orderStr: ordersStr){
			if (!orderStr.equals("")){
				Product product = new Product();
				
				String[] numbers = orderStr.split("number_");
				product = productDao.findById(Integer.parseInt(numbers[0]));
				int quantity = Integer.parseInt(numbers[1]);
				Delivery delivery = new Delivery(product, quantity, this.calcPrice(quantity, product.getPrecio()));
				result.add(delivery);
			}
		}
		
		return result;
	}
	
	private long calcPrice(int quantity, long precio) {
		int productsToDiscount = quantity / 3;
		quantity = quantity - productsToDiscount;
		return quantity * precio;
	}

	@Autowired
	private ProductDao productDao;


}
