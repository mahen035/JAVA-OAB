package com.training.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Product;
import com.training.springboot.service.ProductService;

@RestController
@RequestMapping("/api/user")
public class HomeController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public String greet() {
		return "Hello from spring boot!";
	}
	
	@PostMapping("/product")
	public Product addProduct(@RequestBody Product product){
		return service.addProduct(product);
	}
	
	@GetMapping("/product")
	public List<Product> getProducts(){
		return service.getAllProducts();
	}

}
