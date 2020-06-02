package com.csdj.pojo;


public class Reply {

  private Integer rid;
  private String handlingOpinions;
  private String enclosure;
  private Integer notifiedBy;
  private Integer processingStatus;


  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }


  public String getHandlingOpinions() {
    return handlingOpinions;
  }

  public void setHandlingOpinions(String handlingOpinions) {
    this.handlingOpinions = handlingOpinions;
  }


  public String getEnclosure() {
    return enclosure;
  }

  public void setEnclosure(String enclosure) {
    this.enclosure = enclosure;
  }


  public Integer getNotifiedBy() {
    return notifiedBy;
  }

  public void setNotifiedBy(Integer notifiedBy) {
    this.notifiedBy = notifiedBy;
  }


  public Integer getProcessingStatus() {
    return processingStatus;
  }

  public void setProcessingStatus(Integer processingStatus) {
    this.processingStatus = processingStatus;
  }

}
