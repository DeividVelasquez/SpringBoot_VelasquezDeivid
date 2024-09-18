package com.example.Dia2.config;

import com.example.Dia2.repository.ProductRepository;
import com.example.Dia2.service.ProductService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.Scanner;

@Configuration
public class AppConfig {

    @Bean
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    @Bean
    public ProductService productService(ProductRepository productRepository) {
        return new ProductService(productRepository);
    }

    @Bean
    public Scanner scanner() {
        return new Scanner(System.in);
    }
}
