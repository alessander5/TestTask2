package com.infy.controller;

import com.infy.service.IBasketItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.Response;
import java.util.HashSet;
import java.util.Set;

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

    @RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
    @ResponseBody
    public Set<String> ajaxTest() {
        System.out.println("Test");
        Set<String> records = new HashSet<String>();
        records.add("Record #1");
        records.add("Record #2");

        return records;
    }

}
