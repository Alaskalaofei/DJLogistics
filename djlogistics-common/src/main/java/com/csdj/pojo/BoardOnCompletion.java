package com.csdj.pojo;


public class BoardOnCompletion {

  private Integer bid;
  private Integer uid;
  private Integer gid;
  private Integer deliveryOrderNo;
  private Integer copyType;
  private Integer associatedShift;

  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  public Integer getGid() {
    return gid;
  }

  public void setGid(Integer gid) {
    this.gid = gid;
  }

  public Integer getDeliveryOrderNo() {
    return deliveryOrderNo;
  }

  public void setDeliveryOrderNo(Integer deliveryOrderNo) {
    this.deliveryOrderNo = deliveryOrderNo;
  }

  public Integer getCopyType() {
    return copyType;
  }

  public void setCopyType(Integer copyType) {
    this.copyType = copyType;
  }

  public Integer getAssociatedShift() {
    return associatedShift;
  }

  public void setAssociatedShift(Integer associatedShift) {
    this.associatedShift = associatedShift;
  }
}
