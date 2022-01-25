package com.demoSpringAzure.demoSpringAzure.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

    @RequestMapping(value = "/") // When we get the root folder of the web, the index.html page will be returned
    public String index(Model model){
        return "index";
    }
}
