package com.example.marketproject.service;

import com.example.marketproject.bean.MarketOwner;
import com.example.marketproject.bean.Product;
import com.example.marketproject.dao.MarketOwnerDao;
import com.example.marketproject.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MarketOwnerService {

    @Autowired
    private MarketOwnerDao marketOwnerDao;

    public MarketOwner findByName(String name) {
        return marketOwnerDao.findByName(name);
    }

    public List<MarketOwner> findByCity(String city) {
        return marketOwnerDao.findByCity(city);
    }

    public List<MarketOwner> findAll() {
        return marketOwnerDao.findAll();
    }

    public MarketOwner findByCodeMarket(String codeMarket) {
        return marketOwnerDao.findByCodeMarket(codeMarket);
    }


    public int save (MarketOwner marketOwner){
        if(findByCodeMarket(marketOwner.getCodeMarket())!=null)
            return -1;
        else{
            marketOwnerDao.save(marketOwner);
            return 1;
        }
    }

    public void deleteById(Long aLong) {
        marketOwnerDao.deleteById(aLong);
    }

    public int update (MarketOwner marketOwner){
        MarketOwner marketOwnerData=marketOwnerDao.getOne(marketOwner.getId());
        if(marketOwnerData==null){
            return -1;
        }
        marketOwnerData.setCodeMarket(marketOwner.getCodeMarket());
        marketOwnerData.setAdress(marketOwner.getAdress());
        marketOwnerData.setCity(marketOwner.getCity());
        marketOwnerData.setEmail(marketOwner.getEmail());
        marketOwnerData.setPhone_number(marketOwner.getPhone_number());
        marketOwnerDao.save(marketOwner);
        return 1;
    }
}
