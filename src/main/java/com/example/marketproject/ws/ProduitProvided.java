package com.example.marketproject.ws;

import com.example.marketproject.bean.Product;
import com.example.marketproject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("market-project/product")
public class ProduitProvided {

    @Autowired
    private ProductService productService;

    @GetMapping("/label/{label}")
    public Product findByLabel(@PathVariable String label) {
        return productService.findByLabel(label);
    }



    @GetMapping("/")
    public List<Product> findAll() {
        return productService.findAll();
    }


    @GetMapping("/marketOwnerCode/{marketOwnerCode}")
    public List<Product> findByMarketOwnerCodeMarket(@PathVariable String marketOwnerCode) {
        return productService.findByMarketOwnerCodeMarket(marketOwnerCode);
    }

    @GetMapping("/codeProduct/{codeProduct}")
    public Product findByCodeProduct(@PathVariable String codeProduct) {
        return productService.findByCodeProduct(codeProduct);
    }

    @PostMapping("/")
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @DeleteMapping("/codeProduct/{codeProduct}")
    public int deleteByCodeProduct(@PathVariable String codeProduct) {
        return productService.deleteByCodeProduct(codeProduct);
    }

    @PutMapping("/")
    public int update(@RequestBody Product product) {
        return productService.update(product);
    }
}
