package com.sachit.shopsphere.Service;

import java.util.List;

import com.sachit.shopsphere.Entity.Category;
import com.sachit.shopsphere.Entity.Product;
import com.sachit.shopsphere.Exception.CategoryException;

public interface CategoryService {
	
	public Category addCategory(Category category, String key) throws CategoryException;
	
	public Category removeCategory(String ctegoryName, String key) throws CategoryException;
	
	public List<Category> getAllCategory() throws CategoryException;
	
	public Category getCategoryById(Integer catId) throws CategoryException;
	 
	
}
