package com.example.marketproject.dao;

import com.example.marketproject.bean.ImageModel;
import com.example.marketproject.bean.MarketOwner;
import com.example.marketproject.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ImageDao extends JpaRepository<Product,Long> {
    ImageModel findByName(String name);

}
