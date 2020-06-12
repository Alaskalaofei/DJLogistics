package com.csdj.service;

import com.csdj.pojo.*;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FyqProblemSolvingService {
    public PageInfo<RegistrationOfProblemsBeforePort> ropucss(String waybillNumber, Integer problemNotificationPerson, Integer problemStatus, Integer processingOutlets, Integer page, Integer limit);

    public PageInfo<SupplementaryRecordingOfExpenses> supplementaryRecordingOfExpensesselect(String processingStatus, Integer subject, String cname, Integer page, Integer limit);

    public List<Outlet> outletselect();

    public List<Order> orderselect();

    public List<ProblemStatus> problemStatusselect();

    public List<Customer> customerselect();

    public List<Subject> subjectsselect();

    public List<Currency> selectCurrency();

    public Integer addSROE(SupplementaryRecordingOfExpenses supplementaryRecordingOfExpenses);

    public SupplementaryRecordingOfExpenses getSROE(Integer sid);

    public Integer updSROE(SupplementaryRecordingOfExpenses supplementaryRecordingOfExpenses);

    public Integer delSROE(Integer sid);
}
