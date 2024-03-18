package io.spring.rabbitmq.rmqproductservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService; 
	
	@PostMapping("/add")
	public ResponseEntity<?> addProdcut(@RequestBody Product product){
		return productService.addProduct(product);
	}
}
