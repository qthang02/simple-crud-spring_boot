package com.learnspring.simplerestapi.models;

import jakarta.persistence.*;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String productName;
    private int year;
    private Double price;
    private String url;

    public Product() {}
    public Product(String productName, int year, Double price, String url) {
        this.productName = productName;
        this.year = year;
        this.price = price;
        this.url = url;
    }

    public long getId() {
        return id;
    }
    public String getProductName() {
        return productName;
    }
    public int getYear() {
        return year;
    }
    public Double getPrice() {
        return price;
    }
    public String getUrl() {
        return url;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", productName='" + productName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", url='" + url + '\'' +
                '}';
    }
}
