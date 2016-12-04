package com.xpf.cateyesmovies.domain;

// 城市的Bean类
public class CityBean {
    public String name;
    public String pinyi;

    public CityBean() {
        super();
    }

    public CityBean(String name, String pinyi) {
        super();
        this.name = name;
        this.pinyi = pinyi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinyi() {
        return pinyi;
    }

    public void setPinyi(String pinyi) {
        this.pinyi = pinyi;
    }

    @Override
    public String toString() {
        return "CityBean{" +
                "name='" + name + '\'' +
                ", pinyi='" + pinyi + '\'' +
                '}';
    }
}
