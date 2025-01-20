package com.example.ecomweb.controller;

import com.example.ecomweb.model.Product;
import com.example.ecomweb.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
public class ProductController {
    private final ProductService productSvc;

    public ProductController(ProductService productSvc){
        this.productSvc=productSvc;
    }

    @GetMapping
    public String getProducts(Model model){
        model.addAttribute("products",productSvc.getAllProducts());
        return "products";
    }

    @PostMapping
    public String addProduct(Product product){
        productSvc.addProduct(product);
        return "redirect:/products";
    }
}
