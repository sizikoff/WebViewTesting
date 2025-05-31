package com.amicus.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by sizik on 31.05.2025.
 */
public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder>{

    LayoutInflater inflater;
    List<Food> foods;

    public FoodAdapter(Context context, List<Food> foods) {
        this.inflater = LayoutInflater.from(context);
        this.foods = foods;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Food food = foods.get(position);
        holder.imageView.setImageResource(food.imageResource);
        //TODO
        holder.weight.setText(String.valueOf(food.weight));
        holder.name.setText(food.name);
    }

    @Override
    public int getItemCount() {
        return foods.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView name;
        TextView weight;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_food);
            name = itemView.findViewById(R.id.name);
            weight = itemView.findViewById(R.id.weight);
        }
    }

}
