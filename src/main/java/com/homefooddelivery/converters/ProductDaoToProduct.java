package com.homefooddelivery.converters;

import java.util.ArrayList;
import java.util.List;

import com.homefooddelivery.models.Product;
import com.homefooddelivery.models.ProductDao;

public class ProductDaoToProduct implements IProductDaoToProduct{

	public List<Product> fromListProductDaoToListProduct(List<ProductDao> listProductDao){
		Product product;
		List<Product> result = new ArrayList<Product>();
		for(ProductDao productDao : listProductDao){
			product = new Product();
			product.setNombre("");
			result.add(product);
		}
		return result;
	}
}
