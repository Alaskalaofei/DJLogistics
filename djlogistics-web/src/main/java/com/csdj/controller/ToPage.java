package com.csdj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ToPage {
    @RequestMapping("/{page}")
    public String page(@PathVariable(value = "page") String page){
        return  page;
    }

}
