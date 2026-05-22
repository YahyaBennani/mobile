package com.example.pizzaapp.dao;

import com.example.pizzaapp.R;
import com.example.pizzaapp.models.Pizza;
import java.util.ArrayList;
import java.util.List;

public class PizzaDaoImpl implements PizzaDao {
    private List<Pizza> pizzas;

    public PizzaDaoImpl() {
        pizzas = new ArrayList<>();
        // Données de test
        pizzas.add(new Pizza(1, "Margherita", 8.50, 10, R.drawable.pizza_margherita,
                "La classique tomate-mozzarella-basilic", "Tomate, Mozzarella, Basilic, Huile d'olive"));
        pizzas.add(new Pizza(2, "Pepperoni", 10.90, 12, R.drawable.pizza_pepperoni,
                "Sauce tomate, mozzarella, pepperoni épicé", "Tomate, Mozzarella, Pepperoni, Origan"));
        pizzas.add(new Pizza(3, "Quatre Fromages", 11.50, 12, R.drawable.pizza_4fromages,
                "Mozzarella, chèvre, roquefort, parmesan", "Mozzarella, Chèvre, Roquefort, Parmesan, Crème"));
        pizzas.add(new Pizza(4, "Végétarienne", 9.90, 15, R.drawable.pizza_vegetarienne,
                "Légumes grillés et olives", "Poivrons, Courgettes, Aubergines, Olives, Tomate"));
    }

    @Override
    public List<Pizza> getAllPizzas() {
        return pizzas;
    }

    @Override
    public Pizza getPizzaById(int id) {
        for (Pizza p : pizzas) {
            if (p.getId() == id) return p;
        }
        return null;
    }
}