package com.csdj.pojo;

import cn.afterturn.easypoi.excel.annotation.Excel;

public class blog {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Excel(name = "编号")
    private int id;
    @Excel(name = "内容")
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
