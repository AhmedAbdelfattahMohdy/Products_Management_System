package com.ahmed.springrest.myproductsrestapi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ahmed.springrest.myproductsrestapi.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
