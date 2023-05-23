package com.example.marketproject.bean;


import jakarta.persistence.*;
import jdk.jfr.Enabled;

@Entity
public class ProductCart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int quantity;
    @ManyToOne
    private Product product;
    @ManyToOne
    private Cart cart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
