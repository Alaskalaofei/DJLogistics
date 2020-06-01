package com.csdj.controller;

import com.csdj.pojo.blog;
import com.csdj.service.BlogService;
import com.csdj.util.XlsxImporTexportTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Controller
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
    /**
     *
     * @Title: impUser
     * @Description: excle导入
     * @param file
     * @return String
     */
    @PostMapping("/impUser")
    @ResponseBody
    public String impUser(MultipartFile file){
        List<blog> users = XlsxImporTexportTemplate.importData(file, 1, blog.class);
        for (int i = 0; i < users.size(); i++) {
            blog blog=users.get(i);
            System.out.println(blog.getContent());
        };
               return "success";
    }

    /**
     *
     * @Title: expUser
     * @Description: 导出excel
     * @param response
     * @return void
     */
    @GetMapping("/expUser")
    public void expUser(HttpServletResponse response){
        List<blog> users = blogService.blogList();
        if(users != null && users.size() > 0){
            XlsxImporTexportTemplate.exportExcel(users, null, "内容", blog.class, "用户20181118.xls", response);
        }
    }
}
