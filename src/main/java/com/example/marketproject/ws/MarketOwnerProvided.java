package com.example.marketproject.ws;

import com.example.marketproject.bean.MarketOwner;
import com.example.marketproject.service.MarketOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("market-project/marketOwner")
public class MarketOwnerProvided {
    @Autowired
    private MarketOwnerService marketOwnerService;

    @GetMapping("/namemarketowner/{name}")
    public MarketOwner findByName(@PathVariable String name) {
        return marketOwnerService.findByName(name);
    }

    @GetMapping("/citymarketowner/{city}")
    public List<MarketOwner> findByCity(@PathVariable String city) {
        return marketOwnerService.findByCity(city);
    }

    @GetMapping("/")
    public List<MarketOwner> findAll() {
        return marketOwnerService.findAll();
    }

    @DeleteMapping("/idMarket/{id}")
    public void deleteById(@PathVariable Long id) {
        marketOwnerService.deleteById(id);
    }

    @GetMapping("/codeMarketowner/{codeMarket}")
    public MarketOwner findByCodeMarket(@PathVariable String codeMarket) {
        return marketOwnerService.findByCodeMarket(codeMarket);
    }

    @PostMapping("/")
    public int save(@RequestBody MarketOwner marketOwner) {
        return marketOwnerService.save(marketOwner);
    }

    @PutMapping("/")
    public int update(@RequestBody MarketOwner marketOwner) {
        return marketOwnerService.update(marketOwner);
    }

}
