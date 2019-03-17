package com.recruitment.pojo;

public class Recruiter {
    private Integer recruiterid;

    private String recruitername;

    private String sex;

    private Integer companyid;

    private String positionn;

    private String image;

    public Integer getRecruiterid() {
        return recruiterid;
    }

    public void setRecruiterid(Integer recruiterid) {
        this.recruiterid = recruiterid;
    }

    public String getRecruitername() {
        return recruitername;
    }

    public void setRecruitername(String recruitername) {
        this.recruitername = recruitername == null ? null : recruitername.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getPositionn() {
        return positionn;
    }

    public void setPositionn(String positionn) {
        this.positionn = positionn == null ? null : positionn.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
}