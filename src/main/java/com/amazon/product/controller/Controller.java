package com.amazon.product.controller;

import com.amazon.product.model.Product;
import com.amazon.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/product")
public class Controller {

    @Autowired
    private ProductService productService;

    @GetMapping
    @Operation(summary = "GET ALL PRODUCT", description = "Returns a list of products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

}
