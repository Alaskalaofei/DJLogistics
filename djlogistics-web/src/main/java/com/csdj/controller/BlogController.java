package com.csdj.controller;

import com.csdj.pojo.blog;
import com.csdj.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/aa")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/list")
    public List<blog> list()
    {
        return blogService.blogList();
    }
}
