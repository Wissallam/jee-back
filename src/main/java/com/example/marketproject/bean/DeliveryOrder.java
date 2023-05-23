package com.example.marketproject.bean;


import jakarta.persistence.*;

@Entity
public class DeliveryOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String paiment_method;
    private String  status;
    @ManyToOne
    private Cart  cart;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaiment_method() {
        return paiment_method;
    }

    public void setPaiment_method(String paiment_method) {
        this.paiment_method = paiment_method;
    }
}
