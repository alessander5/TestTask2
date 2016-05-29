package com.infy.service;

import com.infy.domain.BasketItem;

import java.util.Collection;

/**
 * Created by Infy on 29.05.2016.
 */
public interface IBasketItemService {

    Collection<BasketItem> getCurrentBasketList();

}
