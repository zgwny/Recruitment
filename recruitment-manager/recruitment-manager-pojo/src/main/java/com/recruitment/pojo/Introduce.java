package com.recruitment.pojo;

public class Introduce {
    private String introduceid;

    private String description;

    public String getIntroduceid() {
        return introduceid;
    }

    public void setIntroduceid(String introduceid) {
        this.introduceid = introduceid == null ? null : introduceid.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}