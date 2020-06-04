package com.csdj.pojo;

import java.util.Date;

public class Transshipment {

  private Integer tid;
  private String transhipmentNo;
  private Date transshipmentDate;
  private Integer dispatchOutlets;
  private Integer reachPieceOutlets;
  private Integer transitStatusId;
  private Integer dispatchError;
  private Integer totalVotesArrived;
  private Integer totalPiecesArrived;
  private Integer totalVotesNot_Arrived;
  private Integer lessThanTotal_Pieces;
  private Integer arrivalException;
  private Date sendOutDate;
  private Integer sender;
  private Date creationTime;
  private Integer createdBy;
  private String remarks;

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

  public Integer getTotalVotesNot_Arrived() {
    return totalVotesNot_Arrived;
  }

  public void setTotalVotesNot_Arrived(Integer totalVotesNot_Arrived) {
    this.totalVotesNot_Arrived = totalVotesNot_Arrived;
  }

  public Integer getLessThanTotal_Pieces() {
    return lessThanTotal_Pieces;
  }

  public void setLessThanTotal_Pieces(Integer lessThanTotal_Pieces) {
    this.lessThanTotal_Pieces = lessThanTotal_Pieces;
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
}
