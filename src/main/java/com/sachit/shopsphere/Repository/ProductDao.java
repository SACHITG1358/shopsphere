package com.sachit.shopsphere.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sachit.shopsphere.Entity.Category;
import com.sachit.shopsphere.Entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product, Integer>{
	
	public Product findByProductName(String productName);
	
	public List<Product> findByCategory(Category category);
	
}
