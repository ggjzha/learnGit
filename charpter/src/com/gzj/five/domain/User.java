package com.gzj.five.domain;

import com.gzj.annotation.MyAnnotation;
@MyAnnotation(className = "com.gzj.five.domain")
public class User {
    private String name;
    private String gender;
    private Integer age;

    public User(){
    }

    public User(String name, String gender, Integer age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    private User(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
    public static void show(int a){
        System.out.println(a);
    }
}
