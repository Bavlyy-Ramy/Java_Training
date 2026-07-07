package com.codewithbavly;

import com.codewithbavly.animals.*;
import com.codewithbavly.interfaces.*;
import com.codewithbavly.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("toyota", "corolla", 2022);
        Car car2 = new Car("bmw");
        car1.display();
        car2.display();

        Student s = new Student();
        s.setName("Bavy");
        s.setAge(21);
        System.out.println(s.getName());
        System.out.println(s.getAge());

        //Static
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println("Students Created = " + Student.getCount());

        //Inheritance
        Animal a = new Animal("Animal");
        Animal d = new Dog("DOGG");
        Animal c = new Cat("Cat");

        a.makeSound();
        d.makeSound();
        c.makeSound();

        Animal[] animals = {
                new Dog("rex"),
                new Cat("max"),
                new Dog("rocky"),
                new Cat("m4m4")
        };

        for (Animal animal : animals) {
            animal.makeSound();
        }

        // Interfaces
        Flyable[] flyers = { new Bird(), new Airplane() };

        for (Flyable f : flyers) { f.fly();}

        List<String> names = Arrays.asList("Bavly", "Ali", "John");

        names.forEach(name -> System.out.println(name));



    }
}
