package com.csdj.pojo;

import java.util.Date;

public class Transshipment {

  private Integer tid;
  private String transhipmentNo;
  private Date transshipmentDate;
  private Integer totalVotes;
  private Integer totalPieces;
  private double totalActualWeight;
  private Integer dispatchOutlets;
  private Integer reachPieceOutlets;
  private Integer transitStatusId;
  private Integer dispatchError;
  private Integer totalVotesArrived;
  private Integer totalPiecesArrived;
  private Integer totalVotesNotArrived;
  private Integer lessThanTotalPieces;
  private Integer arrivalException;
  private Date sendOutDate;
  private Integer sender;
  private Date creationTime;
  private Integer createdBy;
  private String remarks;
  private Integer deliveredGoods;

  private Outlet deliveryoutlets;//发件网点
  private Outlet arrivaloutlet;//到件网点

  private TransitStatus transitStatus;//状态

  public Outlet getDeliveryoutlets() {
    return deliveryoutlets;
  }

  public void setDeliveryoutlets(Outlet deliveryoutlets) {
    this.deliveryoutlets = deliveryoutlets;
  }

  public Outlet getArrivaloutlet() {
    return arrivaloutlet;
  }

  public void setArrivaloutlet(Outlet arrivaloutlet) {
    this.arrivaloutlet = arrivaloutlet;
  }

  public TransitStatus getTransitStatus() {
    return transitStatus;
  }

  public void setTransitStatus(TransitStatus transitStatus) {
    this.transitStatus = transitStatus;
  }

  public Integer getTid() {
    return tid;
  }

  public void setTid(Integer tid) {
    this.tid = tid;
  }


  public String getTranshipmentNo() {
    return transhipmentNo;
  }

  public void setTranshipmentNo(String transhipmentNo) {
    this.transhipmentNo = transhipmentNo;
  }


  public Date getTransshipmentDate() {
    return transshipmentDate;
  }

  public void setTransshipmentDate(Date transshipmentDate) {
    this.transshipmentDate = transshipmentDate;
  }


  public Integer getTotalVotes() {
    return totalVotes;
  }

  public void setTotalVotes(Integer totalVotes) {
    this.totalVotes = totalVotes;
  }


  public Integer getTotalPieces() {
    return totalPieces;
  }

  public void setTotalPieces(Integer totalPieces) {
    this.totalPieces = totalPieces;
  }


  public double getTotalActualWeight() {
    return totalActualWeight;
  }

  public void setTotalActualWeight(double totalActualWeight) {
    this.totalActualWeight = totalActualWeight;
  }


  public Integer getDispatchOutlets() {
    return dispatchOutlets;
  }

  public void setDispatchOutlets(Integer dispatchOutlets) {
    this.dispatchOutlets = dispatchOutlets;
  }


  public Integer getReachPieceOutlets() {
    return reachPieceOutlets;
  }

  public void setReachPieceOutlets(Integer reachPieceOutlets) {
    this.reachPieceOutlets = reachPieceOutlets;
  }


  public Integer getTransitStatusId() {
    return transitStatusId;
  }

  public void setTransitStatusId(Integer transitStatusId) {
    this.transitStatusId = transitStatusId;
  }


  public Integer getDispatchError() {
    return dispatchError;
  }

  public void setDispatchError(Integer dispatchError) {
    this.dispatchError = dispatchError;
  }


  public Integer getTotalVotesArrived() {
    return totalVotesArrived;
  }

  public void setTotalVotesArrived(Integer totalVotesArrived) {
    this.totalVotesArrived = totalVotesArrived;
  }


  public Integer getTotalPiecesArrived() {
    return totalPiecesArrived;
  }

  public void setTotalPiecesArrived(Integer totalPiecesArrived) {
    this.totalPiecesArrived = totalPiecesArrived;
  }


  public Integer getTotalVotesNotArrived() {
    return totalVotesNotArrived;
  }

  public void setTotalVotesNotArrived(Integer totalVotesNotArrived) {
    this.totalVotesNotArrived = totalVotesNotArrived;
  }


  public Integer getLessThanTotalPieces() {
    return lessThanTotalPieces;
  }

  public void setLessThanTotalPieces(Integer lessThanTotalPieces) {
    this.lessThanTotalPieces = lessThanTotalPieces;
  }


  public Integer getArrivalException() {
    return arrivalException;
  }

  public void setArrivalException(Integer arrivalException) {
    this.arrivalException = arrivalException;
  }


  public Date getSendOutDate() {
    return sendOutDate;
  }

  public void setSendOutDate(Date sendOutDate) {
    this.sendOutDate = sendOutDate;
  }


  public Integer getSender() {
    return sender;
  }

  public void setSender(Integer sender) {
    this.sender = sender;
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


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }


  public Integer getDeliveredGoods() {
    return deliveredGoods;
  }

  public void setDeliveredGoods(Integer deliveredGoods) {
    this.deliveredGoods = deliveredGoods;
  }

}
