package com.example.demo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="produce")
public class Produce {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;


    
    public Produce(String name){ this.name =name; }
    
    public long getId() { return id; }
    public void setID(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name;}



}
