package com.csdj.djlogisticsserviceimpl;

import com.csdj.mapper.LxrOrderMapper;
import com.csdj.mapper.LxrToOrder;
import com.csdj.pojo.*;
import com.csdj.service.LxrToOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Service
@Transactional
public class LxrToOrderServiceImpl implements LxrToOrderService
{
    @Autowired
    private LxrToOrder mapper;

    @Override
    public int addOrders(Orderupload orderupload) {
        return mapper.addOrders(orderupload);
    }

    @Override
    public Orderupload getOrders() {
        return mapper.getOrders();
    }

    @Override
    public int addOrdersList(List<Order> list) {
        return mapper.addOrdersList(list);
    }

    @Override
    public int addColown(List<Object> list) {
        return mapper.addColown(list);
    }

    @Override
    public int addUploadColown(Uploadcolumn uploadcolumn) {
        return mapper.addUploadColown(uploadcolumn);
    }

    @Override
    public List<Uploadcolumn> getUploadColown() {
        return mapper.getUploadColown();
    }

    @Override
    public List<Column> getColownById(Integer id) {
        return mapper.getColownById(id);
    }

    @Override
    public int delColownByUploadid(Integer uploadid) {
        int result=mapper.delColownByUploadid(uploadid);
        if(result>0){
            mapper.delUploadColownById(uploadid);
        }
        return result;
    }

    @Override
    public SysUser login(String username, String password) {
        return mapper.login(username,password);
    }

}
