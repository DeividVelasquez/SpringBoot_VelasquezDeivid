package com.example.Dia2.service;

import com.example.Dia2.model.Product;
import com.example.Dia2.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    // Constructor con inyección de dependencias
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void addProduct(Product product) {
        productRepository.addProduct(product);
    }

    public Product findProductById(Long id) {
        return productRepository.findById(id);
    }
}
