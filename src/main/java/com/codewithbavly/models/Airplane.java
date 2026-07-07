package com.codewithbavly.models;

import com.codewithbavly.interfaces.Flyable;

public class Airplane implements Flyable {

    @Override
    public void fly() {
        System.out.println("Airplane is flying");
    }

}
