package com.csdj.controller;

import com.csdj.pojo.*;
import com.csdj.service.LxrToOrderService;
import com.csdj.util.XlsxImporTexportTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.*;

@Controller
@RequestMapping("/toOrder")
public class LxrToOrderController {

    @Autowired
    private LxrToOrderService service;

    /**
     * 导入
     * @param file
     * @param customer
     * @param session
     * @return
     */
    @RequestMapping("/getexl")
    @ResponseBody
    public Object getexl(MultipartFile file, Integer customer, HttpSession session){
        Map<String,Object> map=new HashMap<>();
        if(file!=null){
            List<Order> users=XlsxImporTexportTemplate.importData(file, 1, Order.class);
            for (int i = 0; i < users.size(); i++) {
                Order order=users.get(i);
            };
            if(users.size()==0){
                map.put("bool",false);
                return map;
            }
            Orderupload orderupload=new Orderupload();
            orderupload.setCustomerid(customer);
            orderupload.setDate(new Date());
            orderupload.setError(0);
            orderupload.setRow(users.size());
            orderupload.setState(0);
            orderupload.setName(file.getOriginalFilename());
            int result1= service.addOrders(orderupload);
            if(result1<=0){
                map.put("bool",false);
                return map;
            }
            int result2 =service.addOrdersList(users);
            if(result2<=0){
                map.put("bool",false);
                return map;
            }
            map.put("bool",true);
            map.put("res",service.getOrders());
            session.setAttribute("users",users);
        }

        return map;
    }


    /**
     * 查询导入的列
     * @param session
     * @return
     */
    @RequestMapping("/getdata")
    @ResponseBody
    public Object getdata(HttpSession session){
        Map<String,Object> map2 =new HashMap<>();
        int size=0;
        List<Order> list=null;
        if(session.getAttribute("users")!=null){
            list=(List<Order>) session.getAttribute("users");
            size=list.size();
        }
        map2.put("code",0);
        map2.put("msg","");
        map2.put("count",size);
        map2.put("data",list);
        session.invalidate();
        return map2;
    }

    /**
     * 新增导出名称
     * @param uname
     * @return
     */
    @RequestMapping("/getupload")
    @ResponseBody
    public Integer getupload( String uname){
        Uploadcolumn uploadcolumn=new Uploadcolumn();
        uploadcolumn.setName(uname);
        int  uploadcolumn1= service.addUploadColown(uploadcolumn);
        if(uploadcolumn1>0){
            return uploadcolumn.getId();
        }
        return 0;
    }

    /**
     * 新增导出列
     * @param list
     * @return
     */
    @RequestMapping("/addcolumn")
    @ResponseBody
    public Object addcolumn(@RequestBody List<Object> list){
        int result=service.addColown(list);
        return result > 0 ? true : false;
    }

    /**
     * 查询导出列名称
     * @return
     */
    @RequestMapping("/getUploadColown")
    @ResponseBody
    public Object getUploadColown(){
        List<Uploadcolumn>list1=service.getUploadColown();
        return list1;
    }

    /**
     * 根据id查询列
     * @return
     */
    @RequestMapping("/getColownById")
    @ResponseBody
    public Object getColownById(Integer id){
        List<Column>list1=service.getColownById(id);
        return list1;
    }

    /**
     * 根据id删除列名称
     * 批量删除列
     * @return
     */
    @RequestMapping("/delColown")
    @ResponseBody
    public boolean delColown(Integer id){
        int result=service.delColownByUploadid(id);
        return result > 0 ? true : false;
    }
    /**
     * denglu
     * @return
     */
    @RequestMapping("/login")
    @ResponseBody
    public boolean denglu(String username,String password){
        SysUser sysUser=service.login(username,password);
        return sysUser!=null ? true : false;
    }

}
