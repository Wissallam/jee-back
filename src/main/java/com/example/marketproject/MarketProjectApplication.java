package com.example.marketproject;

import com.example.marketproject.bean.Product;
import com.example.marketproject.dao.ProductDao;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MarketProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(MarketProjectApplication.class, args);
    }

    @Bean
    ApplicationRunner applicationRunner(ProductDao productDao){
        return args -> {
            productDao.save(new Product("lait"));
            productDao.save(new Product("pomme"));
        };
    }
}
