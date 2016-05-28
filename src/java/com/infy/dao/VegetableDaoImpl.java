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
        //criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);//To avoid duplicates.
        return criteria.list();
    }
}
