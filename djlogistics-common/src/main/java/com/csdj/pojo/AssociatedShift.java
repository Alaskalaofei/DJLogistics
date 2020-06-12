package com.csdj.pojo;


public class AssociatedShift {

  private Integer aid;
  private String deliveryOrderNo;
  private java.sql.Date handoverDate;
  private Integer boardStrategy;
  private Integer numberOfVotes;
  private Integer number;
  private double weight;
  private Integer destination;
  private Integer customsDeclarationMethod;
  private String remarks;
  private Integer createdBy;
  private String dname;

  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }

  public Integer getAid() {
    return aid;
  }

  public void setAid(Integer aid) {
    this.aid = aid;
  }


  public String getDeliveryOrderNo() {
    return deliveryOrderNo;
  }

  public void setDeliveryOrderNo(String deliveryOrderNo) {
    this.deliveryOrderNo = deliveryOrderNo;
  }


  public java.sql.Date getHandoverDate() {
    return handoverDate;
  }

  public void setHandoverDate(java.sql.Date handoverDate) {
    this.handoverDate = handoverDate;
  }


  public Integer getBoardStrategy() {
    return boardStrategy;
  }

  public void setBoardStrategy(Integer boardStrategy) {
    this.boardStrategy = boardStrategy;
  }


  public Integer getNumberOfVotes() {
    return numberOfVotes;
  }

  public void setNumberOfVotes(Integer numberOfVotes) {
    this.numberOfVotes = numberOfVotes;
  }


  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }


  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }


  public Integer getDestination() {
    return destination;
  }

  public void setDestination(Integer destination) {
    this.destination = destination;
  }


  public Integer getCustomsDeclarationMethod() {
    return customsDeclarationMethod;
  }

  public void setCustomsDeclarationMethod(Integer customsDeclarationMethod) {
    this.customsDeclarationMethod = customsDeclarationMethod;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

}
