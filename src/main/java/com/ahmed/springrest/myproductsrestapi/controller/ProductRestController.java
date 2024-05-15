package com.ahmed.springrest.myproductsrestapi.controller;

import com.ahmed.springrest.myproductsrestapi.model.Product;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ahmed.springrest.myproductsrestapi.repos.ProductRepository;

@RestController
public class ProductRestController {

    @Autowired
    ProductRepository repository;

    @GetMapping("/products/")
    public List<Product> getProducts(){
        return repository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product geProduct(@PathVariable("id") int id){
        return repository.findById(id).get();
    }

    @PostMapping("/products/")
    public Product createProduct(@RequestBody Product product){
        return repository.save(product);
    }

    @PutMapping("/products/")
    public Product updateProduct(@RequestBody Product product){
        return repository.save(product);
    }

    @DeleteMapping("/products/{id}")
    public void delteProduct(@PathVariable("id") int id){
         repository.deleteById(id);
    }
}
