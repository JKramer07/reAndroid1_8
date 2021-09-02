package com.geek.reandroid1_8;

public class User {

    private String name, surName;
    private int age, image;
    private String type;

    public User(String name, String surName, int age, int image, String type) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.image = image;
        this.type = type;
    }

    public User(String name, String surName, int age, String type) {
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
