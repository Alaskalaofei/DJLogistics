package com.csdj.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RegistrationOfProblemsBeforePort {

  private Integer rid;
  private Integer processingStatus;
  private String  waybillNumber;
  private Integer transferNo;
  private Integer problemStatus;
  private String problemDescription;
  private Integer processingOutlets;
  private Integer problemNotificationPerson;
    @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date asOfProcessingDate;
  private Integer registrationOutlets;
  private Integer registrant;

  private Order order;
  private ProblemStatus problem;
  private Outlet outlet;
  private Customer customer;
  private Staff staff;

  public void setAsOfProcessingDate(Date asOfProcessingDate) {
    this.asOfProcessingDate = asOfProcessingDate;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public ProblemStatus getProblem() {
    return problem;
  }

  public void setProblem(ProblemStatus problem) {
    this.problem = problem;
  }

  public Outlet getOutlet() {
    return outlet;
  }

  public void setOutlet(Outlet outlet) {
    this.outlet = outlet;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Staff getStaff() {
    return staff;
  }

  public void setStaff(Staff staff) {
    this.staff = staff;
  }

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }


  public Integer getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(Integer processingStatus) {
    this.processingStatus = processingStatus;
  }


  public String getWaybillNumber() {
    return waybillNumber;
  }

  public void setWaybillNumber(String waybillNumber) {
    this.waybillNumber = waybillNumber;
  }


  public Integer getTransferNo() {
    return transferNo;
  }

  public void setTransferNo(Integer transferNo) {
    this.transferNo = transferNo;
  }


  public Integer getProblemStatus() {
    return problemStatus;
  }

  public void setProblemStatus(Integer problemStatus) {
    this.problemStatus = problemStatus;
  }


  public String getProblemDescription() {
    return problemDescription;
  }

  public void setProblemDescription(String problemDescription) {
    this.problemDescription = problemDescription;
  }


  public Integer getProcessingOutlets() {
    return processingOutlets;
  }

  public void setProcessingOutlets(Integer processingOutlets) {
    this.processingOutlets = processingOutlets;
  }


  public Integer getProblemNotificationPerson() {
    return problemNotificationPerson;
  }

  public void setProblemNotificationPerson(Integer problemNotificationPerson) {
    this.problemNotificationPerson = problemNotificationPerson;
  }

  public Date getAsOfProcessingDate() {
    return asOfProcessingDate;
  }

  public Integer getRegistrationOutlets() {
    return registrationOutlets;
  }

  public void setRegistrationOutlets(Integer registrationOutlets) {
    this.registrationOutlets = registrationOutlets;
  }


  public Integer getRegistrant() {
    return registrant;
  }

  public void setRegistrant(Integer registrant) {
    this.registrant = registrant;
  }

}
