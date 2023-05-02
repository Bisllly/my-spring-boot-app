package com.example.myspringbootapp.repository;

import com.example.myspringbootapp.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
