package com.infy.domain;

import javax.persistence.*;

/**
 * Created by Infy on 28.05.2016.
 */

@Entity
@Table(name="vegetable", schema = "public")
public class Vegetable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(nullable = false)
    private int price;

    public Vegetable(){

    }

    public Vegetable(String name, String category, int price){
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
