package com.recruitment.pojo;

public class Dictionary {
    private Integer id;

    private Integer groupkey;

    private String groupvalue;

    private Integer itemkey;

    private String itemvalue;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGroupkey() {
        return groupkey;
    }

    public void setGroupkey(Integer groupkey) {
        this.groupkey = groupkey;
    }

    public String getGroupvalue() {
        return groupvalue;
    }

    public void setGroupvalue(String groupvalue) {
        this.groupvalue = groupvalue == null ? null : groupvalue.trim();
    }

    public Integer getItemkey() {
        return itemkey;
    }

    public void setItemkey(Integer itemkey) {
        this.itemkey = itemkey;
    }

    public String getItemvalue() {
        return itemvalue;
    }

    public void setItemvalue(String itemvalue) {
        this.itemvalue = itemvalue == null ? null : itemvalue.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}