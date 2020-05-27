package com.csdj.controller;

import com.csdj.pojo.blog;
import com.csdj.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aa")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/list")
    @ResponseBody
    public List<blog> list()
    {
        return blogService.blogList();
    }

    @RequestMapping("/blog")
    public String blog(Model model)
    {
        List<blog> blogList=blogService.blogList();
        model.addAttribute("blog",blogList);
        return "list";
    }
}
