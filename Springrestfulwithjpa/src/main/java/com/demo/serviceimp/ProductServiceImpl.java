package com.demo.serviceimp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jparepositories.ProductRepository;
import com.demo.model.Product;
import com.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	//dependency injection
	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product addProductDetails(Product product) {
		
		Product productdetails = productRepository.save(product);
		return productdetails;
	}

}
