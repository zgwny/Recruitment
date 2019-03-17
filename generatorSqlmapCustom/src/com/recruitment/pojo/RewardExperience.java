package com.recruitment.pojo;

public class RewardExperience {
    private Integer id;

    private String rewardexperienceid;

    private String name;

    private String gettime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRewardexperienceid() {
        return rewardexperienceid;
    }

    public void setRewardexperienceid(String rewardexperienceid) {
        this.rewardexperienceid = rewardexperienceid == null ? null : rewardexperienceid.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGettime() {
        return gettime;
    }

    public void setGettime(String gettime) {
        this.gettime = gettime == null ? null : gettime.trim();
    }
}