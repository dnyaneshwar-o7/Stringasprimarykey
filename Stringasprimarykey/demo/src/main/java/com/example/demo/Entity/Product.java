package com.example.demo.Entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(
        name = "products",
        schema = "ecommerce",
        uniqueConstraints = {
       @UniqueConstraint(
                name="sku_uniue",
        columnNames = "sku"
       )
        }
)
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @SequenceGenerator(
            name = "product_generator",
            sequenceName="product_sequence_name",
            allocationSize = 1
    )
    private Long id;

    @Column(name = "stock_keeping_unit", nullable = false)
    private String sku;
    @Column(nullable = false)
    private String name;
    private String description;
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }


}
