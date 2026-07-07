package com.codewithbavly.models;

public class Student {

    private String name;
    private int age;

    private static int count = 0;

    public Student() {
        count++;
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

        if (age > 0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public static int getCount() {
        return count;
    }
}
