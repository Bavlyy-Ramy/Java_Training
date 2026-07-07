package com.codewithbavly.animals;

import com.codewithbavly.interfaces.Flyable;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

}