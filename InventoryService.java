package com.sample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.entity.Product;
import com.sample.repository.InventoryRepository;

@Service
public class InventoryService {
	//service layer need repository object
	//add respository dependency
	@Autowired      //this annotation used to inject dependency in SpringBoot
	private InventoryRepository repository;
	
	//business logic 
	//method to insert data
	
	public Product saveData(Product p) {
		Product p1=repository.save(p);
		return p1;
	}
	//method to read all products data
	public List<Product> readAllProducts() {
		List<Product> all=repository.findAll();
		return all;
	}
	//method to delete a product
	public void deleteProduct(int id) {
		repository.deleteById(id);
	}
	//method to update a product
	public Product updateProduct(int id,Product np) {
		Optional<Product> temp=repository.findById(id);
		if(temp.isPresent()) {
			Product op=temp.get();
			op.setPname(np.getPname());
			op.setPqty(np.getPqty());
			op.setPprice(np.getPprice());
			return repository.save(op);
		}
		else {
			throw new RuntimeException("Product not found");
		}
	}


}
