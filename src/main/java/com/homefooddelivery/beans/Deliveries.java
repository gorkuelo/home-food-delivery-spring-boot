package com.homefooddelivery.beans;

import java.util.ArrayList;
import java.util.List;

public class Deliveries {
	private List<Delivery> listDeliveries = new ArrayList<Delivery>();
	private boolean hasDiscount;

	public List<Delivery> getListDeliveries() {
		return listDeliveries;
	}

	public void setListDeliveries(List<Delivery> listDeliveries) {
		this.listDeliveries = listDeliveries;
	}

	public boolean isHasDiscount() {
		return hasDiscount;
	}

	public void setHasDiscount(boolean hasDiscount) {
		this.hasDiscount = hasDiscount;
	}	
	
}
