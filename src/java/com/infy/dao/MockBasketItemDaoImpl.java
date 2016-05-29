package com.infy.dao;

import com.infy.domain.BasketItem;
import com.infy.domain.Vegetable;
import com.infy.service.IBasketItemService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Infy on 29.05.2016.
 */
public class MockBasketItemDaoImpl implements IBasketItemDao{

    private List<BasketItem> currentBasketList;

    private List<Vegetable> localItems = new ArrayList<Vegetable>();

    {
        currentBasketList = new ArrayList<BasketItem>(){
            @Override
            public boolean add(BasketItem basketItem) {
                int cnt = Collections.frequency(currentBasketList, basketItem);
                if(cnt==0)
                    return super.add(basketItem);
                else{
                    BasketItem duplicateItem = currentBasketList.get(currentBasketList.indexOf(basketItem));
                    duplicateItem.setCount(duplicateItem.getCount()+1);
                    return true;
                }
            }
        };
        currentBasketList.add(new BasketItem(new Vegetable("Редиска", "Овощи",120)));
        currentBasketList.add(new BasketItem(new Vegetable("Арбуз","Фрукты",150)));
        currentBasketList.add(new BasketItem(new Vegetable("Арбуз","Фрукты",150)));

    }

    @Override
    public Collection<BasketItem> getCurrentBasketList() {
        return currentBasketList;
    }

}
