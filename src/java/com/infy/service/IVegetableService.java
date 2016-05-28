package com.infy.service;

import com.infy.domain.Vegetable;

import java.util.List;

/**
 * Created by Infy on 28.05.2016.
 */
public interface IVegetableService {

    void save(Vegetable vegetable);
    void remove(Vegetable vegetable);
    void removeById(int id);
    List<Vegetable> getList();

}
