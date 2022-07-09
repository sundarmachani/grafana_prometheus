package com.grafana.service;

import java.util.List;

import com.grafana.resource.Product;

public interface ProductService {
	List<Product> getProductList();
	boolean createProducts(List<Product> productList);
	boolean deleteProducts(List<Product> productList);
	long getProductsCount();
}
