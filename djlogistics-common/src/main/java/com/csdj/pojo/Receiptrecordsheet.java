package com.csdj.pojo;


import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Receiptrecordsheet {

  private Integer rid;
  private String rtrackingnumber;
  private String referencenumber;
  private String rturnasinglenumber;
  private String rchinesename;
  private String renglishname;
  private Integer rnumberofcases;
  private double rchargeactualweight;
  private double rchargeweight;
  private double rchargeweights;
  private String rwaysofcustomsdeclaration;
  private String receiveazipcode;
  private String receiptcity;
  private double rvaluedeclared;
  private String rpaymentmethod;
  private double rtothepayment;
  private String rtaxpayment;
  private double ragencyfund;
  private String receiptnote;
  @JsonFormat(pattern = "yyyy-MM-dd", timezone = "GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date rdateofsending;
  private Integer cid;
  private Integer sid;
  private Integer did;
  private Integer pid;
  private Integer tid;
  private Integer uid;

  public Integer getUid() {
    return uid;
  }

  public void setUid(Integer uid) {
    this.uid = uid;
  }

  private Customer customer;
  private Specificroute specificroute;

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

  public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }

  public Typeofgoods getTypeofgoods() {
    return typeofgoods;
  }

  public void setTypeofgoods(Typeofgoods typeofgoods) {
    this.typeofgoods = typeofgoods;
  }

  public Packagingtype getPackagingtype() {
    return packagingtype;
  }

  public void setPackagingtype(Packagingtype packagingtype) {
    this.packagingtype = packagingtype;
  }

  private Destination destination;
  private Typeofgoods typeofgoods;
  private Packagingtype packagingtype;
  private Customsdeclarationmethod customsdeclarationmethod;

  public Customsdeclarationmethod getCustomsdeclarationmethod() {
    return customsdeclarationmethod;
  }

  public void setCustomsdeclarationmethod(Customsdeclarationmethod customsdeclarationmethod) {
    this.customsdeclarationmethod = customsdeclarationmethod;
  }

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }


  public String getRtrackingnumber() {
    return rtrackingnumber;
  }

  public void setRtrackingnumber(String rtrackingnumber) {
    this.rtrackingnumber = rtrackingnumber;
  }


  public String getReferencenumber() {
    return referencenumber;
  }

  public void setReferencenumber(String referencenumber) {
    this.referencenumber = referencenumber;
  }


  public String getRturnasinglenumber() {
    return rturnasinglenumber;
  }

  public void setRturnasinglenumber(String rturnasinglenumber) {
    this.rturnasinglenumber = rturnasinglenumber;
  }


  public String getRchinesename() {
    return rchinesename;
  }

  public void setRchinesename(String rchinesename) {
    this.rchinesename = rchinesename;
  }


  public String getRenglishname() {
    return renglishname;
  }

  public void setRenglishname(String renglishname) {
    this.renglishname = renglishname;
  }


  public Integer getRnumberofcases() {
    return rnumberofcases;
  }

  public void setRnumberofcases(Integer rnumberofcases) {
    this.rnumberofcases = rnumberofcases;
  }


  public double getRchargeactualweight() {
    return rchargeactualweight;
  }

  public void setRchargeactualweight(double rchargeactualweight) {
    this.rchargeactualweight = rchargeactualweight;
  }


  public double getRchargeweight() {
    return rchargeweight;
  }

  public void setRchargeweight(double rchargeweight) {
    this.rchargeweight = rchargeweight;
  }


  public double getRchargeweights() {
    return rchargeweights;
  }

  public void setRchargeweights(double rchargeweights) {
    this.rchargeweights = rchargeweights;
  }


  public String getRwaysofcustomsdeclaration() {
    return rwaysofcustomsdeclaration;
  }

  public void setRwaysofcustomsdeclaration(String rwaysofcustomsdeclaration) {
    this.rwaysofcustomsdeclaration = rwaysofcustomsdeclaration;
  }


  public String getReceiveazipcode() {
    return receiveazipcode;
  }

  public void setReceiveazipcode(String receiveazipcode) {
    this.receiveazipcode = receiveazipcode;
  }


  public String getReceiptcity() {
    return receiptcity;
  }

  public void setReceiptcity(String receiptcity) {
    this.receiptcity = receiptcity;
  }


  public double getRvaluedeclared() {
    return rvaluedeclared;
  }

  public void setRvaluedeclared(double rvaluedeclared) {
    this.rvaluedeclared = rvaluedeclared;
  }


  public String getRpaymentmethod() {
    return rpaymentmethod;
  }

  public void setRpaymentmethod(String rpaymentmethod) {
    this.rpaymentmethod = rpaymentmethod;
  }


  public double getRtothepayment() {
    return rtothepayment;
  }

  public void setRtothepayment(double rtothepayment) {
    this.rtothepayment = rtothepayment;
  }


  public String getRtaxpayment() {
    return rtaxpayment;
  }

  public void setRtaxpayment(String rtaxpayment) {
    this.rtaxpayment = rtaxpayment;
  }


  public double getRagencyfund() {
    return ragencyfund;
  }

  public void setRagencyfund(double ragencyfund) {
    this.ragencyfund = ragencyfund;
  }


  public String getReceiptnote() {
    return receiptnote;
  }

  public void setReceiptnote(String receiptnote) {
    this.receiptnote = receiptnote;
  }

  public Integer getCid() {
    return cid;
  }

  public Date getRdateofsending() {
    return rdateofsending;
  }

  public void setRdateofsending(Date rdateofsending) {
    this.rdateofsending = rdateofsending;
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


  public Integer getDid() {
    return did;
  }

  public void setDid(Integer did) {
    this.did = did;
  }


  public Integer getPid() {
    return pid;
  }

  public void setPid(Integer pid) {
    this.pid = pid;
  }


  public Integer getTid() {
    return tid;
  }

  public void setTid(Integer tid) {
    this.tid = tid;
  }

}
