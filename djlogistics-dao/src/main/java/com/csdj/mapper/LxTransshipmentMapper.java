package com.csdj.mapper;

import com.csdj.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 转运mapper
 */
public interface LxTransshipmentMapper {
    /**
     * 查询下拉框网点
     * @return
     */
    List<Outlet> selectOutlet();

    /**
     * 查询下拉框转运单状态
     * @return
     */
    List<TransitStatus> selectTransitStatuses();

    /**
     * 新增转运单
     * @param transshipment 实体类
     * @return
     */
    Integer AddTransferNote(Transshipment transshipment);

    /**
     * 查询按转运单号查询转运单，可用于查询是否重复，与修改赋值
     * @param transhipmentNo
     * @return
     */
    Transshipment InquiryTransfer(String transhipmentNo);

    /**
     * 修改转运单，可多个修改，一体化
     * @param transshipment 实体类
     * @return
     */
    Integer ModifyTransferOrder(Transshipment transshipment);



    /**
     * 按运单查询出它的转运单号
     * @param waybillNumber
     * @return
     */
    TransshipmentDetails TransferDetailsQueryTransfer(String waybillNumber);




    /**
     * 转运单查询
     *map
     * @return
     */
    List<Transshipment> ConditionalTransferOrder(Map<String,Object> map);

/**
 *
 */

    /**
     * 按转运单号查询所有转运明细与其他
     * @param transhipmentNo
     * @return
     */
    List<TransshipmentDetails> TransferDetailsInquiry(String transhipmentNo);

    /**
     * 查询运单号
     * @param waybillNumber
     * @return
     */
    Order WaybillNumberInquiryWaybill(String waybillNumber);


    /**
     * 新增转运明细表，经过逻辑代码后新增
     * @param transshipmentDetails
     * @return
     */
    Integer AddScanNumber(TransshipmentDetails transshipmentDetails);

/**
 *
 */


    /**
     * 按转运单号查询所有转运明细与其他
     * @param transhipmentNo
     * @return
     */
    List<TransshipmentDetails> TransferDetailsInquiryandtranNO(String transhipmentNo);


    /**
     * 删除此转运明细表
     * @param tdid
     * @return
     */
    Integer delTransferDetails(Integer tdid);
/*一下为暂时无用的代码，可能会用*/

    /*  *//**
     * 查询转运单号是否存在用于新增
     * @param Oid
     * @return
     *//*
    Integer QueryTransferOrderByOid(String Oid);*/

}
