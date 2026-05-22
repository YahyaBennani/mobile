package com.example.pizzaapp.dao;

import com.example.pizzaapp.models.Pizza;
import java.util.List;

public interface PizzaDao {
    List<Pizza> getAllPizzas();
    Pizza getPizzaById(int id);
}