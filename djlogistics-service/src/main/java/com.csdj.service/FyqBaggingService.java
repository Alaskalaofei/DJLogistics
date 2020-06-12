package com.csdj.service;

import com.csdj.pojo.Bagging;
import com.csdj.pojo.BaggingStrategy;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FyqBaggingService {
    /**
     * 查询装袋信息
     * @return
     */
    public PageInfo<Bagging> getBagging(Integer pageNum, Integer pageSize, Map<String,Object> map);


    /**
     * 查询全部装袋信息
     * @return
     */
    public PageInfo<Bagging> getBaggingAll(Integer pageNum, Integer pageSize);

    /**
     * 根据袋号查询
     * @param plateNo
     * @return
     */
    public Bagging selectBaggingByPlateNo(String plateNo);

    /**
     * 修改订单袋号
     * @param bno
     * @param oid
     * @return
     */
    public Integer updOrder(String bno,String oid);

    /**
     * 查询装袋策略
     * @return
     */
    public List<BaggingStrategy> getBS();

    /**
     * 新增装袋
     * @param bagging
     * @return
     */
    public Integer addBagging(Bagging bagging);

    /**
     * 修改装袋信息
     * @param bagging
     * @return
     */
    public Integer updBagging(Bagging bagging);

    /**
     * 修改装袋状态
     * @param saggingState
     * @param plateNo
     * @return
     */
    public Integer updBaggingState(Integer saggingState,String plateNo);




}
