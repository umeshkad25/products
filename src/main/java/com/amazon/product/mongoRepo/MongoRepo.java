package com.amazon.product.mongoRepo;

import com.amazon.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoRepo  extends MongoRepository<Product, String> {

    List<Product> findAll();                              // ✅ Get all products
}
