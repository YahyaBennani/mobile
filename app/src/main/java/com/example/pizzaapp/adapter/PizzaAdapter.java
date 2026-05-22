package com.example.pizzaapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.pizzaapp.R;
import com.example.pizzaapp.models.Pizza;
import java.util.List;

public class PizzaAdapter extends ArrayAdapter<Pizza> {
    private Context context;
    private List<Pizza> pizzas;

    public PizzaAdapter(Context context, List<Pizza> pizzas) {
        super(context, R.layout.list_item_pizza, pizzas);
        this.context = context;
        this.pizzas = pizzas;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_item_pizza, parent, false);
            holder = new ViewHolder();
            holder.image = convertView.findViewById(R.id.pizza_image);
            holder.name = convertView.findViewById(R.id.pizza_name);
            holder.price = convertView.findViewById(R.id.pizza_price);
            holder.time = convertView.findViewById(R.id.pizza_time);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        Pizza pizza = pizzas.get(position);
        holder.image.setImageResource(pizza.getImageResId());
        holder.name.setText(pizza.getName());
        holder.price.setText(String.format("%.2f €", pizza.getPrice()));
        holder.time.setText(pizza.getPreparationTime() + " min");

        return convertView;
    }

    static class ViewHolder {
        ImageView image;
        TextView name;
        TextView price;
        TextView time;
    }
}