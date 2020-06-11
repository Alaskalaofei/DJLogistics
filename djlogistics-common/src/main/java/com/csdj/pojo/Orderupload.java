package com.csdj.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Orderupload {

  private Integer ouid;
  private String name;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone="GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date date;
  private Integer state;
  private Integer row;
  private Integer error;
  private Integer customerid;

  public Integer getOuid() {
    return ouid;
  }

  public void setOuid(Integer ouid) {
    this.ouid = ouid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public Integer getError() {
    return error;
  }

  public void setError(Integer error) {
    this.error = error;
  }

  public Integer getCustomerid() {
    return customerid;
  }

  public void setCustomerid(Integer customerid) {
    this.customerid = customerid;
  }
}
