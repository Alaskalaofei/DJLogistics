package com.csdj.controller;

import com.csdj.pojo.RegistrationOfProblemsBeforePort;
import com.csdj.pojo.SupplementaryRecordingOfExpenses;
import com.csdj.service.FyqProblemSolvingService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/ps")
public class FyqProblemSolvingController {
    @Autowired
    private FyqProblemSolvingService service;

    @RequestMapping("/ropucss")
    @ResponseBody
    public Object ropucss(String waybillNumber, Integer problemNotificationPerson, Integer problemStatus, Integer processingOutlets, Integer page, Integer limit){
        PageInfo<RegistrationOfProblemsBeforePort> pages = service.ropucss(waybillNumber,problemNotificationPerson,problemStatus,processingOutlets,page,limit);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pages.getTotal());
        map.put("data", pages.getList());
        return map;
    }

    @RequestMapping("/supplementaryRecordingOfExpensesselect")
    @ResponseBody
    public Object supplementaryRecordingOfExpensesselect(String processingStatus, Integer subject, String cname, Integer page, Integer limit){
        PageInfo<SupplementaryRecordingOfExpenses> pages = service.supplementaryRecordingOfExpensesselect(processingStatus,subject,cname,page,limit);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", pages.getTotal());
        map.put("data", pages.getList());
        return map;
    }

    /**
     *网点
     * @return
     */
    @RequestMapping(value = "/outletselect", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Object outletselect() {
        return service.outletselect();
    }

    /**
     *订单
     * @return
     */
    @RequestMapping(value = "/orderselect", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Object orderselect() {
        return service.orderselect();
    }

    /**
     *问题状态
     * @return
     */
    @RequestMapping(value = "/problemStatusselect", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Object problemStatusselect() {
        return service.problemStatusselect();
    }


    /**
     *客户
     * @return
     */
    @RequestMapping(value = "/customerselect", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Object customerselect() {
        return service.customerselect();
    }

    /**
     *科目状态
     * @return
     */
    @RequestMapping(value = "/subjectsselect", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Object subjectsselect() {
        return service.subjectsselect();
    }

    /**
     *币种
     * @return
     */
    @RequestMapping(value = "/selectCurrency", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Object selectCurrency() {
        return service.selectCurrency();
    }

    @RequestMapping(value = "/addSROE", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Integer addSROE(SupplementaryRecordingOfExpenses supplementaryRecordingOfExpenses) {
        return service.addSROE(supplementaryRecordingOfExpenses);
    }

    @RequestMapping(value = "/updSROE", produces = "application/json;charset=utf-8")
    @ResponseBody
    public Integer updSROE(SupplementaryRecordingOfExpenses supplementaryRecordingOfExpenses) {
        return service.updSROE(supplementaryRecordingOfExpenses);
    }

    @RequestMapping(value = "/getSROE",produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Object getSROE(Integer sid){
        return service.getSROE(sid);
    }

    @RequestMapping("delSROE")
    @ResponseBody
    public Integer delSROE(Integer sid){
        return service.delSROE(sid);
    }

}
