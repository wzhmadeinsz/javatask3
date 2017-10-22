package com.jnshu.model;

public class Person {
    private int id;
    private String name;
    private int qq;
    private String date;
    private String graduate;
    private String wish;
    private String bother;
    private String hearfrom;

    public Person(String name, int qq, String date, String graduate, String wish, String bother, String hearfrom){
        this.name=name;
        this.qq=qq;this.date=date;this.graduate=graduate;this.wish=wish;
        this.bother=bother;this.hearfrom=hearfrom;
    }
    public Person(int id, String name, int qq, String date, String graduate, String wish, String bother, String hearfrom){
        this.id=id;this.name=name;
        this.qq=qq;this.date=date;this.graduate=graduate;this.wish=wish;
        this.bother=bother;this.hearfrom=hearfrom;
    }
    public Person(){this.id=0;this.name="undefined";this.qq=0;this.date="undefined";this.graduate="undefined";
        this.wish="undefined";this.bother="undefined";this.hearfrom="undefined";}
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getQq() { return qq; }
    public void setQq(int qq) { this.qq = qq; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getGraduate() { return graduate; }
    public void setGraduate(String graduate) { this.graduate = graduate; }
    public String getWish() { return wish; }
    public void setWish(String wish) { this.wish = wish; }
    public String getBother() { return bother; }
    public void setBother(String bother) { this.bother = bother; }
    public String getHearfrom() { return hearfrom; }
    public void setHearfrom(String hearfrom) { this.hearfrom = hearfrom; }
    @Override
    public String toString() {
        return "编号:"+id+", 名号:"+name+",qq:"+qq+", 出生时期:"+date+", 毕业于:"+graduate+", 理想:"+wish+", 兄弟:"+bother+", 与他结缘于:"+hearfrom;
    }
}
