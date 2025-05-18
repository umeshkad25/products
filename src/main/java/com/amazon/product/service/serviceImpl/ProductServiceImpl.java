package com.amazon.product.service.serviceImpl;

import com.amazon.product.model.Product;
import com.amazon.product.mongoRepo.MongoRepo;
import com.amazon.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl  implements ProductService {

    @Autowired
    private MongoRepo mongoRepo;

    @Autowired
    private MongoTemplate mongoTemplate;



    public Page<Product> getAllProducts(PageRequest pageRequest) {
        Page<Product> listOfProducts=  mongoRepo.findAll(pageRequest);
        return listOfProducts;
    }

    public Product addProduct(Product product) {
        return mongoRepo.save(product);
    }

}
