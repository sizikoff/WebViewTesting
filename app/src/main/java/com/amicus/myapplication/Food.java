package com.amicus.myapplication;

/**
 * Created by sizik on 31.05.2025.
 */
public class Food {
    String name;
    int weight;
    int imageResource;

    public Food(String name, int weight, int imageResource) {
        this.name = name;
        this.weight = weight;
        this.imageResource = imageResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
