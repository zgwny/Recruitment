package com.recruitment.pojo;

public class Resume {
    private String resumeid;

    private String wantid;

    private String porjectsid;

    private String enducationid;

    private String skillid;

    private String rewardid;

    private String workid;

    private String introduceid;

    public String getResumeid() {
        return resumeid;
    }

    public void setResumeid(String resumeid) {
        this.resumeid = resumeid == null ? null : resumeid.trim();
    }

    public String getWantid() {
        return wantid;
    }

    public void setWantid(String wantid) {
        this.wantid = wantid == null ? null : wantid.trim();
    }

    public String getPorjectsid() {
        return porjectsid;
    }

    public void setPorjectsid(String porjectsid) {
        this.porjectsid = porjectsid == null ? null : porjectsid.trim();
    }

    public String getEnducationid() {
        return enducationid;
    }

    public void setEnducationid(String enducationid) {
        this.enducationid = enducationid == null ? null : enducationid.trim();
    }

    public String getSkillid() {
        return skillid;
    }

    public void setSkillid(String skillid) {
        this.skillid = skillid == null ? null : skillid.trim();
    }

    public String getRewardid() {
        return rewardid;
    }

    public void setRewardid(String rewardid) {
        this.rewardid = rewardid == null ? null : rewardid.trim();
    }

    public String getWorkid() {
        return workid;
    }

    public void setWorkid(String workid) {
        this.workid = workid == null ? null : workid.trim();
    }

    public String getIntroduceid() {
        return introduceid;
    }

    public void setIntroduceid(String introduceid) {
        this.introduceid = introduceid == null ? null : introduceid.trim();
    }
}