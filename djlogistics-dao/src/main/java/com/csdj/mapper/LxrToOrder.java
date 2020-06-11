package com.csdj.mapper;

import com.csdj.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface LxrToOrder {
    /**
     * 新增上传
     * @param orderupload
     * @return
     */
    int addOrders(Orderupload orderupload);

    /**
     * 上传查询
     * @return
     */
    Orderupload getOrders();

    /**
     * 批量新增订单
     * @param list
     * @return
     */
    int addOrdersList(List<Order> list);

    /**
     * 批量新增导出列表
     * @return
     */
    int addColown(List<Object> list);

    /**
     * 新增列名称表
     * @param uploadcolumn
     * @return
     */
    int addUploadColown(Uploadcolumn uploadcolumn);

    /**
     * 查询列表名称
     * @return
     */
    List<Uploadcolumn>getUploadColown();

    /**
     * 根据id查询列
     * @param id
     * @return
     */
    List<Column>getColownById(@Param("uploadid") Integer id);

    /**
     * 批量删除列
     * @return
     */
    int delColownByUploadid(@Param("uploadid") Integer uploadid);

    /**
     *根据id删除列名称
     * @param id
     * @return
     */
    int delUploadColownById(@Param("id") Integer id);

    /**
     * 登录
     * @param username
     * @param password
     * @return
     */
    SysUser login(@Param("username") String username,@Param("password") String password);
}
