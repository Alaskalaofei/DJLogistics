package com.csdj.controller;

import com.csdj.pojo.*;
import com.csdj.service.LxTransshipmentService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LxTransshipmentController {
    @Autowired
    private LxTransshipmentService lxTransshipmentService;

    /**
     * 查询网点下拉框
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectOutlet")
    public List<Outlet> selectOutlet()
    {
        return lxTransshipmentService.findselectOutlet();
    }

    /**
     * 查询转运状态下拉框
     * @return
     */
    @ResponseBody
    @RequestMapping("/selectTransitStatus")
    public List<TransitStatus> selectTransitStatus()
    {
        return lxTransshipmentService.findselectTransitStatuses();
    }

    /**
     * 查询转运表，有条件分页
     * @param DocNoTypeID
     * @param OddNumbers
     * @param Transittime
     * @param DeliveryOutlets
     * @param ArrivalOutlet
     * @param TransitStatus
     * @param PageNum
     * @param PageSize
     * @return
     */
    @ResponseBody
    @RequestMapping("/TransshipmentInquiry")
    public Map<String, Object> TransshipmentInquiry(Integer DocNoTypeID, String OddNumbers,String Transittime, Integer DeliveryOutlets,
                                                    Integer ArrivalOutlet, Integer TransitStatus , Integer PageNum, Integer PageSize)
    {

        Map<String,Object> map=new HashMap<>();
        if(PageNum==null || PageNum==0){
            PageNum=1;
        };


        map.put("DocNoTypeID",DocNoTypeID);
        map.put("OddNumbers",OddNumbers);
        map.put("Transittime",Transittime);
        map.put("TransferStartDate","");//转运时间从
        map.put("EndTranshipmentDate","");//转运时间到
        map.put("DeliveryOutlets",DeliveryOutlets);
        map.put("ArrivalOutlet",ArrivalOutlet);
        map.put("TransitStatus",TransitStatus);

        PageInfo<Transshipment> pageInfo=lxTransshipmentService.ConditionalTransferOrderpage(map,PageNum,PageSize);

        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("code", 0);
        map1.put("msg", "");
        map1.put("count",pageInfo.getTotal());
        map1.put("data", pageInfo.getList());
        return map1;
    }

    /**
     * 判断转运单号是否重复
     * @param transhipmentNo
     * @return
     */
    @ResponseBody
    @RequestMapping("/notandyestransshipmentNO")
    public String notandyestransshipmentNO(String transhipmentNo)
    {
        Transshipment transshipment=lxTransshipmentService.findInquiryTransfer(transhipmentNo);
        if(transshipment!=null)
        {
            /*数据库有此转运单号不可新增*/
            return "not";
        }
        /*数据库无此转运单号，可新增*/
        return "yes";
    }

    /**
     * 新增转运单
     * @param transhipmentNo
     * @param djselectOutlet
     * @param remarks
     * @param deliveredGoods
     * @return
     */
    @ResponseBody
    @RequestMapping("/Newtransshipmentdata")
     public String  Newtransshipmentdata(HttpSession session, String transhipmentNo, Integer djselectOutlet, String remarks, Integer deliveredGoods)
    {
        Transshipment transshipment=new Transshipment();

        transshipment.setTranshipmentNo(transhipmentNo);///*转运单号*/
        transshipment.setTransshipmentDate(new Date());//当前时间
        transshipment.setDispatchOutlets(1);//合项目时修改成新增此转运表的角色所属的网点id 发件网点
        transshipment.setReachPieceOutlets(djselectOutlet);//到件网点
        transshipment.setDispatchError(0);
        transshipment.setCreationTime(new Date());//创建时间
        transshipment.setCreatedBy(1);//创建人
        transshipment.setRemarks(remarks);//备注
        transshipment.setDeliveredGoods(deliveredGoods);//走货路线必须归属为到件网点 0 否 1 是

        Integer end=lxTransshipmentService.findAddTransferNote(transshipment);
        if(end==null || end==0)
        {
            /*新增失败*/
            return"not";
        }
        session.setAttribute("transhipmentNo",transhipmentNo);
        /*新增成功*/
      return "yes";
    }

    /**
     * 查询单个转运
     * @param transhipmentNo
     * @return
     */
    @ResponseBody
    @RequestMapping("/InquiryTransfer")
    private Transshipment InquiryTransfer(String transhipmentNo)
    {

        Transshipment transshipment=lxTransshipmentService.findInquiryTransfer(transhipmentNo);

        return transshipment;
    }

    /**
     * 修改新转运单
     * @param tid
     * @param djselectOutlet
     * @param remarks
     * @param deliveredGoods
     * @return
     */
    @ResponseBody
    @RequestMapping("/Modifywaybill")
    public String  Modifywaybill(Integer tid,Integer djselectOutlet, String remarks, Integer deliveredGoods)
    {
        Transshipment transshipment=new Transshipment();
        transshipment.setTid(tid);
        transshipment.setReachPieceOutlets(djselectOutlet);//到件网点
        transshipment.setRemarks(remarks);//备注
        transshipment.setDeliveredGoods(deliveredGoods);//走货路线必须归属为到件网点 0 否 1 是

        Integer end=lxTransshipmentService.findModifyTransferOrder(transshipment);
        if(end==null || end==0)
        {
            /*修改失败*/
            return"not";
        }
        /*修改成功*/
        return "yes";
    }






    /**
     * 新增转运明细单，修改转运单
     * @param transhipmentNo
     * @param session
     * @param waybillNumber
     * @return
     */
    @ResponseBody
    @RequestMapping("/AddTransferNote")
    public String  AddTransferNote(HttpSession session, String transhipmentNo,String waybillNumber)
    {

        /*转运明细*/
        TransshipmentDetails transshipmentDetails=new TransshipmentDetails();
        /*转运单，修改用，合计票数，合计件数，合计实重*/
        Transshipment transshipment=new Transshipment();


        /*查询到订单*/
        Order order=lxTransshipmentService.findWaybillNumberInquiryWaybill(waybillNumber);
        /*查询到转运单*/
        Transshipment transshipmentyesandnull=lxTransshipmentService.findInquiryTransfer(transhipmentNo);

        if(order==null)
        {
            /*运单为空，返回数据*/
            return "order_null";
        }
        else if(transshipmentyesandnull==null)
        {
                    /*转运单号为空*/
                return "transshipment_null";
        }
                transshipmentDetails.setTranshipmentNo(transshipmentyesandnull.getTranshipmentNo());
                transshipmentDetails.setWaybillNumber(order.getWaybillNumber());
                transshipmentDetails.setArrived(0);//是否已到？，默认为零
                transshipmentDetails.setNumberOfTicketsArrived(order.getTotalVotes());//当前运单扫描票数，默认为零，到件用(可能有用)
                transshipmentDetails.setArrivalOfWaybill(order.getTotalVotes());//当前运单扫描件数
                transshipmentDetails.setReviewActual_Weight(order.getRchargeactualweight());//复核实重
                transshipmentDetails.setRecheckAbnormality("");//
                transshipmentDetails.setWarehousing_Time(new Date());//入库时间
                transshipmentDetails.setScan_time(new Date());


                Integer transshipmentDetailsaddend=lxTransshipmentService.findAddScanNumber(transshipmentDetails);
                if(transshipmentDetailsaddend==1)
                {
                    transshipment.setTid(transshipmentyesandnull.getTid());//tid
                    transshipment.setTranshipmentNo(transhipmentNo);///*转运单号*/
                    Integer TotalVotes=transshipmentyesandnull.getTotalVotes()+transshipmentDetails.getNumberOfTicketsArrived();
                    transshipment.setTotalVotes(TotalVotes);//总票数
                    transshipment.setTotalPieces(transshipmentyesandnull.getTotalPieces()+transshipmentDetails.getArrivalOfWaybill());//总件数
                    transshipment.setTotalActualWeight(transshipmentyesandnull.getTotalActualWeight()+transshipmentDetails.getReviewActual_Weight());//总实重
                    Integer end=lxTransshipmentService.findModifyTransferOrder(transshipment);
                    if(end==null || end==0)
                    {
                        /*新增失败*/
                        return"not";
                    }

                }

            session.setAttribute("transhipmentNo",transshipmentyesandnull.getTranshipmentNo());
        /*新增成功*/
        return "yes";
    }


    /**
     * 查询转运表，有条件分页
     * @param transhipmentNo
     * @return
     */
    @ResponseBody
    @RequestMapping("/transshipmentDetailsInquiry")
    public Map<String, Object> transshipmentDetailsInquiry(String transhipmentNo, Integer PageNum, Integer PageSize)
    {

        if(PageNum==null || PageNum==0)
        {
            PageNum=1;
        }

        PageInfo<TransshipmentDetails> pageInfo=lxTransshipmentService.findTransferDetailsInquiry(transhipmentNo,PageNum,PageSize);

        Map<String,Object> map=new HashMap<>();

        map.put("code", 0);
        map.put("msg", "");
        map.put("count",pageInfo.getTotal());
        map.put("data", pageInfo.getList());
        return map;
    }


    /**
     * 修改新转运单状态为已发送
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/Transferordermodificationsentstatus")
    public String  Transferordermodificationsentstatus(String transhipmentNo)
    {
        Transshipment transshipment=new Transshipment();

        /*查询到转运单*/
        Transshipment transshipmentyesandnull=lxTransshipmentService.findInquiryTransfer(transhipmentNo);

        if(transshipmentyesandnull==null)
        {
            /*转运单为空*/
            return "nottransshipment";
        }
        else if(transshipmentyesandnull.getTransitStatusId()!=1)
        {
            /*转运单状态必须为已建立*/
            return "notTransitStatusId";
        }else
            {
                transshipment.setTid(transshipmentyesandnull.getTid());
                transshipment.setTransitStatusId(2);//修改为已发送
                Integer end=lxTransshipmentService.findModifyTransferOrder(transshipment);
                if(end==null || end==0)
                {
                    /*修改失败*/
                    return"not";
                }
            }

        /*修改成功*/
        return "yes";
    }

    /**
     * 修改新转运单状态为已发送
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/Transferstatuscancellation")
    public String  Transferstatuscancellation(String transhipmentNo)
    {
        Transshipment transshipment=new Transshipment();

        /*查询到转运单*/
        Transshipment transshipmentyesandnull=lxTransshipmentService.findInquiryTransfer(transhipmentNo);

        if(transshipmentyesandnull==null)
        {
            /*转运单为空*/
            return "nottransshipment";
        }
        else if(transshipmentyesandnull.getTransitStatusId()==1)
        {
            /*转运单状态为已建立无法撤销*/
            return "notTransitStatusId";
        }else if(transshipmentyesandnull.getTransitStatusId()==2)
        {
            transshipment.setTid(transshipmentyesandnull.getTid());
            transshipment.setTransitStatusId(1);//修改为已创建
            Integer end=lxTransshipmentService.findModifyTransferOrder(transshipment);
            if(end==null || end==0)
            {
                /*修改失败*/
                return"not";
            }
        }else if(transshipmentyesandnull.getTransitStatusId()==3)
        {
            transshipment.setTid(transshipmentyesandnull.getTid());
            transshipment.setTransitStatusId(2);//修改为已发送
            Integer end=lxTransshipmentService.findModifyTransferOrder(transshipment);
            if(end==null || end==0)
            {
                /*修改失败*/
                return"not";
            }
        }else if(transshipmentyesandnull.getTransitStatusId()==4)
        {
            /*转运单状态为已撤销无法撤回*/
            return "Withdrawn and cannot be withdrawn";
        }

        /*修改成功*/
        return "yes";
    }

    /**
     * 删除转运明细一项
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/delTransferDetailstdid")
    public String  delTransferDetailstdid(Integer tdid)
    {

            Integer end=lxTransshipmentService.finddelTransferDetails(tdid);
            if(end==null || end==0)
            {
                /*删除成功*/
                return"not";
            }


        /*删除失败*/
        return "yes";
    }

    /**
     * session
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/addsessiontranshipmentNo")
    public String  addsessiontranshipmentNo(HttpSession session, String transhipmentNo)
    {

        /*查询到转运单*/
        Transshipment transshipmentyesandnull=lxTransshipmentService.findInquiryTransfer(transhipmentNo);

        session.setAttribute("transhipmentNo",transshipmentyesandnull.getTranshipmentNo());

        return "yes";

    }



}
