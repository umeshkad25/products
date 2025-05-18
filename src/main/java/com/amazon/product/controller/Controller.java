package com.amazon.product.controller;

import com.amazon.product.model.Product;
import com.amazon.product.service.ProductService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/product")
@CrossOrigin(origins = "http://localhost:3000")
public class Controller {

    @Autowired
    private ProductService productService;

    @GetMapping
    @Operation(summary = "GET ALL PRODUCT", description = "Returns a list of products")
    public Page<Product> getAllProducts(@RequestParam(defaultValue = "0") int page,
                                        @RequestParam(defaultValue = "4") int size) {
        return productService.getAllProducts(PageRequest.of(page, size));
    }

    @PostMapping
    @Operation(summary = "CREATE PRODUCT", description = "Returns a created product")
    public Product createProduct(@RequestBody Product product) {
        return productService.addProduct(product);
    }
}
