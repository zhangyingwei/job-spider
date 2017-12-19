package com.zhangyingwei.job.spider.job;

/**
 * @author: zhangyw
 * @date: 2017/12/18
 * @time: 下午8:50
 * @desc:
 */
public class JobItem {
    private String title;
    private String money;
    private String company;
    private String place;
    private String desc;
    private String nature;//性质
    private String experience; //经验
    private String degree; //学历
    private String type; // 职位类别

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "JobItem{" +
                "title='" + title + '\'' +
                ", money='" + money + '\'' +
                ", company='" + company + '\'' +
                ", place='" + place + '\'' +
                ", desc='" + desc + '\'' +
                ", nature='" + nature + '\'' +
                ", experience='" + experience + '\'' +
                ", degree='" + degree + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
