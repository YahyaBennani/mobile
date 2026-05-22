package com.example.pizzaapp.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzaapp.R;
import com.example.pizzaapp.adapter.PizzaAdapter;
import com.example.pizzaapp.models.Pizza;
import com.example.pizzaapp.service.PizzaService;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView listViewPizzas;
    private PizzaService pizzaService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pizzaService = new PizzaService();
        listViewPizzas = findViewById(R.id.list_view_pizzas);

        List<Pizza> pizzas = pizzaService.getAllPizzas();
        PizzaAdapter adapter = new PizzaAdapter(this, pizzas);
        listViewPizzas.setAdapter(adapter);

        listViewPizzas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pizza selectedPizza = pizzas.get(position);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                intent.putExtra("pizza", selectedPizza);
                startActivity(intent);
            }
        });
    }
}