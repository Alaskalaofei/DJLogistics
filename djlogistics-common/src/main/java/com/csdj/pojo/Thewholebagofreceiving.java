package com.csdj.pojo;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Thewholebagofreceiving {

  private String tcode;
  private Integer bid;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date dateoftakingthedelivery;
  private Integer treceivingsite;
  private Integer cid;
  private Integer sid;
  private Integer tid2;
  private Integer thetotalnumberofbags;
  private Integer total;
  private Integer predictionofheavy;
  private Integer thegoodsweight;
  private String totakepart;
  private String tremark;
  private Integer tcreator;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date creationtime;
  private Integer modifier;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date tmodificationtime;

  private Bagofstate bagofstate;

  public Outlet getOutlet() {
    return outlet;
  }

  public void setOutlet(Outlet outlet) {
    this.outlet = outlet;
  }

  private Customer customer;
  private Specificroute specificroute;
  private Typeofgoods typeofgoods;
  private Outlet outlet;

  public Bagofstate getBagofstate() {
    return bagofstate;
  }

  public void setBagofstate(Bagofstate bagofstate) {
    this.bagofstate = bagofstate;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Specificroute getSpecificroute() {
    return specificroute;
  }

  public void setSpecificroute(Specificroute specificroute) {
    this.specificroute = specificroute;
  }

  public Typeofgoods getTypeofgoods() {
    return typeofgoods;
  }

  public void setTypeofgoods(Typeofgoods typeofgoods) {
    this.typeofgoods = typeofgoods;
  }

  public String getTcode() {
    return tcode;
  }

  public void setTcode(String tcode) {
    this.tcode = tcode;
  }

  public Integer getTreceivingsite() {
    return treceivingsite;
  }

  public void setTreceivingsite(Integer treceivingsite) {
    this.treceivingsite = treceivingsite;
  }

  public Integer getBid() {
    return bid;
  }

  public void setBid(Integer bid) {
    this.bid = bid;
  }


  public Date getDateoftakingthedelivery() {
    return dateoftakingthedelivery;
  }

  public void setDateoftakingthedelivery(Date dateoftakingthedelivery) {
    this.dateoftakingthedelivery = dateoftakingthedelivery;
  }





  public Integer getCid() {
    return cid;
  }

  public void setCid(Integer cid) {
    this.cid = cid;
  }


  public Integer getSid() {
    return sid;
  }

  public void setSid(Integer sid) {
    this.sid = sid;
  }


  public Integer getTid2() {
    return tid2;
  }

  public void setTid2(Integer tid2) {
    this.tid2 = tid2;
  }


  public Integer getThetotalnumberofbags() {
    return thetotalnumberofbags;
  }

  public void setThetotalnumberofbags(Integer thetotalnumberofbags) {
    this.thetotalnumberofbags = thetotalnumberofbags;
  }


  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }


  public Integer getPredictionofheavy() {
    return predictionofheavy;
  }

  public void setPredictionofheavy(Integer predictionofheavy) {
    this.predictionofheavy = predictionofheavy;
  }


  public Integer getThegoodsweight() {
    return thegoodsweight;
  }

  public void setThegoodsweight(Integer thegoodsweight) {
    this.thegoodsweight = thegoodsweight;
  }


  public String getTotakepart() {
    return totakepart;
  }

  public void setTotakepart(String totakepart) {
    this.totakepart = totakepart;
  }


  public String getTremark() {
    return tremark;
  }

  public void setTremark(String tremark) {
    this.tremark = tremark;
  }


  public Integer getTcreator() {
    return tcreator;
  }

  public void setTcreator(Integer tcreator) {
    this.tcreator = tcreator;
  }


  public Date getCreationtime() {
    return creationtime;
  }

  public void setCreationtime(Date creationtime) {
    this.creationtime = creationtime;
  }


  public Integer getModifier() {
    return modifier;
  }

  public void setModifier(Integer modifier) {
    this.modifier = modifier;
  }


  public Date getTmodificationtime() {
    return tmodificationtime;
  }

  public void setTmodificationtime(Date tmodificationtime) {
    this.tmodificationtime = tmodificationtime;
  }

}
