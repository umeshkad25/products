package com.amazon.product.service;

import com.amazon.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface ProductService {

    public Page<Product> getAllProducts(PageRequest pageRequest);
    public Product addProduct(Product product);

}
