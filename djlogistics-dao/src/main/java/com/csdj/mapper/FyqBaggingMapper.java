package com.csdj.mapper;

import com.csdj.pojo.Bagging;
import com.csdj.pojo.BaggingStrategy;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface FyqBaggingMapper {
    /**
     * 查询装袋信息
     * @return
     */
    public List<Bagging> getBagging(Map<String,Object> map);

    /**
     * 查询全部装袋信息
     * @return
     */
    public List<Bagging> getBaggingAll();

    /**
     * 根据袋号查询
     * @param plateNo
     * @return
     */
    public Bagging selectBaggingByPlateNo(@Param("plateNo") String plateNo);

    /**
     * 修改订单袋号
     * @param bno
     * @param oid
     * @return
     */
    public Integer updOrder(@Param("bno") String bno,@Param("oid") String oid);

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
    public Integer updBaggingState(@Param("saggingState") Integer saggingState,@Param("plateNo") String plateNo);
}
