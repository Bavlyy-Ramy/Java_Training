package com.codewithbavly;

import java.time.Duration;

class A extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");

            try {
                Thread.sleep(Duration.ofMillis(10));
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

class B extends Thread{

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hello");
            try {
                Thread.sleep(Duration.ofMillis(10));
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}


public class Main {
    public static void main() {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        try {
            Thread.sleep(Duration.ofMillis(2));
        } catch (InterruptedException e) {throw new RuntimeException(e);}
        obj2.start();

    }
}
