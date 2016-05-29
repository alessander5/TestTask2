package com.infy.service;

import com.infy.dao.IBasketItemDao;
import com.infy.dao.IVegetableDao;
import com.infy.domain.BasketItem;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;

/**
 * Created by Infy on 29.05.2016.
 */
public class BasketItemService implements IBasketItemService {

    @Autowired
    private IBasketItemDao basketItemDao;


    @Override
    public Collection<BasketItem> getCurrentBasketList() {
        return basketItemDao.getCurrentBasketList();
    }

}
