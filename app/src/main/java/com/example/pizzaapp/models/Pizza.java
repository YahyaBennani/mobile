package com.example.pizzaapp.models;

import java.io.Serializable;

public class Pizza implements Serializable {
    private int id;
    private String name;
    private double price;
    private int preparationTime; // en minutes
    private int imageResId;
    private String description;
    private String ingredients;

    public Pizza(int id, String name, double price, int preparationTime,
                 int imageResId, String description, String ingredients) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.preparationTime = preparationTime;
        this.imageResId = imageResId;
        this.description = description;
        this.ingredients = ingredients;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    public int getPreparationTime() { return preparationTime; }
    public void setPreparationTime(int preparationTime) { this.preparationTime = preparationTime; }
    public int getImageResId() { return imageResId; }
    public void setImageResId(int imageResId) { this.imageResId = imageResId; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public String getIngredients() { return ingredients; }
    public void setIngredients(String ingredients) { this.ingredients = ingredients; }
}