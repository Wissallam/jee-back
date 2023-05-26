package com.example.marketproject.dao;

import com.example.marketproject.bean.MarketOwner;
import com.example.marketproject.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
public interface ProductDao extends JpaRepository<Product,Long> {
    Product findByLabel(String label);
    Product findByCodeProduct(String codeProduct);
    List<Product> findByMarketOwner(MarketOwner marketOwner);
    //List<Product> findByNomAndPrenom(String nom, String prenon);

    //int deleteById( String cne);
    int deleteByCodeProduct(String codeProduct);

}
