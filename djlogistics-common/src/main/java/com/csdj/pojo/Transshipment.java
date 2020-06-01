package com.csdj.pojo;


public class Transshipment {

  private Integer tid;
  private Integer oid;
  private java.sql.Date transshipmentDate;
  private Integer dispatchOutlets;
  private Integer reachPieceOutlets;
  private Integer transitStatusId;
  private Integer dispatchError;
  private Integer votesArrived;
  private Integer numberOfPiecesArrived;
  private Integer votesNotYetArrived;
  private Integer piecesNotArrived;
  private Integer arrivalException;
  private java.sql.Date sendOutDate;
  private Integer sender;
  private java.sql.Date creationTime;
  private Integer createdBy;


  public Integer getTid() {
    return tid;
  }

  public void setTid(Integer tid) {
    this.tid = tid;
  }


  public Integer getOid() {
    return oid;
  }

  public void setOid(Integer oid) {
    this.oid = oid;
  }


  public java.sql.Date getTransshipmentDate() {
    return transshipmentDate;
  }

  public void setTransshipmentDate(java.sql.Date transshipmentDate) {
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


  public Integer getVotesArrived() {
    return votesArrived;
  }

  public void setVotesArrived(Integer votesArrived) {
    this.votesArrived = votesArrived;
  }


  public Integer getNumberOfPiecesArrived() {
    return numberOfPiecesArrived;
  }

  public void setNumberOfPiecesArrived(Integer numberOfPiecesArrived) {
    this.numberOfPiecesArrived = numberOfPiecesArrived;
  }


  public Integer getVotesNotYetArrived() {
    return votesNotYetArrived;
  }

  public void setVotesNotYetArrived(Integer votesNotYetArrived) {
    this.votesNotYetArrived = votesNotYetArrived;
  }


  public Integer getPiecesNotArrived() {
    return piecesNotArrived;
  }

  public void setPiecesNotArrived(Integer piecesNotArrived) {
    this.piecesNotArrived = piecesNotArrived;
  }


  public Integer getArrivalException() {
    return arrivalException;
  }

  public void setArrivalException(Integer arrivalException) {
    this.arrivalException = arrivalException;
  }


  public java.sql.Date getSendOutDate() {
    return sendOutDate;
  }

  public void setSendOutDate(java.sql.Date sendOutDate) {
    this.sendOutDate = sendOutDate;
  }


  public Integer getSender() {
    return sender;
  }

  public void setSender(Integer sender) {
    this.sender = sender;
  }


  public java.sql.Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(java.sql.Date creationTime) {
    this.creationTime = creationTime;
  }


  public Integer getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Integer createdBy) {
    this.createdBy = createdBy;
  }

}
