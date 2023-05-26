package com.example.marketproject.service;

import com.example.marketproject.bean.Product;
import com.example.marketproject.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    public List<Product> findByMarketOwnerCodeMarket(String marketOwnerCode) {
        return productDao.findByMarketOwnerCodeMarket(marketOwnerCode);
    }

    public Product findByCodeProduct(String codeProduct) {
        return productDao.findByCodeProduct(codeProduct);
    }

    public Product save (Product product){
        Product resulta =null;
        if(findByCodeProduct(product.getCodeProduct())==null)
           productDao.save(product);
        return resulta;

    }

    @Transactional
    public int deleteByCodeProduct(String codeProduct) {
        return productDao.deleteByCodeProduct(codeProduct);
    }

    public int update (Product product){
        Product productData=productDao.getOne(product.getId());
        if(productData==null){
            return -1;
        }
        productData.setCodeProduct(product.getCodeProduct());
        productData.setDesc_product(product.getDesc_product());
        productData.setCategory(product.getCategory());
        productData.setHtPrice(product.getHtPrice());
        productData.setLabel(product.getLabel());
        productData.setImg(product.getImg());
        productData.setTva(product.getTva());
        productData.setMarketOwner(product.getMarketOwner());
        productDao.save(productData);
        return 1;
    }


}
