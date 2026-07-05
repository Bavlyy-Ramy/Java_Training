package com.codewithbavly;

import java.time.Duration;

class A implements Runnable {

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("hi");

            try {
                Thread.sleep(Duration.ofMillis(10));
            } catch (InterruptedException e) {throw new RuntimeException(e);}
        }
    }
}

class B implements Runnable {

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
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

    }
}
