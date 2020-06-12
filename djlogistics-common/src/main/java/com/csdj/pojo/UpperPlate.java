package com.csdj.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UpperPlate {
  private Integer uid;
  private String plateNo;
  private String orderNumber;
  private Integer scanNo;
  private Integer boardStrategy;
  private Integer deliveryOutlets;
  private Integer destination;
  private Integer customsDeclarationMethod;
  private String destinationAirportCode;
  private String restrictedWeightPerTicket;
  private Integer upperPlateOutlets;
  private Order order;
  private String dname;
  private String cdmName;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date buildBoardDate;
  private Integer creatorBy;
  private String boardStrategyName;
  private String upperPlateOutletsName;
  private Integer upperState;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date creatorDate;
  private String creatorName;
  private Integer takeTheCargoRoute;
  private Integer goodsType;
  private float restrictedWeightPerTicket1;
  private float restrictedWeightPerTicket2;
  private String countryCode;
  private String simplifiedName;
  private String englishName;
  private String remark;
  private String gname;
  private Integer dataSource;
private String takeTheCargoRouteName;
private Integer ocount;
private String bname;
private  Integer aid;

  public Integer getAid() {
    return aid;
  }

  public void setAid(Integer aid) {
    this.aid = aid;
  }

  public String getBname() {
    return bname;
  }

  public void setBname(String bname) {
    this.bname = bname;
  }

  public Integer getOcount() {
    return ocount;
  }

  public void setOcount(Integer ocount) {
    this.ocount = ocount;
  }

  public String getTakeTheCargoRouteName() {
    return takeTheCargoRouteName;
  }

  public void setTakeTheCargoRouteName(String takeTheCargoRouteName) {
    this.takeTheCargoRouteName = takeTheCargoRouteName;
  }

  public Integer getDataSource() {
    return dataSource;
  }

  public void setDataSource(Integer dataSource) {
    this.dataSource = dataSource;
  }

  public String getGname() {
    return gname;
  }

  public void setGname(String gname) {
    this.gname = gname;
  }

  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  public String getCountryCode() {
    return countryCode;
  }

  public void setCountryCode(String countryCode) {
    this.countryCode = countryCode;
  }

  public String getSimplifiedName() {
    return simplifiedName;
  }

  public void setSimplifiedName(String simplifiedName) {
    this.simplifiedName = simplifiedName;
  }

  public String getEnglishName() {
    return englishName;
  }

  public void setEnglishName(String englishName) {
    this.englishName = englishName;
  }

  public float getRestrictedWeightPerTicket1() {
    return restrictedWeightPerTicket1;
  }

  public void setRestrictedWeightPerTicket1(float restrictedWeightPerTicket1) {
    this.restrictedWeightPerTicket1 = restrictedWeightPerTicket1;
  }

  public float getRestrictedWeightPerTicket2() {
    return restrictedWeightPerTicket2;
  }

  public void setRestrictedWeightPerTicket2(float restrictedWeightPerTicket2) {
    this.restrictedWeightPerTicket2 = restrictedWeightPerTicket2;
  }

  public Integer getTakeTheCargoRoute() {
    return takeTheCargoRoute;
  }

  public void setTakeTheCargoRoute(Integer takeTheCargoRoute) {
    this.takeTheCargoRoute = takeTheCargoRoute;
  }

  public Integer getGoodsType() {
    return goodsType;
  }

  public void setGoodsType(Integer goodsType) {
    this.goodsType = goodsType;
  }

  public Date getCreatorDate() {
    return creatorDate;
  }

  public void setCreatorDate(Date creatorDate) {
    this.creatorDate = creatorDate;
  }

  public String getCreatorName() {
    return creatorName;
  }

  public void setCreatorName(String creatorName) {
    this.creatorName = creatorName;
  }



  public Integer getUpperState() {
    return upperState;
  }

  public void setUpperState(Integer upperState) {
    this.upperState = upperState;
  }

  public String getUpperPlateOutletsName() {
    return upperPlateOutletsName;
  }

  public void setUpperPlateOutletsName(String upperPlateOutletsName) {
    this.upperPlateOutletsName = upperPlateOutletsName;
  }

  public String getDeliveryOutletsName() {
    return deliveryOutletsName;
  }

  public void setDeliveryOutletsName(String deliveryOutletsName) {
    this.deliveryOutletsName = deliveryOutletsName;
  }

  private String deliveryOutletsName;

  public String getBoardStrategyName() {
    return boardStrategyName;
  }

  public void setBoardStrategyName(String boardStrategyName) {
    this.boardStrategyName = boardStrategyName;
  }

  public Date getBuildBoardDate() {
    return buildBoardDate;
  }

  public void setBuildBoardDate(Date buildBoardDate) {
    this.buildBoardDate = buildBoardDate;
  }

  public Integer getCreatorBy() {
    return creatorBy;
  }

  public void setCreatorBy(Integer creatorBy) {
    this.creatorBy = creatorBy;
  }

  public String getCdmName() {
    return cdmName;
  }

  public void setCdmName(String cdmName) {
    this.cdmName = cdmName;
  }

  public String getDname() {
    return dname;
  }

  public void setDname(String dname) {
    this.dname = dname;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }


  public String getPlateNo() {
    return plateNo;
  }

  public void setPlateNo(String plateNo) {
    this.plateNo = plateNo;
  }


  public String getOrderNumber() {
    return orderNumber;
  }

  public void setOrderNumber(String orderNumber) {
    this.orderNumber = orderNumber;
  }


  public Integer getScanNo() {
    return scanNo;
  }

  public void setScanNo(Integer scanNo) {
    this.scanNo = scanNo;
  }


  public Integer getBoardStrategy() {
    return boardStrategy;
  }

  public void setBoardStrategy(Integer boardStrategy) {
    this.boardStrategy = boardStrategy;
  }


  public Integer getDeliveryOutlets() {
    return deliveryOutlets;
  }

  public void setDeliveryOutlets(Integer deliveryOutlets) {
    this.deliveryOutlets = deliveryOutlets;
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


  public String getDestinationAirportCode() {
    return destinationAirportCode;
  }

  public void setDestinationAirportCode(String destinationAirportCode) {
    this.destinationAirportCode = destinationAirportCode;
  }


  public String getRestrictedWeightPerTicket() {
    return restrictedWeightPerTicket;
  }

  public void setRestrictedWeightPerTicket(String restrictedWeightPerTicket) {
    this.restrictedWeightPerTicket = restrictedWeightPerTicket;
  }


  public Integer getUpperPlateOutlets() {
    return upperPlateOutlets;
  }

  public void setUpperPlateOutlets(Integer upperPlateOutlets) {
    this.upperPlateOutlets = upperPlateOutlets;
  }

}
