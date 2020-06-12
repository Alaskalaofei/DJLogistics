package com.csdj.djlogisticsserviceimpl;

import com.csdj.mapper.LxTransshipmentMapper;
import com.csdj.pojo.*;
import com.csdj.service.LxTransshipmentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LxTransshipmentServiceImpl implements LxTransshipmentService {

    @Autowired
    private LxTransshipmentMapper lxTransshipmentMapper;


    @Override
    public List<Outlet> findselectOutlet() {
        return lxTransshipmentMapper.selectOutlet();
    }

    @Override
    public List<TransitStatus> findselectTransitStatuses() {
        return lxTransshipmentMapper.selectTransitStatuses();
    }


    @Override
    public Integer findAddTransferNote(Transshipment transshipment) {
        return lxTransshipmentMapper.AddTransferNote(transshipment);
    }

    @Override
    public Transshipment findInquiryTransfer(String transhipmentNo) {
        return lxTransshipmentMapper.InquiryTransfer(transhipmentNo);
    }

    @Override
    public Integer findModifyTransferOrder(Transshipment transshipment) {
        return lxTransshipmentMapper.ModifyTransferOrder(transshipment);
    }


    @Override
    public TransshipmentDetails findTransferDetailsQueryTransfer(String waybillNumber) {
        return lxTransshipmentMapper.TransferDetailsQueryTransfer(waybillNumber);
    }


    @Override
    public PageInfo<Transshipment> ConditionalTransferOrderpage(Map<String,Object> map, Integer PageNum, Integer PageSize) {
        PageHelper.startPage(PageNum,PageSize);
        String TransferStartDate=null;
        String EndTranshipmentDate=null;
        if(map.get("Transittime")!=null && map.get("Transittime")!=""){
            String dates= (String) map.get("Transittime");
            TransferStartDate=dates.substring(0,dates.indexOf("到"));
            EndTranshipmentDate=dates.substring(dates.indexOf("到")+1);
           /* System.out.println(TransferStartDate+"----"+EndTranshipmentDate);*/
        }
        map.put("TransferStartDate",TransferStartDate);
        map.put("EndTranshipmentDate",EndTranshipmentDate);
        PageInfo<Transshipment> transshipmentPageInfo = new PageInfo<>();
        /*进行判断，如果是2.运单查询就查询此运单的转运单号并且查询次转运单，1.转运单查询就直接查询*/

        if((Integer) map.get("DocNoTypeID")==null)
        {
            map.put("DocNoTypeID",1);
        }

        if((Integer) map.get("DocNoTypeID")==1)
        {
            transshipmentPageInfo=new PageInfo<>(lxTransshipmentMapper.ConditionalTransferOrder(map));
        }
        else if((Integer) map.get("DocNoTypeID")==2)
        {
            /*按运单查询出它的转运单号*/
            String odd= (String) map.get("OddNumbers");
            TransshipmentDetails transshipmentDetails=lxTransshipmentMapper.TransferDetailsQueryTransfer(odd);
                if(transshipmentDetails!=null) {
                    map.put("OddNumbers", transshipmentDetails.getTranshipmentNo());
                }else
                    {
                        map.put("OddNumbers","无数据");
                    }
            transshipmentPageInfo=new PageInfo<>(lxTransshipmentMapper.ConditionalTransferOrder(map));
        }


        return transshipmentPageInfo;
    }



    @Override
    public PageInfo<TransshipmentDetails> findTransferDetailsInquiry(String transhipmentNo, Integer PageNum, Integer PageSize) {

        PageHelper.startPage(PageNum,PageSize);

        return new PageInfo<>(lxTransshipmentMapper.TransferDetailsInquiry(transhipmentNo));
    }

    @Override
    public Order findWaybillNumberInquiryWaybill(String waybillNumber) {
        return lxTransshipmentMapper.WaybillNumberInquiryWaybill(waybillNumber);
    }

    @Override
    public Integer findAddScanNumber(TransshipmentDetails transshipmentDetails) {
        return lxTransshipmentMapper.AddScanNumber(transshipmentDetails);
    }

    @Override
    public Integer finddelTransferDetails(Integer tdid) {
        return lxTransshipmentMapper.delTransferDetails(tdid);
    }
}
