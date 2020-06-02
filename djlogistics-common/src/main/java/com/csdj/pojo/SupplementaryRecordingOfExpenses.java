package com.csdj.pojo;


import java.util.Date;

public class SupplementaryRecordingOfExpenses {

  private Integer sid;
  private Integer processingStatus;
  private Integer transferNo;
  private Date mailingDate;
  private Integer subject;
  private Integer customer;
  private float amountOfMoney;
  private Integer currency;
  private Integer mailingOutlets;
  private String billNotes;
  private String internalRemarks;


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
