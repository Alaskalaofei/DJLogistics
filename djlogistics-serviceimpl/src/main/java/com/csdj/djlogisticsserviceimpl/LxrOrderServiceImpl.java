package com.csdj.djlogisticsserviceimpl;

import com.csdj.mapper.LxrOrderMapper;
import com.csdj.pojo.Order;
import com.csdj.service.LxrOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LxrOrderServiceImpl implements LxrOrderService {
    @Autowired
    private LxrOrderMapper mapper;

    @Override
    public List<Order> getOrderAll() {
        return mapper.getOrderAll();
    }
}
