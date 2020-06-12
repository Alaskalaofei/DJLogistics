package com.csdj.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Bagging {

  private Integer bid;
  private String plateNo;
  private String customsClearanceBagNo;
  private Integer baggingStrategy;
  private Integer deliveryOutlets;
  private Integer destination;
  private Integer customsDeclarationMethod;
  private String destinationAirportCode;
  private String restrictedWeightPerTicket;
  private String restrictedWeightPerTicket1;
  private String restrictedWeightPerTicket2;
  private String limitedValueOfSingleTicket;
  private String limitedValueOfSingleTicket1;
  private String limitedValueOfSingleTicket2;
  private String parcelExchangeOffice;
  private String remarks;
  private Integer goodsType;
  private String deliveryOutletsName;
  private String baggingStrategyName;
  private String destinationName;
  private String gname;
  private String cdmName;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date creatorDate;
  private Integer creatorBy;
  private String sname;
  private Integer saggingState;
  private String takeTheCargoRouteName;
  private Integer takeTheCargoRoute;
  private String countryCode;
  private String simplifiedName;
  private String englishName;
  private Integer dataSource;


  public Integer getDataSource() {
    return dataSource;
  }

  public void setDataSource(Integer dataSource) {
    this.dataSource = dataSource;
  }

  public String getLimitedValueOfSingleTicket() {
    return limitedValueOfSingleTicket;
  }

  public void setLimitedValueOfSingleTicket(String limitedValueOfSingleTicket) {
    this.limitedValueOfSingleTicket = limitedValueOfSingleTicket;
  }

  public String getLimitedValueOfSingleTicket1() {
    return limitedValueOfSingleTicket1;
  }

  public void setLimitedValueOfSingleTicket1(String limitedValueOfSingleTicket1) {
    this.limitedValueOfSingleTicket1 = limitedValueOfSingleTicket1;
  }

  public String getRestrictedWeightPerTicket1() {
    return restrictedWeightPerTicket1;
  }

  public void setRestrictedWeightPerTicket1(String restrictedWeightPerTicket1) {
    this.restrictedWeightPerTicket1 = restrictedWeightPerTicket1;
  }

  public String getRestrictedWeightPerTicket2() {
    return restrictedWeightPerTicket2;
  }

  public void setRestrictedWeightPerTicket2(String restrictedWeightPerTicket2) {
    this.restrictedWeightPerTicket2 = restrictedWeightPerTicket2;
  }

  public String getLimitedValueOfSingleTicket2() {
    return limitedValueOfSingleTicket2;
  }

  public void setLimitedValueOfSingleTicket2(String limitedValueOfSingleTicket2) {
    this.limitedValueOfSingleTicket2 = limitedValueOfSingleTicket2;
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

  public Integer getSaggingState() {
    return saggingState;
  }

  public void setSaggingState(Integer saggingState) {
    this.saggingState = saggingState;
  }

  public String getTakeTheCargoRouteName() {
    return takeTheCargoRouteName;
  }

  public void setTakeTheCargoRouteName(String takeTheCargoRouteName) {
    this.takeTheCargoRouteName = takeTheCargoRouteName;
  }

  public Integer getTakeTheCargoRoute() {
    return takeTheCargoRoute;
  }

  public void setTakeTheCargoRoute(Integer takeTheCargoRoute) {
    this.takeTheCargoRoute = takeTheCargoRoute;
  }

  public Date getCreatorDate() {
    return creatorDate;
  }

  public void setCreatorDate(Date creatorDate) {
    this.creatorDate = creatorDate;
  }

  public Integer getCreatorBy() {
    return creatorBy;
  }

  public void setCreatorBy(Integer creatorBy) {
    this.creatorBy = creatorBy;
  }

  public String getSname() {
    return sname;
  }

  public void setSname(String sname) {
    this.sname = sname;
  }

  public String getGname() {
    return gname;
  }

  public void setGname(String gname) {
    this.gname = gname;
  }

  public String getCdmName() {
    return cdmName;
  }

  public void setCdmName(String cdmName) {
    this.cdmName = cdmName;
  }

  public Integer getGoodsType() {
    return goodsType;
  }

  public void setGoodsType(Integer goodsType) {
    this.goodsType = goodsType;
  }

  public String getDeliveryOutletsName() {
    return deliveryOutletsName;
  }

  public void setDeliveryOutletsName(String deliveryOutletsName) {
    this.deliveryOutletsName = deliveryOutletsName;
  }

  public String getBaggingStrategyName() {
    return baggingStrategyName;
  }

  public void setBaggingStrategyName(String baggingStrategyName) {
    this.baggingStrategyName = baggingStrategyName;
  }

  public String getDestinationName() {
    return destinationName;
  }

  public void setDestinationName(String destinationName) {
    this.destinationName = destinationName;
  }


  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }


  public String getPlateNo() {
    return plateNo;
  }

  public void setPlateNo(String plateNo) {
    this.plateNo = plateNo;
  }


  public String getCustomsClearanceBagNo() {
    return customsClearanceBagNo;
  }

  public void setCustomsClearanceBagNo(String customsClearanceBagNo) {
    this.customsClearanceBagNo = customsClearanceBagNo;
  }


  public Integer getBaggingStrategy() {
    return baggingStrategy;
  }

  public void setBaggingStrategy(Integer baggingStrategy) {
    this.baggingStrategy = baggingStrategy;
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



  public String getParcelExchangeOffice() {
    return parcelExchangeOffice;
  }

  public void setParcelExchangeOffice(String parcelExchangeOffice) {
    this.parcelExchangeOffice = parcelExchangeOffice;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

}
