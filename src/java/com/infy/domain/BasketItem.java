package com.infy.domain;

/**
 * Created by Infy on 28.05.2016.
 */
public class BasketItem extends Vegetable{

    public BasketItem(Vegetable vegetable){
        setId(vegetable.getId());
        setName(vegetable.getName());
        setCategory(vegetable.getCategory());
        setPrice(vegetable.getPrice());
        setCount(1);
    }

    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return " Name=" + super.getName() + ", cnt="+ getCount();
    }
}
