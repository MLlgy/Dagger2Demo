package com.example.administrator.dagger2demo.aboutcomponent;

/**
 * Author：liguoying
 * Data: 18-7-19 22:29
 */
public class UserB {

    private String name;
    private int age;

    public UserB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
