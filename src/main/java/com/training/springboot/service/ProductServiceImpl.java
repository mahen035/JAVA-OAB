package com.training.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.training.springboot.model.Product;
import com.training.springboot.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	@Override
	public Product addProduct(Product product) {
		return repository.save(product);
	}
	
	@Override
	public List<Product> getAllProducts(){
		return repository.findAll();
	}

}
