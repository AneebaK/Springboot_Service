package com.store.demo_store.controller;

import com.store.demo_store.dto.ProductResponse;
import com.store.demo_store.dto.RequestProduct;
import com.store.demo_store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/product")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody RequestProduct requestProduct) {
        // Create product
        productService.createProduct(requestProduct);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getProducts() {
        // Get all products
        return productService.getProducts();
    }
}


//{
//        "name" : "kekes",
//        "description" : "choco",
//        "category" : "food",
//        "price" : 22
//        }