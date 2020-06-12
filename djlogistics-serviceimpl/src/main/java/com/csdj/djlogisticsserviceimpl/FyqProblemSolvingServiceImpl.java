package com.csdj.djlogisticsserviceimpl;

import com.csdj.mapper.FyqProblemSolvingMapper;
import com.csdj.pojo.*;
import com.csdj.service.FyqProblemSolvingService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class FyqProblemSolvingServiceImpl implements FyqProblemSolvingService {
    @Autowired
    private FyqProblemSolvingMapper mapper;

    @Override
    public PageInfo<RegistrationOfProblemsBeforePort> ropucss(String waybillNumber, Integer problemNotificationPerson, Integer problemStatus, Integer processingOutlets, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);

        List<RegistrationOfProblemsBeforePort> list = mapper.ropucss(waybillNumber,problemNotificationPerson,problemStatus,processingOutlets);

        PageInfo<RegistrationOfProblemsBeforePort> pInfo = new PageInfo<>(list);
        return pInfo;
    }

    @Override
    public List<Subject> subjectsselect() {
        return mapper.subjectsselect();
    }

    @Override
    public List<Currency> selectCurrency() {
        return mapper.selectCurrency();
    }

    @Override
    public Integer addSROE(SupplementaryRecordingOfExpenses supplementaryRecordingOfExpenses) {
        return mapper.addSROE(supplementaryRecordingOfExpenses);
    }

    @Override
    public SupplementaryRecordingOfExpenses getSROE(Integer sid) {
        return mapper.getSROE(sid);
    }

    @Override
    public Integer updSROE(SupplementaryRecordingOfExpenses supplementaryRecordingOfExpenses) {
        return mapper.updSROE(supplementaryRecordingOfExpenses);
    }

    @Override
    public Integer delSROE(Integer sid) {
        return mapper.delSROE(sid);
    }


    @Override
    public PageInfo<SupplementaryRecordingOfExpenses> supplementaryRecordingOfExpensesselect(String processingStatus, Integer subject, String cname, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);

        List<SupplementaryRecordingOfExpenses> list = mapper.supplementaryRecordingOfExpensesselect(processingStatus,subject,cname);

        PageInfo<SupplementaryRecordingOfExpenses> pInfo = new PageInfo<>(list);

        return pInfo;
    }

    @Override
    public List<Outlet> outletselect() {
        return mapper.outletselect();
    }

    @Override
    public List<Order> orderselect() {
        return mapper.orderselect();
    }

    @Override
    public List<ProblemStatus> problemStatusselect() {
        return mapper.problemStatusselect();
    }

    @Override
    public List<Customer> customerselect() {
        return mapper.customerselect();
    }

}
