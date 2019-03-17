package com.recruitment.pojo;

public class Want {
    private String wantid;

    private String wantjob;

    private String wantindustry;

    private String wantsalary;

    private String wantcity;

    private String nature;

    private String workstatus;

    public String getWantid() {
        return wantid;
    }

    public void setWantid(String wantid) {
        this.wantid = wantid == null ? null : wantid.trim();
    }

    public String getWantjob() {
        return wantjob;
    }

    public void setWantjob(String wantjob) {
        this.wantjob = wantjob == null ? null : wantjob.trim();
    }

    public String getWantindustry() {
        return wantindustry;
    }

    public void setWantindustry(String wantindustry) {
        this.wantindustry = wantindustry == null ? null : wantindustry.trim();
    }

    public String getWantsalary() {
        return wantsalary;
    }

    public void setWantsalary(String wantsalary) {
        this.wantsalary = wantsalary == null ? null : wantsalary.trim();
    }

    public String getWantcity() {
        return wantcity;
    }

    public void setWantcity(String wantcity) {
        this.wantcity = wantcity == null ? null : wantcity.trim();
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature == null ? null : nature.trim();
    }

    public String getWorkstatus() {
        return workstatus;
    }

    public void setWorkstatus(String workstatus) {
        this.workstatus = workstatus == null ? null : workstatus.trim();
    }
}