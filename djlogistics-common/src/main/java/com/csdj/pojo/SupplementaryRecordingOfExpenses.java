package com.csdj.pojo;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class SupplementaryRecordingOfExpenses {

  private Integer sid;
  private Integer processingStatus;
  private Integer transferNo;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date mailingDate;
  private Integer subject;
  private Integer customer;
  private float amountOfMoney;
  private Integer currency;
  private Integer mailingOutlets;
  private String billNotes;
  private String internalRemarks;

  private Order order;
  private Subject subjects;
  private Outlet outlet;
  private Customer customers;
  private Currency currencys;
  private String bstate;
  private String pname;
  private String tname;
  private String dname;
  private String customsdeclarationmethod;
  private String routename;

  public String getTname() {
    return tname;
  }

  public void setTname(String tname) {
    this.tname = tname;
  }

  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }

  public String getCustomsdeclarationmethod() {
    return customsdeclarationmethod;
  }

  public void setCustomsdeclarationmethod(String customsdeclarationmethod) {
    this.customsdeclarationmethod = customsdeclarationmethod;
  }

  public String getRoutename() {
    return routename;
  }

  public void setRoutename(String routename) {
    this.routename = routename;
  }

  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }

  public String getBstate() {
    return bstate;
  }

  public void setBstate(String bstate) {
    this.bstate = bstate;
  }

  public Currency getCurrencys() {
    return currencys;
  }

  public void setCurrencys(Currency currencys) {
    this.currencys = currencys;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Subject getSubjects() {
    return subjects;
  }

  public void setSubjects(Subject subjects) {
    this.subjects = subjects;
  }

  public Outlet getOutlet() {
    return outlet;
  }

  public void setOutlet(Outlet outlet) {
    this.outlet = outlet;
  }

  public Customer getCustomers() {
    return customers;
  }

  public void setCustomers(Customer customers) {
    this.customers = customers;
  }

  public Integer getSid() {
    return sid;
  }

  public void setSid(Integer sid) {
    this.sid = sid;
  }


  public Integer getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(Integer processingStatus) {
    this.processingStatus = processingStatus;
  }


  public Integer getTransferNo() {
    return transferNo;
  }

  public void setTransferNo(Integer transferNo) {
    this.transferNo = transferNo;
  }


  public Date getMailingDate() {
    return mailingDate;
  }

  public void setMailingDate(Date mailingDate) {
    this.mailingDate = mailingDate;
  }


  public Integer getSubject() {
    return subject;
  }

  public void setSubject(Integer subject) {
    this.subject = subject;
  }


  public Integer getCustomer() {
    return customer;
  }

  public void setCustomer(Integer customer) {
    this.customer = customer;
  }


  public float getAmountOfMoney() {
    return amountOfMoney;
  }

  public void setAmountOfMoney(float amountOfMoney) {
    this.amountOfMoney = amountOfMoney;
  }


  public Integer getCurrency() {
    return currency;
  }

  public void setCurrency(Integer currency) {
    this.currency = currency;
  }


  public Integer getMailingOutlets() {
    return mailingOutlets;
  }

  public void setMailingOutlets(Integer mailingOutlets) {
    this.mailingOutlets = mailingOutlets;
  }


  public String getBillNotes() {
    return billNotes;
  }

  public void setBillNotes(String billNotes) {
    this.billNotes = billNotes;
  }


  public String getInternalRemarks() {
    return internalRemarks;
  }

  public void setInternalRemarks(String internalRemarks) {
    this.internalRemarks = internalRemarks;
  }

}
