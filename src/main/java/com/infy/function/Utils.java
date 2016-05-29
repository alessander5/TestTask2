package com.infy.function;

import com.infy.domain.BasketItem;
import com.infy.domain.Vegetable;

import java.util.Collection;

/**
 * Created by Infy on 28.05.2016.
 */
public class Utils {
    public static int getTotalPrice(Collection<BasketItem> collection){
        int total = 0;
        for(BasketItem item: collection)
            total = total + item.getPrice()*item.getCount();
        return total;
    }
}
