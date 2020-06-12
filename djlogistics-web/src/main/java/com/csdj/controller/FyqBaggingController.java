package com.csdj.controller;

import com.csdj.pojo.Bagging;
import com.csdj.pojo.Order;
import com.csdj.service.FyqBaggingService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/bagging")
public class FyqBaggingController {
    @Autowired
    private FyqBaggingService service;


    @RequestMapping(value = "/getBaggingAll",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getBaggingAll(Integer page, Integer limit,Integer is,Integer dataSource,Integer saggingState
            ,String creatorDate,String number){
        Map<String,Object> map1=new HashMap();
        map1.put("is",is);
        map1.put("number",number);
        map1.put("dataSource",dataSource);
        map1.put("saggingState",saggingState);
        map1.put("creatorDate",creatorDate);
        PageInfo<Bagging> pageInfo=service.getBagging(page,limit,map1);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/getBagginByPlateNo",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getBagginByPlateNo(String plateNo){
        return  service.selectBaggingByPlateNo(plateNo);
    }

    @RequestMapping(value = "/updOrderById",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Integer updOrderById(String bno,String oid){
        return service.updOrder(bno,oid);
    }

    @RequestMapping(value = "/getBS",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getBS(){
        return service.getBS();
    }

    @RequestMapping(value = "/addBagging",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Integer addBagging(Bagging bagging){
        return service.addBagging(bagging);
    }


    @RequestMapping(value = "/updBagging",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Integer updBagging(Bagging bagging){
        return service.updBagging(bagging);
    }

    @RequestMapping(value = "/updBaggingState",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Integer updBaggingState(Integer saggingState, String plateNo){
        return service.updBaggingState(saggingState,plateNo);
    }

}
