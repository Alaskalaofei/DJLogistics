package com.csdj.mapper;

import com.csdj.pojo.*;
import org.apache.ibatis.annotations.Param;

import javax.swing.*;
import java.util.List;
import java.util.Map;

public interface FyqUpperPlateMapper {
    /**
     * 查询上板信息
     * @return
     */
    public List<UpperPlate> selectUpperPlate(Map<String,Object> map);

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
     * 查询目的地信息
     * @param destination
     * @return
     */
    public Destination selectDestination(Destination destination);

    /**
     * 新增目的地信息
     * @param destination
     * @return
     */
    public Integer addDestination(Destination destination);

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
    public UpperPlate getUP(@Param("plateNo") String plateNo);

    /**
     * 根据ID查询目的地信息
     * @param did
     * @return
     */
    public Destination selectDestinationByID(@Param("did") Integer did);

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
    public List<Order> getOrder();

    /**
     *
     * 查询全部上板信息
     * @return
     */
    public List<UpperPlate> selectUPAll();

    /**
     * 根据板号查询上板信息
     * @param plateNo
     * @return
     */
    public UpperPlate getUPByPlateNo(@Param("plateNo") String plateNo);

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
    public Integer updOrderById(@Param("pno") String pno,@Param("oid") String oid);

    /**
     * 查询各个上板的班次
     * @return
     */
    public List<UpperPlate> getUpAid();

    /**
     * 查询全部班次信息
     * @return
     */
    public List<AssociatedShift> getAS();

    public Integer UpdAS(@Param("plateNo") String plateNo,@Param("aid") Integer aid);

    /**
     * 根据板号查询班次
     * @param plateNo
     * @return
     */
    public Integer getAid(@Param("plateNo") String plateNo);

    /**
     * 根据班次信息查询票数等信息
     * @param aid
     * @return
     */
    public AssociatedShift getNNW(@Param("aid") Integer aid);

    /**
     * 根据班次信息修改票数等信息
     * @param associatedShift
     * @return
     */
    public Integer updNNW(AssociatedShift associatedShift);
}
