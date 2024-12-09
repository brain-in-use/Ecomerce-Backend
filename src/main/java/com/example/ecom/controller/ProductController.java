package com.example.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecom.service.ProductServices;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.ecom.model.Product;
import java.util.List;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductServices service;

    @RequestMapping("/")
    public String greet(){
        return "Home";
    }

    @GetMapping("/product")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @PutMapping("product/add")
    public void addProduct(@RequestBody Product pro) {
        
        service.addProduct(pro);
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable int id) {
        return service.getProductById(id);
    }
    
    
}
