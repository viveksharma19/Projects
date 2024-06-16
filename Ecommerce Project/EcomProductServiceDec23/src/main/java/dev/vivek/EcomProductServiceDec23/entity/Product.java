package dev.vivek.EcomProductServiceDec23.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private int id;
    private String title;
    private double price;
    private String description;
    private String category;  // we have to use category object instead string category
    private String imageURL;
    private double rating;
}
