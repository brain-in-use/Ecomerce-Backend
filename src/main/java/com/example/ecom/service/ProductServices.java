package com.example.ecom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecom.model.Product;
import com.example.ecom.repo.ProductRepo;

@Service
public class ProductServices {

    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts() {
       return repo.findAll();
    }

    public void addProduct(Product pro){
        repo.save(pro);
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }
}
