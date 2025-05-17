package com.amazon.product.service;

import com.amazon.product.model.Product;
import com.amazon.product.mongoRepo.MongoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private MongoRepo mongoRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<Product> getAllProducts() {
        List<Product> listOfProducts= mongoRepo.findAll();
        return listOfProducts;
    }


}
