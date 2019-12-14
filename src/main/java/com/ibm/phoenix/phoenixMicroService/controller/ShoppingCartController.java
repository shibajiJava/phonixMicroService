package com.ibm.phoenix.phoenixMicroService.controller;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.phoenix.phoenixMicroService.dao.ProductDetails;



@RestController
@Validated
@RequestMapping("/phoenix")
public class ShoppingCartController {


	
	@GetMapping("/getAllProduct")
	public ProductDetails getAllProduct() {
		ProductDetails productDetails = new ProductDetails();
		productDetails.setSegment("Coats and jackets");
		productDetails.setClassName("12345678");
		productDetails.setFamily("Apparel and Luggage and Personal Care Products");
		return  productDetails;
	}
	
	@GetMapping("/getAllProduct/class")
	public ProductDetails getAllProductByClass() {
		return new ProductDetails();
	}

	
	@GetMapping("/getAllProduct/family")
	public ProductDetails getAllProductByFamily() {
		return new ProductDetails();
	}
	
	@GetMapping("/getAllProduct/comodity")
	public ProductDetails getAllProductByComodity() {
		return new ProductDetails();
	}

	@GetMapping("/getAllProduct/segment")
	public ProductDetails getAllProductBySegment() {
		return new ProductDetails();
	}


}
