package com.csdj.djlogisticsserviceimpl;

import com.csdj.mapper.FyqBaggingMapper;
import com.csdj.mapper.FyqUpperPlateMapper;
import com.csdj.pojo.Bagging;
import com.csdj.pojo.BaggingStrategy;
import com.csdj.pojo.Destination;
import com.csdj.service.FyqBaggingService;
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
public class FyqBaggingServiceImpl implements FyqBaggingService {
    @Autowired
    private FyqBaggingMapper mapper;

    @Autowired
    private FyqUpperPlateMapper mapper2;

    @Override
    public PageInfo<Bagging> getBagging(Integer pageNum, Integer pageSize,Map<String,Object> map) {
        String creatorDate1=null;
        String creatorDate2=null;
        if(map.get("creatorDate")!=null && map.get("creatorDate")!=""){
            String dates= (String) map.get("creatorDate");
            creatorDate1=dates.substring(0,dates.indexOf("到"));
            creatorDate2=dates.substring(dates.indexOf("到")+1);
        }
        map.put("creatorDate1",creatorDate1);
        map.put("creatorDate2",creatorDate2);
        Integer is=(Integer) map.get("is");
        if(is!=null){
            if(is==0){
                map.put("plateNo",map.get("number"));
            }else{
                map.put("orderNumber",map.get("number"));
            }
        }
        PageHelper.startPage(pageNum,pageSize);
        List<Bagging> list=mapper.getBagging(map);
        PageInfo<Bagging> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public PageInfo<Bagging> getBaggingAll(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<Bagging> list=mapper.getBaggingAll();
        PageInfo<Bagging> pageInfo=new PageInfo<>(list);
        return pageInfo;
    }

    @Override
    public Bagging selectBaggingByPlateNo(String plateNo) {
        Bagging bagging= mapper.selectBaggingByPlateNo(plateNo);
        Destination destination=mapper2.selectDestinationByID(bagging.getDestination());
        bagging.setCountryCode(destination.getCountryCode());
        bagging.setSimplifiedName(destination.getSimplifiedName());
        bagging.setEnglishName(destination.getEnglishName());
        return bagging;
    }

    @Override
    public Integer updOrder(String bno, String oid) {
        return mapper.updOrder(bno,oid);
    }

    @Override
    public List<BaggingStrategy> getBS() {
        return mapper.getBS();
    }

    @Override
    public Integer addBagging(Bagging bagging) {
        Destination destination=new Destination();
        destination.setCountryCode(bagging.getCountryCode());
        destination.setSimplifiedName(bagging.getSimplifiedName());
        destination.setEnglishName(bagging.getEnglishName());
        destination.setName(bagging.getSimplifiedName());
        //查询目的地是否已经存在
        Destination destination1=mapper2.selectDestination(destination);
        //不存在则新建一个目的地
        if(destination1==null){
            mapper2.addDestination(destination);
            bagging.setDestination(destination.getDid());
        }else{
            bagging.setDestination(destination1.getDid());
        }

        bagging.setCreatorDate(new Date());
        bagging.setCreatorBy(1);
        bagging.setSaggingState(1);
        bagging.setDataSource(1);
        bagging.setRestrictedWeightPerTicket(bagging.getRestrictedWeightPerTicket1()+"~"+bagging.getRestrictedWeightPerTicket2());
        bagging.setLimitedValueOfSingleTicket(bagging.getLimitedValueOfSingleTicket1()+"~"+bagging.getLimitedValueOfSingleTicket2());
        return mapper.addBagging(bagging);
    }

    @Override
    public Integer updBagging(Bagging bagging) {
        Destination destination=new Destination();
        destination.setCountryCode(bagging.getCountryCode());
        destination.setSimplifiedName(bagging.getSimplifiedName());
        destination.setEnglishName(bagging.getEnglishName());
        destination.setName(bagging.getSimplifiedName());
        //查询目的地是否已经存在
        Destination destination1=mapper2.selectDestination(destination);
        //不存在则新建一个目的地
        if(destination1==null){
            mapper2.addDestination(destination);
            bagging.setDestination(destination.getDid());
        }else{
            bagging.setDestination(destination1.getDid());
        }
        bagging.setRestrictedWeightPerTicket(bagging.getRestrictedWeightPerTicket1()+"~"+bagging.getRestrictedWeightPerTicket2());
        bagging.setLimitedValueOfSingleTicket(bagging.getLimitedValueOfSingleTicket1()+"~"+bagging.getLimitedValueOfSingleTicket2());
        return mapper.updBagging(bagging);
    }

    @Override
    public Integer updBaggingState(Integer saggingState, String plateNo) {
        return mapper.updBaggingState(saggingState,plateNo);
    }
}
