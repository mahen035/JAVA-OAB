package com.training.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.training.springboot.model.Product;
import com.training.springboot.service.ProductService;

@RestController
@RequestMapping("/api/v1/product")
public class HomeController {
	
//	@Autowired
//	private ProductService service;
	
	@GetMapping("/greet")
	public String greet() {
		return "Hello from spring boot!";
	}
	
//	@PostMapping
//	public ResponseEntity<Product> addProduct(@RequestBody Product product){
//		return new ResponseEntity<>(service.addProduct(product), HttpStatus.CREATED);
//	}
//	
//	@GetMapping
//	public ResponseEntity<List<Product>> getProducts(){
//		return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
//	}
//	
//	@GetMapping("/get")
//	public Product getProdById(@RequestParam long id) {
//		return service.getByProdId(id);
//	}
//	
//	@PutMapping("/{id}")
//	public Product updateProduct(@RequestBody Product prod, @PathVariable long id) {
//		return service.updateProduct(prod, id);
//	}
//	
//	@DeleteMapping("/{id}")
//     public String deleteProduct(@PathVariable long id) {
//		return service.deleteProduct(id);
//	}
}
