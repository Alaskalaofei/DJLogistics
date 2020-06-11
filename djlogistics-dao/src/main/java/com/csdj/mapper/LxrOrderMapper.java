package com.csdj.mapper;

import com.csdj.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LxrOrderMapper {
    /**
     * 订单查询
     * @return
     */
    List<Order>getOrderAll(Map<String,Object> map);


    /**
     * 网点查询
     * @return
     */
    List<Outlet>getOutletAll();

    /**
     * 客户查询
     * @return
     */
    List<Customer>getCustomer();

    /**
     * 路线查询
     * @return
     */
    List<Specificroute>getSpecificroute();

    /**
     * 发货
     * @return
     */
    int updateStateByOid(List<Object> list);

    /**
     * 收货
     * @param list
     * @return
     */
    int updateOstateByOid(List<Object> list);
    /**
     * 取消订单
     * @param list
     * @return
     */
    int updatequxiao(List<Object> list);

    /**
     * 报关方式查询
     * @return
     */
    List<Customsdeclarationmethod> getCustomsdeclarationmethod();
    /**
     * 货物类型查询
     * @return
     */
    List<Typeofgoods> getTypeofgoods();

    /**
     * 根据id 查询订单表
     * @return
     */
    Order getOrderById(@Param("oid") String oid);

    /**
     * 查询地址
     * @param oid
     * @return
     */
    Address getAddressByOrderId(@Param("oid") String oid);

    /**
     * 根据id修改订单表
     * @param order
     * @return
     */
    int updateOrderByOid(Order order);

    /**
     * 新增地址
     * @param address
     * @return
     */
    int addAddress(Address address);

    /**
     * 修改地址
     * @param address
     * @return
     */
    int updateAddressById(Address address);
}
