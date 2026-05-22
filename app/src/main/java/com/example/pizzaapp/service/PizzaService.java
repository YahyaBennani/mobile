package com.example.pizzaapp.service;

import com.example.pizzaapp.dao.PizzaDao;
import com.example.pizzaapp.dao.PizzaDaoImpl;
import com.example.pizzaapp.models.Pizza;
import java.util.List;

public class PizzaService {
    private PizzaDao pizzaDao;

    public PizzaService() {
        pizzaDao = new PizzaDaoImpl();
    }

    public List<Pizza> getAllPizzas() {
        return pizzaDao.getAllPizzas();
    }

    public Pizza getPizzaById(int id) {
        return pizzaDao.getPizzaById(id);
    }
}