package com.example.ecom.model;

import java.math.BigDecimal;
import java.sql.Date;
import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String desc;
    private BigDecimal price;
    private String category;
    private Date releaseDate = Date.valueOf(LocalDate.now());
    private boolean available;
    private int quantity;
}

