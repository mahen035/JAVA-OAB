package com.training.springboot.service;

import java.util.List;

import com.training.springboot.model.Product;

public interface ProductService {
	
	public Product addProduct(Product product);
	public List<Product> getAllProducts();
	public Product getByProdId(long id);
    public Product updateProduct(Product prod, long id);
    public String deleteProduct(long id);
}
