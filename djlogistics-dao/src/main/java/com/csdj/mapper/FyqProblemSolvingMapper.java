package com.csdj.mapper;

import com.csdj.pojo.*;
import org.apache.ibatis.annotations.Param;
import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.List;

public interface FyqProblemSolvingMapper {

    public List<RegistrationOfProblemsBeforePort> ropucss(@Param("waybillNumber")String waybillNumber, @Param("problemNotificationPerson")Integer problemNotificationPerson, @Param("problemStatus")Integer problemStatus, @Param("processingOutlets")Integer processingOutlets);

    public List<SupplementaryRecordingOfExpenses> supplementaryRecordingOfExpensesselect(@Param("processingStatus") String processingStatus, @Param("subject")Integer subject, @Param("cname")String cname);

    public List<Outlet> outletselect();

    public List<Order> orderselect();

    public List<ProblemStatus> problemStatusselect();

    public List<Customer> customerselect();

    public List<Subject> subjectsselect();

    public List<Currency> selectCurrency();

    public Integer addSROE(SupplementaryRecordingOfExpenses supplementaryRecordingOfExpenses);

    public SupplementaryRecordingOfExpenses getSROE(@Param("sid") Integer sid);

    public Integer updSROE(SupplementaryRecordingOfExpenses supplementaryRecordingOfExpenses);

    public Integer delSROE(@Param("sid") Integer sid);


}
