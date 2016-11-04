package com.homefooddelivery.beans;

import java.io.Serializable;

import com.homefooddelivery.models.Product;

public class Delivery implements Serializable{
	
	private static final long serialVersionUID = 339653616075548882L;
	private Product product;
	private int quantity;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Delivery(Product product, int quantity) {
		super();
		this.product = product;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Order [product=" + product + ", quantity=" + quantity + "]";
	}
	
	
	
	

}
