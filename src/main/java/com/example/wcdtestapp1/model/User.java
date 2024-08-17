package com.example.wcdtestapp1.model;

public class User {
    private String name;
    private String mobile;
    private String country;

    public User(String name, String mobile, String country) {
        this.country = country;
        this.mobile = mobile;
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
