package com.training.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.training.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	public Product findByProdName(String prodName);
	
	@Query(value="select * from product where price > 200",nativeQuery=true)
	public List<Product> findProductPriceMorethan200();

}
