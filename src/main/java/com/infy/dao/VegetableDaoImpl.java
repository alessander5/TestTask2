package com.infy.dao;

import com.infy.domain.Vegetable;
import org.hibernate.Criteria;

import java.util.List;

/**
 * Created by Infy on 28.05.2016.
 */
public class VegetableDaoImpl extends ADao<Integer, Vegetable> implements IVegetableDao{

    @Override
    public void saveOrUpdate(Vegetable vegetable) {
        super.saveOrUpdate(vegetable);
    }

    @Override
    public void remove(Vegetable vegetable) {
        delete(vegetable);
    }

    @Override
    public void removeById(int id) {
        delete(getByKey(id));
    }

    @Override
    public List<Vegetable> getList() {
        Criteria criteria = createEntityCriteria();
        if(criteria.list().isEmpty()){
            System.out.println("Init empty db list");
            saveOrUpdate(new Vegetable("Редиска", "Овощи",120));
            saveOrUpdate(new Vegetable("Арбуз","Фрукты",150));
            saveOrUpdate(new Vegetable("Картошка", "Овощи",100));
            saveOrUpdate(new Vegetable("Вишня", "Фрукты",20));
        };
        return criteria.list();
    }
}
