package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="seller-produce")
public class SellerProduce {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name="seller_id",nullable = false)
    private User seller;

    @ManyToOne(fetch= FetchType.LAZY, optional =false)
    @JoinColumn(name="produce_id",nullable = false)
    private Produce produce;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Float price;


    public SellerProduce() {}

    public long getId() { return id; }
    public void setId(long id) { this.id = id;}

    public User getSeller() { return seller;}
    public void setSeller(User seller) {this.seller = seller;}

    public Produce getProduce() {return produce;}
    public void setProduce(Produce produce) {this.produce = produce;}

    public Integer getQuantity() {return quantity;}
    public void setQuantity(Integer quantity) {this.quantity=quantity;}

    public Float getPrice() {return price;}
    public void setPrice(float price) {this.price=price;}
}
