package com.homefooddelivery.beans;

import java.io.Serializable;

import com.homefooddelivery.models.Product;

public class Delivery implements Serializable{
	
	private static final long serialVersionUID = 339653616075548882L;
	private Product product;
	private int quantity;
	private long price;
	
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

	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Delivery(Product product, int quantity, long price) {
		super();
		this.product = product;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Delivery [product=" + product + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
