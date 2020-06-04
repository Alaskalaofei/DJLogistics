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
