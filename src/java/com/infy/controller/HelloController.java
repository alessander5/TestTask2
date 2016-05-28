package com.infy.controller;

import com.infy.service.IVegetableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Infy on 28.05.2016.
 */
@Controller
public class HelloController {

    @Autowired
    private IVegetableService vegetableService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String startPage(ModelMap model) {
        System.out.println("Start(basket shown)");
        model.addAttribute("vegetables", vegetableService.getList());
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