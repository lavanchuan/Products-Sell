package com.chuan.productssell.productssell.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/index")
    public String indexPage(){
        return "index";
    }
}
