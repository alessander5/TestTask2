package com.infy.controller;

import com.infy.domain.Response;
import com.infy.service.IBasketItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Infy on 29.05.2016.
 */
@Controller
public class OrderController {


    @Autowired
    private IBasketItemService basketItemService;


    @RequestMapping(value = "createOrder", method = RequestMethod.POST)
    public ModelAndView createOrder(ModelMap model) {
        System.out.println("Create Order");
        ModelAndView returnView = new ModelAndView("order");
        returnView.addObject("basketItems", basketItemService.getCurrentBasketList());
        return returnView;
    }

    @RequestMapping(value = "/getCharNum", method = RequestMethod.GET)
    public @ResponseBody Response getCharNum(@RequestParam String text) {

        Response result = new Response();

        System.out.println("Ajax");
        if (text != null) {
            result.setText(text);
            result.setCount(text.length());
        }

        return result;
    }

    @RequestMapping(value = "test", method = RequestMethod.POST)
    public ModelAndView test(ModelMap model) {
        System.out.println("Test");
        ModelAndView returnView = new ModelAndView("home");
        return returnView;
    }


}
