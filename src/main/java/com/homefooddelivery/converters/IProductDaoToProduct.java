package com.homefooddelivery.converters;

import java.util.List;

import com.homefooddelivery.models.Product;
import com.homefooddelivery.models.ProductDao;

public interface IProductDaoToProduct {
	public List<Product> fromListProductDaoToListProduct(List<ProductDao> listProductDao);
}
