package com.store.demo_store.service;


import com.store.demo_store.dto.ProductResponse;
import com.store.demo_store.dto.RequestProduct;
import com.store.demo_store.model.Product;
import com.store.demo_store.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(RequestProduct requestProduct) {
        Product product = Product.builder()
                .name(requestProduct.getName())
                .description(requestProduct.getDescription())
                .price(requestProduct.getPrice())
                .build();
        productRepository.save(product);
    }

    public List<ProductResponse> getProducts() {
        return productRepository.findAll().stream()
                .map(product -> ProductResponse.builder()
                        .id(product.getId())
                        .name(product.getName())
                        .description(product.getDescription())
                        .price(product.getPrice())
                        .build())
                .collect(Collectors.toList());
    }
}
