package com.infy.controller;

import com.infy.domain.BasketItem;
import com.infy.domain.Vegetable;
import com.infy.service.IVegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Created by Infy on 28.05.2016.
 */
@Controller
public class BasketController {

    @Autowired
    private IVegetableService vegetableService;

    private List<BasketItem> currentBasketList;

    private Random randomInt = new Random();

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

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String startPage(ModelMap model) {
        System.out.println("Start(basket shown)");
        model.addAttribute("basketItems", currentBasketList);
        return "basket";
    }

    @RequestMapping(value = "addRandom", method = RequestMethod.POST)
    public String addRandomItem(ModelMap model) {
        System.out.println("Add random item");
        List<Vegetable> list = vegetableService.getList();
        int index = randomInt.nextInt(list.size());
        BasketItem item = new BasketItem(list.get(index));
        System.out.println("Index: " + index + " name:" + item.getName() + " count:" + item.getCount());
        currentBasketList.add(item);
        model.addAttribute("basketItems", currentBasketList);
        return "basket";
    }

    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String print(ModelMap model) {
        System.out.println("start1");
        model.addAttribute("message", "Hello world!");
        return "index";
    }

    @RequestMapping(value = "hello", method = RequestMethod.POST)
    public String enterHelloJSP(ModelMap model) {
        System.out.println("hello");
        model.addAttribute("message", "Hello world!");
        return "hello";
    }

}