package com.csdj.controller;

import com.csdj.pojo.AssociatedShift;
import com.csdj.pojo.Order;
import com.csdj.pojo.UpperPlate;
import com.csdj.service.FyqUpperPlateService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.annotation.Retention;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/up")
public class FyqUpperPlateController {
    @Autowired
    private FyqUpperPlateService service;

    @RequestMapping(value = "/getUP",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getUpperPlates(Integer page, Integer limit, Integer is,String number,
                                 String buildBoardDate,Integer upperPlateOutlets,Integer deliveryOutlets,
                                 Integer upperState,Integer boardStrategy,Integer dataSource,
                                 Integer customsDeclarationMethod){
        Map<String,Object> map=new HashMap<>();
        if(is!=null){
            if(is==0){
                map.put("plateNo",number);
            }else{
                map.put("orderNumber",number);
            }
        }
        map.put("buildBoardDate",buildBoardDate);
        map.put("upperPlateOutlets",upperPlateOutlets);
        map.put("deliveryOutlets",deliveryOutlets);
        map.put("upperState",upperState);
        map.put("boardStrategy",boardStrategy);
        map.put("dataSource",dataSource);
        map.put("customsDeclarationMethod",customsDeclarationMethod);
        PageInfo<UpperPlate> pageInfo=service.getUpperPlate(page,limit,map);
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("code", 0);
        map1.put("msg", "");
        map1.put("count",pageInfo.getTotal());
        map1.put("data", pageInfo.getList());
        return map1;
    }

    @RequestMapping(value = "/getBS",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getBS(){
        return service.selectBS();
    }

    @RequestMapping(value = "/getOutlet",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getOutlet(){
        return service.selectOutlet();
    }

    @RequestMapping(value = "/getcdm",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getcdm(){
        return service.selectcdm();
    }

    @RequestMapping(value = "/getGoodsType",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getGoodsType(){
        return service.selectGoodsType();
    }

    @RequestMapping(value = "/getSpecificroute",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getSpecificroute(){
        return service.selectSpecificroute();
    }

    @RequestMapping(value = "/addUP",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Integer addUP(UpperPlate upperPlate){
        return service.addUP(upperPlate);
    }

    @RequestMapping(value = "/getUP2",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getUP2(String plateNo){
        return service.getUP(plateNo);
    }

    @RequestMapping(value = "/updUP",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Integer updUP(UpperPlate upperPlate){
        return service.updUP(upperPlate);
    }

    @RequestMapping(value = "/getOrder",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getOrder(Integer page, Integer limit){
        PageInfo<Order> pageInfo=service.getOrder(page,limit);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/getUpAll",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getUpAll(Integer page, Integer limit){
        PageInfo<UpperPlate> pageInfo=service.selectUPAll(page,limit);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/getUPByPlateNo",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getUPByPlateNo(String plateNo){
        return service.getUPByPlateNo(plateNo);
    }

    @RequestMapping(value = "/updUPByPlateNo",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Integer updUPByPlateNo(UpperPlate upperPlate){
        return service.updUPByplateNo(upperPlate);
    }

    @RequestMapping(value = "/updOrderById",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Integer updOrderById(String pno,String oid){
        return service.updOrderById(pno,oid);
    }

    @RequestMapping(value = "/getUpAid",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getUpAid(){
        return service.getUpAid();
    }
    
    @RequestMapping(value = "/getAS",produces  ={"application/json;charset=utf-8"})
    @ResponseBody
    public Object getAS(Integer page,Integer limit){
        PageInfo<AssociatedShift> pageInfo=service.getAS(page,limit);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }

    @RequestMapping(value = "/UpdAS",produces  ={"application/json;charset=utf-8"})
    @ResponseBody
    public Integer UpdAS(String plateNo, Integer aid) {
        return service.UpdAS(plateNo,aid);
    }

    @RequestMapping(value = "/getAid",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Integer getAid(String plateNo){
        return service.getAid(plateNo);
    }
}
