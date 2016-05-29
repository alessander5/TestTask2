package com.infy.function;

import com.infy.domain.Vegetable;

import java.util.Collection;

/**
 * Created by Infy on 28.05.2016.
 */
public class Utils {
    public static int getCount(Collection<Vegetable> collection, Vegetable item){
        int count = 0;
        for(Vegetable iterator: collection)
            if(iterator.equals(item)) count++;
        return count;
    }
}
