package com.infy.controller;

import com.infy.domain.BasketItem;
import com.infy.domain.Vegetable;
import com.infy.service.IBasketItemService;
import com.infy.service.IVegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

/**
 * Created by Infy on 28.05.2016.
 */
@Controller
public class BasketController {

    @Autowired
    private IVegetableService vegetableService;

    @Autowired
    private IBasketItemService basketItemService;


    private Random randomInt = new Random();



    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String startPage(ModelMap model) {
        System.out.println("Start(basket shown)");
        model.addAttribute("basketItems", basketItemService.getCurrentBasketList());
        return "basket";
    }

    @RequestMapping(value = "addRandom", method = RequestMethod.POST)
    public String addRandomItem(ModelMap model) {
        System.out.println("Add random item");
        List<Vegetable> list = vegetableService.getList();
        int index = randomInt.nextInt(list.size());
        BasketItem item = new BasketItem(list.get(index));

        System.out.println("Index: " + index + " name:" + item.getName() + " count:" + item.getCount());
        basketItemService.getCurrentBasketList().add(item);
        model.addAttribute("basketItems", basketItemService.getCurrentBasketList());
        return "basket";
    }

    @RequestMapping(value = "remove")
    public String remove(@RequestParam("itemId") int id,
                         Model model) {

        basketItemService.removeItemById(id);
        model.addAttribute("basketItems", basketItemService.getCurrentBasketList());
        System.out.println("remove " + id);
        return "basket";
    }

}