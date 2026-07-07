package com.codewithbavly.animals;

public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println("Animal Sound");
    }

}
