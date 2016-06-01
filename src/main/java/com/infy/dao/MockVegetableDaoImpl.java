package com.infy.dao;

import com.infy.domain.Vegetable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Infy on 01.06.2016.
 */
public class MockVegetableDaoImpl implements IVegetableDao{

    private List<Vegetable> currentVegetablesList = new ArrayList<Vegetable>();

    {
        saveOrUpdate(new Vegetable(1,"Редиска", "Овощи",120));
        saveOrUpdate(new Vegetable(2,"Арбуз","Фрукты",150));
        saveOrUpdate(new Vegetable(3,"Картошка", "Овощи",100));
        saveOrUpdate(new Vegetable(4,"Вишня", "Фрукты",20));
    }

    @Override
    public void saveOrUpdate(Vegetable vegetable) {
        for (Vegetable iterator : currentVegetablesList){
            if (iterator.getId() == vegetable.getId()){
                iterator.setName(vegetable.getName());
                iterator.setPrice(vegetable.getPrice());
                iterator.setCategory(vegetable.getCategory());
            }
        }
        currentVegetablesList.add(vegetable);
    }

    @Override
    public void remove(Vegetable vegetable) {
        Vegetable returnValue = null;
        for (Vegetable iterator: currentVegetablesList)
            if(iterator.equals(vegetable))
                currentVegetablesList.remove(iterator);
    }

    @Override
    public void removeById(int id) {
        Vegetable returnValue = null;
        for (Vegetable iterator: currentVegetablesList)
            if(iterator.getId()==id)
                currentVegetablesList.remove(iterator);
    }

    @Override
    public List<Vegetable> getList() {
        return currentVegetablesList;
    }
}
