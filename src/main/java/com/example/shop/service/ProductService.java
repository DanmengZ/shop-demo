package com.example.shop.service;

import com.example.shop.entity.Product;
import com.example.shop.mapper.ProductMapper;
import org.springframework.stereotype.Service;

import  java.util.List;

@Service
public class ProductService {
    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper) {
        this.productMapper = productMapper;
    }
    public List<Product> listProducts()
    {
        return productMapper.listProducts();
    }
}