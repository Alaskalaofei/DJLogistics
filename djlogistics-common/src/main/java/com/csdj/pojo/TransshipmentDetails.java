package com.csdj.pojo;

import java.util.Date;

public class TransshipmentDetails {

  private Integer tdid;
  private String transhipmentNo;
  private String waybillNumber;
  private Integer arrived;
  private Integer numberOfTicketsArrived;
  private Integer arrivalOfWaybill;
  private double reviewActual_Weight;
  private String recheckAbnormality;
  private Date warehousing_Time;
  private Date scan_time;
  public Date getScan_time() {
    return scan_time;
  }

  public void setScan_time(Date scan_time) {
    this.scan_time = scan_time;
  }

  /*运单*/
  private Order order;
/*客户*/
  private Customer customer;
/*指定路线*/
  private Specificroute specificRoute;
/*走货路线*/
  private Specificroute cargoRoute;
/*货物类型*/
  private Typeofgoods typeofgoods;
 /*目的地*/
  private Destination destination;


    /*报关方式*/
  private Customsdeclarationmethod customsdeclarationmethod;


  public Customsdeclarationmethod getCustomsdeclarationmethod() {
        return customsdeclarationmethod;
    }

    public void setCustomsdeclarationmethod(Customsdeclarationmethod customsdeclarationmethod) {
        this.customsdeclarationmethod = customsdeclarationmethod;
    }

  public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }

  public Order getOrder() {
    return order;
  }

  public void setOrder(Order order) {
    this.order = order;
  }
  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Specificroute getSpecificRoute() {
    return specificRoute;
  }

  public void setSpecificRoute(Specificroute specificRoute) {
    this.specificRoute = specificRoute;
  }

  public Specificroute getCargoRoute() {
    return cargoRoute;
  }

  public void setCargoRoute(Specificroute cargoRoute) {
    this.cargoRoute = cargoRoute;
  }

  public Typeofgoods getTypeofgoods() {
    return typeofgoods;
  }

  public void setTypeofgoods(Typeofgoods typeofgoods) {
    this.typeofgoods = typeofgoods;
  }

  public Integer getTdid() {
    return tdid;
  }

  public void setTdid(Integer tdid) {
    this.tdid = tdid;
  }

  public String getTranshipmentNo() {
    return transhipmentNo;
  }

  public void setTranshipmentNo(String transhipmentNo) {
    this.transhipmentNo = transhipmentNo;
  }

  public String getWaybillNumber() {
    return waybillNumber;
  }

  public void setWaybillNumber(String waybillNumber) {
    this.waybillNumber = waybillNumber;
  }

  public Integer getArrived() {
    return arrived;
  }

  public void setArrived(Integer arrived) {
    this.arrived = arrived;
  }

  public Integer getNumberOfTicketsArrived() {
    return numberOfTicketsArrived;
  }

  public void setNumberOfTicketsArrived(Integer numberOfTicketsArrived) {
    this.numberOfTicketsArrived = numberOfTicketsArrived;
  }

  public Integer getArrivalOfWaybill() {
    return arrivalOfWaybill;
  }

  public void setArrivalOfWaybill(Integer arrivalOfWaybill) {
    this.arrivalOfWaybill = arrivalOfWaybill;
  }

  public double getReviewActual_Weight() {
    return reviewActual_Weight;
  }

  public void setReviewActual_Weight(double reviewActual_Weight) {
    this.reviewActual_Weight = reviewActual_Weight;
  }

  public String getRecheckAbnormality() {
    return recheckAbnormality;
  }

  public void setRecheckAbnormality(String recheckAbnormality) {
    this.recheckAbnormality = recheckAbnormality;
  }

  public Date getWarehousing_Time() {
    return warehousing_Time;
  }

  public void setWarehousing_Time(Date warehousing_Time) {
    this.warehousing_Time = warehousing_Time;
  }
}
