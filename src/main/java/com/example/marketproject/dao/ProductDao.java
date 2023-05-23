package com.example.marketproject.dao;

import com.example.marketproject.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product,Long> {
    Product findByLabel(String label);
    Product findByCodeProduct(String codeProduct);
    //List<Product> findByNomAndPrenom(String nom, String prenon);
    //int deleteById( String cne);

}
