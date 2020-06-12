package com.csdj.pojo;


import cn.afterturn.easypoi.excel.annotation.Excel;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Order {

  @Excel(name = "oid")
  private String oid;
  @Excel(name = "state")
  private Integer state;
  @Excel(name = "waybillNumber")
  private String waybillNumber;
  @Excel(name = "referenceNumber")
  private String referenceNumber;
  @Excel(name = "billingStatus")
  private Integer billingStatus;
  @Excel(name = "orderBagNo")
  private String orderBagNo;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Excel(name = "orderDate")
  private Date orderDate;
  @Excel(name = "mailingOutlets")
  private Integer mailingOutlets;
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  @Excel(name = "mailingDate")
  private Date mailingDate;
  @Excel(name = "customerId")
  private Integer customerId;
  @Excel(name = "packingType")
  private Integer packingType;
  @Excel(name = "goodsType")
  private Integer goodsType;
  @Excel(name = "chineseName")
  private String chineseName;
  @Excel(name = "customsDeclarationMethod")
  private Integer customsDeclarationMethod;
  @Excel(name = "deliveryOutlets")
  private Integer deliveryOutlets;
  @Excel(name = "orderDataSource")
  private Integer orderDataSource;
  @Excel(name = "creationTime")
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date creationTime;
  @Excel(name = "createdBy")
  private Integer createdBy;

  @Excel(name = "totalVotes")
  private Integer totalVotes;
  @Excel(name = "totalPieces")
  private Integer totalPieces;
  @Excel(name = "totalActualweight")
  private Integer totalActualweight;
  @Excel(name = "totalPackages")
  private Integer totalPackages;
  @Excel(name = "specifyTheRoute")
  private Integer specifyTheRoute;
  @Excel(name = "takeTheCargoRoute")
  private Integer takeTheCargoRoute;
  private Outlet outlet;
  private Customer customer;
  private Orderstate orderstate;
  private Packagingtype packagingtype;
  private GoodsType goodsTypes;
  private Customsdeclarationmethod customsdeclarationmethod;

  private Integer did;
  private float rchargeactualweight;
  private float rchargeweight;
  private float rchargeweights;
  private String receiveazipcode;
  private String receiptcity;
  private float rvaluedeclared;
  private String rpaymentmethod;
  private float rtothepayment;
  private String rtaxpayment;
  private float ragencyfund;
  private String receiptnote;
  private Integer sid;
  private Integer rnumberofcases;


  private Specificroute specificroute;
  private Destination destination;
  private Typeofgoods typeofgoods;

  private String specifyTheRouteName;
  private String takeTheCargoRouteName;
  private String packingTypeName;
  private float totalActualWeight;
  private String goodsTypeName;
  private String cname;
  private String pno;
  private String mailingOutletsName;
  private String bno;
  private  String  reasonForCancellation;

  public String getOid() {
    return oid;
  }

  public void setOid(String oid) {
    this.oid = oid;
  }

  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public String getWaybillNumber() {
    return waybillNumber;
  }

  public void setWaybillNumber(String waybillNumber) {
    this.waybillNumber = waybillNumber;
  }

  public String getReferenceNumber() {
    return referenceNumber;
  }

  public void setReferenceNumber(String referenceNumber) {
    this.referenceNumber = referenceNumber;
  }

  public Integer getBillingStatus() {
    return billingStatus;
  }

  public void setBillingStatus(Integer billingStatus) {
    this.billingStatus = billingStatus;
  }

  public String getOrderBagNo() {
    return orderBagNo;
  }

  public void setOrderBagNo(String orderBagNo) {
    this.orderBagNo = orderBagNo;
  }

  public Date getOrderDate() {
    return orderDate;
  }

  public void setOrderDate(Date orderDate) {
    this.orderDate = orderDate;
  }

  public Integer getMailingOutlets() {
    return mailingOutlets;
  }

  public void setMailingOutlets(Integer mailingOutlets) {
    this.mailingOutlets = mailingOutlets;
  }

  public Date getMailingDate() {
    return mailingDate;
  }

  public void setMailingDate(Date mailingDate) {
    this.mailingDate = mailingDate;
  }

  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }

  public Integer getPackingType() {
    return packingType;
  }

  public void setPackingType(Integer packingType) {
    this.packingType = packingType;
  }

  public Integer getGoodsType() {
    return goodsType;
  }

  public void setGoodsType(Integer goodsType) {
    this.goodsType = goodsType;
  }

  public String getChineseName() {
    return chineseName;
  }

  public void setChineseName(String chineseName) {
    this.chineseName = chineseName;
  }

  public Integer getCustomsDeclarationMethod() {
    return customsDeclarationMethod;
  }

  public void setCustomsDeclarationMethod(Integer customsDeclarationMethod) {
    this.customsDeclarationMethod = customsDeclarationMethod;
  }

  public Integer getDeliveryOutlets() {
    return deliveryOutlets;
  }

  public void setDeliveryOutlets(Integer deliveryOutlets) {
    this.deliveryOutlets = deliveryOutlets;
  }

  public Integer getOrderDataSource() {
    return orderDataSource;
  }

  public void setOrderDataSource(Integer orderDataSource) {
    this.orderDataSource = orderDataSource;
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

  public Integer getTotalActualweight() {
    return totalActualweight;
  }

  public void setTotalActualweight(Integer totalActualweight) {
    this.totalActualweight = totalActualweight;
  }

  public Integer getTotalPackages() {
    return totalPackages;
  }

  public void setTotalPackages(Integer totalPackages) {
    this.totalPackages = totalPackages;
  }

  public Integer getSpecifyTheRoute() {
    return specifyTheRoute;
  }

  public void setSpecifyTheRoute(Integer specifyTheRoute) {
    this.specifyTheRoute = specifyTheRoute;
  }

  public Integer getTakeTheCargoRoute() {
    return takeTheCargoRoute;
  }

  public void setTakeTheCargoRoute(Integer takeTheCargoRoute) {
    this.takeTheCargoRoute = takeTheCargoRoute;
  }

  public Outlet getOutlet() {
    return outlet;
  }

  public void setOutlet(Outlet outlet) {
    this.outlet = outlet;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Orderstate getOrderstate() {
    return orderstate;
  }

  public void setOrderstate(Orderstate orderstate) {
    this.orderstate = orderstate;
  }

  public Packagingtype getPackagingtype() {
    return packagingtype;
  }

  public void setPackagingtype(Packagingtype packagingtype) {
    this.packagingtype = packagingtype;
  }

  public GoodsType getGoodsTypes() {
    return goodsTypes;
  }

  public void setGoodsTypes(GoodsType goodsTypes) {
    this.goodsTypes = goodsTypes;
  }

  public Customsdeclarationmethod getCustomsdeclarationmethod() {
    return customsdeclarationmethod;
  }

  public void setCustomsdeclarationmethod(Customsdeclarationmethod customsdeclarationmethod) {
    this.customsdeclarationmethod = customsdeclarationmethod;
  }

  public Integer getDid() {
    return did;
  }

  public void setDid(Integer did) {
    this.did = did;
  }

  public float getRchargeactualweight() {
    return rchargeactualweight;
  }

  public void setRchargeactualweight(float rchargeactualweight) {
    this.rchargeactualweight = rchargeactualweight;
  }

  public float getRchargeweight() {
    return rchargeweight;
  }

  public void setRchargeweight(float rchargeweight) {
    this.rchargeweight = rchargeweight;
  }

  public float getRchargeweights() {
    return rchargeweights;
  }

  public void setRchargeweights(float rchargeweights) {
    this.rchargeweights = rchargeweights;
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

  public float getRvaluedeclared() {
    return rvaluedeclared;
  }

  public void setRvaluedeclared(float rvaluedeclared) {
    this.rvaluedeclared = rvaluedeclared;
  }

  public String getRpaymentmethod() {
    return rpaymentmethod;
  }

  public void setRpaymentmethod(String rpaymentmethod) {
    this.rpaymentmethod = rpaymentmethod;
  }

  public float getRtothepayment() {
    return rtothepayment;
  }

  public void setRtothepayment(float rtothepayment) {
    this.rtothepayment = rtothepayment;
  }

  public String getRtaxpayment() {
    return rtaxpayment;
  }

  public void setRtaxpayment(String rtaxpayment) {
    this.rtaxpayment = rtaxpayment;
  }

  public float getRagencyfund() {
    return ragencyfund;
  }

  public void setRagencyfund(float ragencyfund) {
    this.ragencyfund = ragencyfund;
  }

  public String getReceiptnote() {
    return receiptnote;
  }

  public void setReceiptnote(String receiptnote) {
    this.receiptnote = receiptnote;
  }

  public Integer getSid() {
    return sid;
  }

  public void setSid(Integer sid) {
    this.sid = sid;
  }

  public Integer getRnumberofcases() {
    return rnumberofcases;
  }

  public void setRnumberofcases(Integer rnumberofcases) {
    this.rnumberofcases = rnumberofcases;
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

  public String getSpecifyTheRouteName() {
    return specifyTheRouteName;
  }

  public void setSpecifyTheRouteName(String specifyTheRouteName) {
    this.specifyTheRouteName = specifyTheRouteName;
  }

  public String getTakeTheCargoRouteName() {
    return takeTheCargoRouteName;
  }

  public void setTakeTheCargoRouteName(String takeTheCargoRouteName) {
    this.takeTheCargoRouteName = takeTheCargoRouteName;
  }

  public String getPackingTypeName() {
    return packingTypeName;
  }

  public void setPackingTypeName(String packingTypeName) {
    this.packingTypeName = packingTypeName;
  }

  public float getTotalActualWeight() {
    return totalActualWeight;
  }

  public void setTotalActualWeight(float totalActualWeight) {
    this.totalActualWeight = totalActualWeight;
  }

  public String getGoodsTypeName() {
    return goodsTypeName;
  }

  public void setGoodsTypeName(String goodsTypeName) {
    this.goodsTypeName = goodsTypeName;
  }

  public String getCname() {
    return cname;
  }

  public void setCname(String cname) {
    this.cname = cname;
  }

  public String getPno() {
    return pno;
  }

  public void setPno(String pno) {
    this.pno = pno;
  }

  public String getMailingOutletsName() {
    return mailingOutletsName;
  }

  public void setMailingOutletsName(String mailingOutletsName) {
    this.mailingOutletsName = mailingOutletsName;
  }

  public String getBno() {
    return bno;
  }

  public void setBno(String bno) {
    this.bno = bno;
  }

  public String getReasonForCancellation() {
    return reasonForCancellation;
  }

  public void setReasonForCancellation(String reasonForCancellation) {
    this.reasonForCancellation = reasonForCancellation;
  }
}
