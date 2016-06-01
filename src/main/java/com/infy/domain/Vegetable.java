package com.infy.domain;

/**
 * Created by Infy on 28.05.2016.
 */

public class Vegetable {
    private int id;
    private String name;
    private String category;
    private int price;

    public Vegetable(){

    }

    public Vegetable(String name, String category, int price){
        setName(name);
        setCategory(category);
        setPrice(price);
    }

    public Vegetable(int id, String name, String category, int price){
        setId(id);
        setName(name);
        setCategory(category);
        setPrice(price);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Vegetable){
            Vegetable vegetable = (Vegetable)obj;
            if (getName().equals(vegetable.getName()) &&
                getCategory().equals(vegetable.getCategory()) &&
                getPrice() == vegetable.getPrice())
                    return true;
        }
        return false;
    }
}
