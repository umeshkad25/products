package com.amazon.product.mongoRepo;

import com.amazon.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface MongoRepo  extends MongoRepository<Product, String> {

    Page<Product> findAll(Pageable pageable); //
    <S extends Product> S save(S entity);
}
