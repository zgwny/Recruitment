package com.recruitment.pojo;

public class Skill {
    private Integer id;

    private String skillid;

    private String listenskill;

    private String writeskill;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSkillid() {
        return skillid;
    }

    public void setSkillid(String skillid) {
        this.skillid = skillid == null ? null : skillid.trim();
    }

    public String getListenskill() {
        return listenskill;
    }

    public void setListenskill(String listenskill) {
        this.listenskill = listenskill == null ? null : listenskill.trim();
    }

    public String getWriteskill() {
        return writeskill;
    }

    public void setWriteskill(String writeskill) {
        this.writeskill = writeskill == null ? null : writeskill.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
}