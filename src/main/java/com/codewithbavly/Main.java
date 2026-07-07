package com.codewithbavly;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

class Person{
    public void eat(){
        System.out.println("Person is eating");
    }
}


public class Main {
    public static void main(String[] args) {

        int x = 5;
        System.out.println(x);
        System.out.println(++x);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if(x > num) System.out.println("x is greater than " + num);

        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        Person p1 = new Person();
        p1.eat();

        Person persons[] = new Person[3];
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();

        persons[1].eat();





    }
}
