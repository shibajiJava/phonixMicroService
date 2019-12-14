package com.ibm.phoenix.phoenixMicroService.service;

import com.ibm.phoenix.phoenixMicroService.dao.ProductDetails;

public interface ComodityGetService {

	ProductDetails getAllProduct();
	ProductDetails getAllProductByClass();
	ProductDetails getAllProductByFamily();
	ProductDetails getAllProductByComodity();
	ProductDetails getAllProductBySegment();
}
