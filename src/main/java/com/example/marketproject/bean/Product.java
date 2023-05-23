package com.example.marketproject.bean;



import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String label;
    private String codeProduct;
    private String desc_product;
    private String img;
    private float htPrice;
    private float tva;

    @ManyToOne
    private MarketOwner marketOwner;

    @ManyToOne
    private Category category;

    public String getCodeProduct() {
        return codeProduct;
    }

    public void setCodeProduct(String codeProduct) {
        this.codeProduct = codeProduct;
    }

    public MarketOwner getMarketOwner() {
        return marketOwner;
    }

    public void setMarketOwner(MarketOwner marketOwner) {
        this.marketOwner = marketOwner;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDesc_product() {
        return desc_product;
    }

    public void setDesc_product(String desc) {
        this.desc_product = desc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public float getHtPrice() {
        return htPrice;
    }

    public void setHtPrice(float htPrice) {
        this.htPrice = htPrice;
    }

    public float getTva() {
        return tva;
    }

    public void setTva(float tva) {
        this.tva = tva;
    }
}
