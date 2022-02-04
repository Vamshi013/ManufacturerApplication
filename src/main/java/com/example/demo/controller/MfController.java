package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.example.demo.entity.Component;
import com.example.demo.entity.Product;
import com.example.demo.entity.Supplier;
import com.example.demo.service.ComponentService;
import com.example.demo.service.ProductService;
import com.example.demo.service.SupplierService;

public class MfController {
	
	@Autowired
	private ComponentService componentService;
	private ProductService productService;
	private SupplierService supplierService;
	
	@PostMapping("/component")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addComponent(@RequestBody  Component component) {
		componentService.saveComponent(component);
	}
	@PostMapping("/product")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addProduct(@RequestBody  Product product) {
		productService.saveProduct(product);
	}
	@PostMapping("/supplier")
	@ResponseStatus(code = HttpStatus.CREATED)
	void addSupplier(@RequestBody  Supplier supplier) {
		supplierService.addSupplier(supplier);
	}

}