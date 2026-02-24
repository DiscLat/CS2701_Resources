package com.example.demo.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Seller_Produce")
public class SellerProduce{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="seller_id")
    private User seller;

    @ManyToMany
    @JoinTable(name="produce_to_seller", joinColumns = @JoinColumn(name="seller_id"), inverseJoinColumns = @JoinColumn(name="produce_id"))
    private List<Produce_Type> produceTypes;



    
}