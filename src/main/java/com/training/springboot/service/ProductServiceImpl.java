package com.training.springboot.service;

import java.util.List;
import java.util.Optional;

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

	@Override
	public Product getByProdId(long id) {
		
		Optional<Product> object = repository.findById(id);
		if(object.isPresent()) {
			return object.get();
		}
		else {
			return null;
		}
	}

	@Override
	public Product updateProduct(Product prod, long id) {
		Optional<Product> object = repository.findById(id);
		if(object.isPresent()) {
			Product oldProduct = object.get();
			oldProduct.setProdName(prod.getProdName());
			oldProduct.setProdDesc(prod.getProdDesc());
			oldProduct.setPrice(prod.getPrice());
			repository.save(oldProduct);
			return oldProduct;
		}
		return null;
	}

	@Override
	public String deleteProduct(long id) {
		repository.deleteById(id);
		return "Product deleted successfully";
	}

}
