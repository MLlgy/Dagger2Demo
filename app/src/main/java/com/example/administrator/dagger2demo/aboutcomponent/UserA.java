package com.example.administrator.dagger2demo.aboutcomponent;

/**
 * Author：liguoying
 * Data: 18-7-19 22:27
 */
public class UserA {
    private String name;
    private int age;

    public UserA(String name, int age) {
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
