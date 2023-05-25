package com.example.marketproject.dao;

import com.example.marketproject.bean.MarketOwner;
import com.example.marketproject.bean.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MarketOwnerDao extends JpaRepository<MarketOwner,Long> {
    MarketOwner findByName(String name);
    MarketOwner findByCodeMarket(String codeMarket);
    List<MarketOwner> findByCity(String city);

}
