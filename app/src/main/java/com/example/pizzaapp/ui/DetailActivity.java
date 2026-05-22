package com.example.pizzaapp.ui;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzaapp.R;
import com.example.pizzaapp.models.Pizza;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Pizza pizza = (Pizza) getIntent().getSerializableExtra("pizza");

        if (pizza != null) {
            ImageView image = findViewById(R.id.detail_image);
            TextView name = findViewById(R.id.detail_name);
            TextView price = findViewById(R.id.detail_price);
            TextView time = findViewById(R.id.detail_time);
            TextView ingredients = findViewById(R.id.detail_ingredients);
            TextView description = findViewById(R.id.detail_description);

            image.setImageResource(pizza.getImageResId());
            name.setText(pizza.getName());
            price.setText(String.format("Prix : %.2f €", pizza.getPrice()));
            time.setText(String.format("Temps de préparation : %d min", pizza.getPreparationTime()));
            ingredients.setText("Ingrédients : " + pizza.getIngredients());
            description.setText("Description : " + pizza.getDescription());
        }
    }
}