package com.csdj.controller;

import com.csdj.pojo.*;
import com.csdj.service.LxrOrderService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/lxrorder")
public class LxrOrderController {

    @Autowired
    private LxrOrderService service;

    @RequestMapping("/getOrderAll")
    @ResponseBody
    public Object getOrderAll (Integer page,Integer limit,String dates,Integer luxian1,Integer luxian2,Integer outlet,Integer customer,String select1,String ttArea ){

        if(page==null){
            page=1;
        }
        if(limit==null){
            limit=50;
        }
        Map<String,Object> maps =new HashMap<>();
        maps.put("dates",dates);
        maps.put("luxian1",luxian1);
        maps.put("luxian2",luxian2);
        maps.put("outlet",outlet);
        maps.put("customer",customer);
        maps.put("select1",select1);
        maps.put("ttArea",ttArea);
        PageInfo<Order>pageInfo=service.pageinfo(page,limit,maps);
        Map<String,Object> map =new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",pageInfo.getTotal());
        map.put("data",pageInfo.getList());
        return map;
    }

    /**
     * 网点查询
     * @return
     */
    @RequestMapping("/getOutletAll")
    @ResponseBody
    public Object getOutletAll (){
        List<Outlet> outlets=service.getOutletAll();
        return outlets;
    }

    /**
     * 客户查询
     * @return
     */
    @RequestMapping("/getCustomer")
    @ResponseBody
    public Object getCustomer (){
        List<Customer> outlets=service.getCustomer();
        return outlets;
    }

    /**
     * 路线查询
     * @return
     */
    @RequestMapping("/getSpecificroute")
    @ResponseBody
    public Object getSpecificroute (){
        List<Specificroute> outlets=service.getSpecificroute();
        return outlets;
    }

    /**
     * 发货
     * @return
     */
    @RequestMapping("/updateStateByOid")
    @ResponseBody
    public boolean updateStateByOid ( @RequestBody List<Object> oid){

        Integer result=service.updateStateByOid(oid);
        return result > 0 ? true : false;
    }

    /**
     * 收货
     * @return
     */
    @RequestMapping("/updateOstateByOid")
    @ResponseBody
    public boolean updateOstateByOid ( @RequestBody List<Object> oid){
        Integer result=service.updateOstateByOid(oid);
        return result > 0 ? true : false;
    }

    /**
     * 取消订单
     * @return
     */

    @RequestMapping("/updatequxiao")
    @ResponseBody
    public boolean updatequxiao ( @RequestBody List<Object> oid){
        Integer result=service.updatequxiao(oid);
        return result > 0 ? true : false;
    }

    /**
     * 报关方式查询
     * @return
     */
    @RequestMapping("/getCustomsdeclarationmethod")
    @ResponseBody
    public Object getCustomsdeclarationmethod (){
        List<Customsdeclarationmethod> outlets=service.getCustomsdeclarationmethod();
        return outlets;
    }
    /**
     * 货物类型查询
     * @return
     */
    @RequestMapping("/getTypeofgoods")
    @ResponseBody
    public Object getTypeofgoods (){
        List<Typeofgoods> outlets=service.getTypeofgoods();
        return outlets;
    }

    /**
     * 根据id查询订单表
     * @return
     */
    @RequestMapping("/getOrderById")
    @ResponseBody
    public Object getOrderById (String oid){
        Order result=service.getOrderById(oid);
        return result;
    }
    /**
     * 查询地址
     * @return
     */
    @RequestMapping("/getAddressByOrderId")
    @ResponseBody
    public Object getAddressByOrderId (String oid){
        Address result=service.getAddressByOrderId(oid);
        return result;
    }

    /**
     * 查询地址
     * @return
     */
    @RequestMapping("/updateOrderAdd")
    @ResponseBody
    public String updateOrderAdd (Order order){
        int result=service.updateOrderByOid(order);
        if(result>0){
            return order.getOid();
        }else{
            return "no";
        }
    }
    /**
     * 修改新增地址
     * @return
     */
    @RequestMapping("/updateAddressAdd")
    @ResponseBody
    public boolean updateAddressAdd (Address address){
         Address result=service.getAddressByOrderId(address.getOrderid());
       if(result!=null){
            int res=service.updateAddressById(address);
            if(res>0){
                return true;
            }
        }else{
            int res=service.addAddress(address);
            if(res>0){
                return true;
            }
        }
        return false;
    }

}
