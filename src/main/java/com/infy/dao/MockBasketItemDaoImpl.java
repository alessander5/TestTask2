package com.infy.dao;

import com.infy.domain.BasketItem;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Infy on 29.05.2016.
 */
public class MockBasketItemDaoImpl implements IBasketItemDao{

    private List<BasketItem> currentBasketList;

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
    }

    @Override
    public Collection<BasketItem> getCurrentBasketList() {
        return currentBasketList;
    }

    @Override
    public void removeItemById(int id) {
        BasketItem findedById = getById(id);
        if (findedById!=null)
            currentBasketList.remove(findedById);
        else
            throw new IllegalArgumentException();
    }

    private BasketItem getById(int id){
        BasketItem returnValue = null;
        for (BasketItem iterator: currentBasketList)
            if(iterator.getId()==id) return iterator;
        return returnValue;
    }

}
