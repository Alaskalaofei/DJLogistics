package com.csdj.pojo;


import java.util.Date;

public class Order {

  private Integer oid;
  private Integer state;
  private String waybillNumber;
  private String referenceNumber;
  private Integer billingStatus;
  private String orderBagNo;
  private Date orderDate;
  private Integer mailingOutlets;
  private Date mailingDate;
  private Integer customerId;
  private Integer packingType;
  private Integer goodsType;
  private String chineseName;
  private Integer customsDeclarationMethod;
  private Integer deliveryOutlets;
  private Integer orderDataSource;
  private Date creationTime;
  private Integer createdBy;


  public Integer getOid() {
    return oid;
  }

  public void setOid(Integer oid) {
    this.oid = oid;
  }


  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }


  public String getWaybillNumber() {
    return waybillNumber;
  }

  public void setWaybillNumber(String waybillNumber) {
    this.waybillNumber = waybillNumber;
  }


  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }


  public Integer getBillingStatus() {
    return billingStatus;
  }

  public void setBillingStatus(Integer billingStatus) {
    this.billingStatus = billingStatus;
  }


  public String getOrderBagNo() {
    return orderBagNo;
  }

  public void setOrderBagNo(String orderBagNo) {
    this.orderBagNo = orderBagNo;
  }


  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }


  public Integer getMailingOutlets() {
    return mailingOutlets;
  }

  public void setMailingOutlets(Integer mailingOutlets) {
    this.mailingOutlets = mailingOutlets;
  }


  public Date getMailingDate() {
    return mailingDate;
  }

  public void setMailingDate(Date mailingDate) {
    this.mailingDate = mailingDate;
  }


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public Integer getPackingType() {
    return packingType;
  }

  public void setPackingType(Integer packingType) {
    this.packingType = packingType;
  }


  public Integer getGoodsType() {
    return goodsType;
  }

  public void setGoodsType(Integer goodsType) {
    this.goodsType = goodsType;
  }


  public String getChineseName() {
    return chineseName;
  }

  public void setChineseName(String chineseName) {
    this.chineseName = chineseName;
  }


  public Integer getCustomsDeclarationMethod() {
    return customsDeclarationMethod;
  }

  public void setCustomsDeclarationMethod(Integer customsDeclarationMethod) {
    this.customsDeclarationMethod = customsDeclarationMethod;
  }


  public Integer getDeliveryOutlets() {
    return deliveryOutlets;
  }

  public void setDeliveryOutlets(Integer deliveryOutlets) {
    this.deliveryOutlets = deliveryOutlets;
  }


  public Integer getOrderDataSource() {
    return orderDataSource;
  }

  public void setOrderDataSource(Integer orderDataSource) {
    this.orderDataSource = orderDataSource;
  }


  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }


  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

}
