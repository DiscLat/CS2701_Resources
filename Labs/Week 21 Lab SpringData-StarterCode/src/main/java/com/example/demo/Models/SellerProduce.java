package com.example.demo.Models;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Seller_Produce")
public class SellerProduce{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="seller_id")//user id
    private User seller;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="produce_id")
    private Produce_Type product;

    @NotBlank
    Integer quantity;

    @NotNull
    @Column(name="price",precision = 8, scale = 2)
    private BigDecimal price;

    
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    public User getSeller(){
        return seller;
    }

    public void setSeller(User seller){
        this.seller = seller;
    }

    public Produce_Type getProduct(){
        return product;
    }   

    public void setProduct(Produce_Type product){
        this.product = product;
    }

    public Integer getQuantity(){
        return quantity;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    public BigDecimal getPrice(){
        return price;
    }

    public void setPrice(BigDecimal price){
        this.price = price;
    }
}