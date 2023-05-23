package com.example.marketproject.service;

import com.example.marketproject.bean.Product;
import com.example.marketproject.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product findByLabel(String label) {
        return productDao.findByLabel(label);
    }

    public List<Product> findAll() {
        return productDao.findAll();
    }

    public Product findByCodeProduct(String codeProduct) {
        return productDao.findByCodeProduct(codeProduct);
    }

    public int save (Product product){
        if(findByCodeProduct(product.getCodeProduct())!=null)
            return -1;
        else{
            productDao.save(product);
            return 1;
        }
    }


}
