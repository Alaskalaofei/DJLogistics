package com.csdj.djlogisticsserviceimpl;

import com.csdj.mapper.FyqUpperPlateMapper;
import com.csdj.pojo.*;
import com.csdj.service.FyqUpperPlateService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class FyqUpperPlateServiceImpl implements FyqUpperPlateService {
    @Autowired
    private FyqUpperPlateMapper mapper;

    @Override
    public PageInfo<UpperPlate> getUpperPlate(Integer pageNum, Integer pageSize, Map<String,Object> map) {
        String buildBoardDate1=null;
        String buildBoardDate2=null;
        if(map.get("buildBoardDate")!=null && map.get("buildBoardDate")!=""){
            String dates= (String) map.get("buildBoardDate");
            buildBoardDate1=dates.substring(0,dates.indexOf("到"));
            buildBoardDate2=dates.substring(dates.indexOf("到")+1);
        }
        map.put("buildBoardDate1",buildBoardDate1);
        map.put("buildBoardDate2",buildBoardDate2);
        PageHelper.startPage(pageNum,pageSize);
        List<UpperPlate> list=mapper.selectUpperPlate(map);
        PageInfo<UpperPlate> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public List<BoardStrategy> selectBS() {
        return mapper.selectBS();
    }

    @Override
    public List<Outlet> selectOutlet() {
        return mapper.selectOutlet();
    }

    @Override
    public List<Customsdeclarationmethod> selectcdm() {
        return mapper.selectcdm();
    }

    @Override
    public List<GoodsType> selectGoodsType() {
        return mapper.selectGoodsType();
    }

    @Override
    public List<Specificroute> selectSpecificroute() {
        return mapper.selectSpecificroute();
    }

    @Override
    public Integer addUP(UpperPlate upperPlate) {
        Destination destination=new Destination();
        destination.setCountryCode(upperPlate.getCountryCode());
        destination.setSimplifiedName(upperPlate.getSimplifiedName());
        destination.setEnglishName(upperPlate.getEnglishName());
        destination.setName(upperPlate.getSimplifiedName());
        //查询目的地是否已经存在
        Destination destination1=mapper.selectDestination(destination);
        //不存在则新建一个目的地
        if(destination1==null){
            mapper.addDestination(destination);
            upperPlate.setDestination(destination.getDid());
        }else{
            upperPlate.setDestination(destination1.getDid());
        }
        upperPlate.setBuildBoardDate(new Date());
        upperPlate.setUpperPlateOutlets(1);
        upperPlate.setCreatorBy(1);
        upperPlate.setDataSource(1);
        upperPlate.setCreatorDate(new Date());
        upperPlate.setRestrictedWeightPerTicket(upperPlate.getRestrictedWeightPerTicket1()+"~"+upperPlate.getRestrictedWeightPerTicket2());
        return mapper.addUP(upperPlate);
    }

    @Override
    public UpperPlate getUP(String plateNo) {
        UpperPlate upperPlate=mapper.getUP(plateNo);
        Destination destination=mapper.selectDestinationByID(upperPlate.getDestination());
        upperPlate.setCountryCode(destination.getCountryCode());
        upperPlate.setSimplifiedName(destination.getSimplifiedName());
        upperPlate.setEnglishName(destination.getEnglishName());
        return upperPlate;
    }

    @Override
    public Integer updUP(UpperPlate upperPlate) {
        Destination destination=new Destination();
        destination.setCountryCode(upperPlate.getCountryCode());
        destination.setSimplifiedName(upperPlate.getSimplifiedName());
        destination.setEnglishName(upperPlate.getEnglishName());
        destination.setName(upperPlate.getSimplifiedName());
        //查询目的地是否已经存在
        Destination destination1=mapper.selectDestination(destination);
        //不存在则新建一个目的地
        if(destination1==null){
            mapper.addDestination(destination);
            upperPlate.setDestination(destination.getDid());
        }else{
            upperPlate.setDestination(destination1.getDid());
        }
        upperPlate.setRestrictedWeightPerTicket(upperPlate.getRestrictedWeightPerTicket1()+"~"+upperPlate.getRestrictedWeightPerTicket2());
        return mapper.updUP(upperPlate);
    }

    @Override
    public PageInfo<Order> getOrder(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Order> list=mapper.getOrder();
        PageInfo<Order> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<UpperPlate> selectUPAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<UpperPlate> list=mapper.selectUPAll();
        PageInfo<UpperPlate> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public UpperPlate getUPByPlateNo(String plateNo) {
        return mapper.getUPByPlateNo(plateNo);
    }

    @Override
    public Integer updUPByplateNo(UpperPlate upperPlate) {
        return mapper.updUPByplateNo(upperPlate);
    }

    @Override
    public Integer updOrderById(String pno, String oid) {
        return mapper.updOrderById(pno,oid);
    }

    @Override
    public List<UpperPlate> getUpAid() {
        return mapper.getUpAid();
    }

    @Override
    public PageInfo<AssociatedShift> getAS(Integer page,Integer limit) {
        PageHelper.startPage(page,limit);
        List<AssociatedShift> list=mapper.getAS();
        PageInfo<AssociatedShift> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Integer UpdAS(String plateNo, Integer aid) {
        Integer aid2=aid;
        if(aid==null){
            aid2=mapper.getAid(plateNo);
        }
        mapper.UpdAS(plateNo,aid);
        AssociatedShift associatedShift= mapper.getNNW(aid2);
        associatedShift.setAid(aid2);
        return  mapper.updNNW(associatedShift);
    }

    @Override
    public Integer getAid(String plateNo) {
        return mapper.getAid(plateNo);
    }
}
