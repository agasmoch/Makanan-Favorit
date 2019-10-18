package com.agasmochfauzan.makananfavorit;

public class Food {
    private String name;
    private float rate;
    private  double price;
    private boolean fav;

    public Food(String name, float rate, double price, boolean fav) {
        this.name = name;
        this.rate = rate;
        this.price = price;
        this.fav = fav;
    }

    public Food(String name, float rate, double price) {
        this.name = name;
        this.rate = rate;
        this.price = price;

    }

    public boolean isFav() {
        return fav;
    }

    public String getName() {
        return name;
    }

    public float getRate() {
        return rate;
    }

    public double getPrice() {
        return price;
    }


}
