package com.infy.service;

import com.infy.dao.IVegetableDao;
import com.infy.domain.Vegetable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Infy on 28.05.2016.
 */
public class VegetableServiceImpl implements IVegetableService {

    @Autowired
    private IVegetableDao vegetableDao;

    @Override
    @Transactional
    public void save(Vegetable vegetable) {
        vegetableDao.saveOrUpdate(vegetable);
    }

    @Override
    @Transactional
    public void remove(Vegetable vegetable) {
        vegetableDao.remove(vegetable);
    }

    @Override
    @Transactional
    public void removeById(int id) {
        vegetableDao.removeById(id);
    }

    @Override
    @Transactional
    public List<Vegetable> getList() {
        return vegetableDao.getList();
    }
}
