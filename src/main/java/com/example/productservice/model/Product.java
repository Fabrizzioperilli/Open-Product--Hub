package com.example.productservice.model;


import jakarta.persistence.Entity;
import org.springframework.data.annotation.Id;

@Entity
public class Product {
    @Id
    private Long id;
    private String title;
    private String description;
    private String category;
    private String image;
    private Double price;

}
