package com.example.ecomweb.service;

import com.example.ecomweb.model.Product;
import com.example.ecomweb.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepo;

    public ProductService(ProductRepository productRepo){
        this.productRepo=productRepo;
    }

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }

    public Product addProduct(Product product){
        return productRepo.save(product);
    }

}
