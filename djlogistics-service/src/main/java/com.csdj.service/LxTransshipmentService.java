package com.csdj.service;

import com.csdj.pojo.*;
import com.github.pagehelper.PageInfo;

import java.util.List;
import java.util.Map;

public interface LxTransshipmentService {

    /**
     * 查询下拉框网点
     * @return
     */
    List<Outlet> findselectOutlet();

    /**
     * 查询下拉框转运单状态
     * @return
     */
    List<TransitStatus> findselectTransitStatuses();

    /**
     * 新增转运单
     * @param transshipment 实体类
     * @return
     */
    Integer findAddTransferNote(Transshipment transshipment);





    /**
     * 查询按转运单号查询转运单
     * @param transhipmentNo
     * @return
     */
    Transshipment findInquiryTransfer(String transhipmentNo);


    /**
     * 修改转运单，可多个修改，一体化
     * @param transshipment 实体类
     * @return
     */
    Integer findModifyTransferOrder(Transshipment transshipment);


    /**
     * 按运单查询出它的转运单号
     * @param waybillNumber
     * @return
     */
    TransshipmentDetails findTransferDetailsQueryTransfer(String waybillNumber);





    /**
     * 转运单查询
     * @param map
     * @param PageNum
     * @param PageSize
     * @return
     */
    PageInfo<Transshipment> ConditionalTransferOrderpage(Map<String, Object> map, Integer PageNum, Integer PageSize);











    /**
     * 按转运单号查询所有转运明细与其他
     * @param transhipmentNo
     * @return
     */
    PageInfo<TransshipmentDetails> findTransferDetailsInquiry(String transhipmentNo, Integer PageNum, Integer PageSize);

    /**
     * 查询运单号
     * @param waybillNumber
     * @return
     */
    Order findWaybillNumberInquiryWaybill(String waybillNumber);


    /**
     * 新增转运明细表，经过逻辑代码后新增
     * @param transshipmentDetails
     * @return
     */
    Integer findAddScanNumber(TransshipmentDetails transshipmentDetails);


    /**
     * 删除此转运明细表
     * @param tdid
     * @return
     */
    Integer finddelTransferDetails(Integer tdid);






}
