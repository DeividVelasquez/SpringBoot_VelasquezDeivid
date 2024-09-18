package com.example.Dia2;

import com.example.Dia2.controller.ProductController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Dia2Application implements CommandLineRunner {

    private final ProductController productController;

    public Dia2Application(ProductController productController) {
        this.productController = productController;
    }

    public static void main(String[] args) {
    SpringApplication.run(Dia2Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productController.run();
    }
}
