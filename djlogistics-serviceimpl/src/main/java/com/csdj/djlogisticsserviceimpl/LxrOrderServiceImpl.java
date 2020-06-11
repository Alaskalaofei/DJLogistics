package com.csdj.djlogisticsserviceimpl;

import com.csdj.mapper.LxrOrderMapper;
import com.csdj.pojo.*;
import com.csdj.service.LxrOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LxrOrderServiceImpl implements LxrOrderService {
    @Autowired
    private LxrOrderMapper mapper;

    @Override
    public PageInfo<Order> pageinfo(Integer pageNum, Integer pageSize, Map<String,Object> map) {
        String date1=null;
        String date2=null;
        if(map.get("dates")!=null && map.get("dates")!=""){
            String dates= (String) map.get("dates");
             date1=dates.substring(0,dates.indexOf("到"));
             date2=dates.substring(dates.indexOf("到")+1);
        }
        map.put("date1",date1);
        map.put("date2",date2);
        PageHelper.startPage(pageNum,pageSize);
        PageInfo<Order> pageInfo=new PageInfo<Order>(mapper.getOrderAll(map));
        return pageInfo;
    }

    @Override
    public List<Outlet> getOutletAll() {
        return mapper.getOutletAll();
    }

    @Override
    public List<Customer> getCustomer() {
        return mapper.getCustomer();
    }

    @Override
    public List<Specificroute> getSpecificroute() {
        return mapper.getSpecificroute();
    }

    @Override
    public int updateStateByOid(List<Object> list) {
        return mapper.updateStateByOid(list);
    }

    @Override
    public int updateOstateByOid(List<Object> list) {
        return mapper.updateOstateByOid(list);
    }

    @Override
    public int updatequxiao(List<Object> list) {
        return mapper.updatequxiao(list);
    }

    @Override
    public List<Customsdeclarationmethod> getCustomsdeclarationmethod() {
        return mapper.getCustomsdeclarationmethod();
    }

    @Override
    public List<Typeofgoods> getTypeofgoods() {
        return mapper.getTypeofgoods();
    }

    @Override
    public Order getOrderById(String oid) {
        return mapper.getOrderById(oid);
    }

    @Override
    public Address getAddressByOrderId(String oid) {
        return mapper.getAddressByOrderId(oid);
    }

    @Override
    public int updateOrderByOid(Order order) {
        return mapper.updateOrderByOid(order);
    }

    @Override
    public int addAddress(Address address) {
        return mapper.addAddress(address);
    }

    @Override
    public int updateAddressById(Address address) {
        return mapper.updateAddressById(address);
    }
}
