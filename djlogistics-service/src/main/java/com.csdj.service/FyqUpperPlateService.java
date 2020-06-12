package com.csdj.service;

import com.csdj.pojo.*;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FyqUpperPlateService {
    /**
     * 查询上板信息
     * @return
     */
    public PageInfo<UpperPlate> getUpperPlate(Integer pageNum, Integer pageSize, Map<String,Object> map);
    /**
     * 查询上板策略
     * @return
     */
    public List<BoardStrategy> selectBS();

    /**
     * 查询网点信息
     * @return
     */
    public List<Outlet> selectOutlet();

    /**
     * 查询报关方式
     * @return
     */
    public List<Customsdeclarationmethod> selectcdm();

    /**
     * 查询货物类型
     * @return
     */
    public List<GoodsType> selectGoodsType();

    /**
     * 查询货物类型
     * @return
     */
    public List<Specificroute> selectSpecificroute();

    /**
     * 新增上板信息
     * @param upperPlate
     * @return
     */
    public Integer addUP(UpperPlate upperPlate);

    /**
     * 根据板号查询上板信息
     * @param plateNo
     * @return
     */
    public UpperPlate getUP(String plateNo);

    /**
     * 根据板号修改上板信息
     * @param upperPlate
     * @return
     */
    public Integer updUP(UpperPlate upperPlate);

    /**
     * 查询订单信息
     * @return
     */
    public PageInfo<Order> getOrder(Integer pageNum, Integer pageSize);

    /**
     *
     * 查询全部上板信息
     * @return
     */
    public PageInfo<UpperPlate> selectUPAll(Integer pageNum, Integer pageSize);

    /**
     * 根据板号查询上板信息
     * @param plateNo
     * @return
     */
    public UpperPlate getUPByPlateNo(String plateNo);

    /**
     * 根据板号修改上板状态
     * @param upperPlate
     * @return
     */
    public Integer updUPByplateNo(UpperPlate upperPlate);

    /**
     * 修改订单板号
     * @param pno
     * @param oid
     * @return
     */
    public Integer updOrderById(String pno,String oid);

    public List<UpperPlate> getUpAid();

    /**
     * 查询全部班次信息
     * @return
     */
    public PageInfo<AssociatedShift> getAS(Integer page,Integer limit);

    public Integer UpdAS(String plateNo, Integer aid);

    /**
     * 根据板号查询班次
     * @param plateNo
     * @return
     */
    public Integer getAid(String plateNo);
}
