package com.codewithbavly;



import com.codewithbavly.Service.StudentComparator;
import com.codewithbavly.model.InvalidGradeException;
import com.codewithbavly.model.Student;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x= 5, y=0;
        try {
        int z = x/ y;
        }catch(Exception e){
            System.out.println(e.getMessage());

        }


        List<Student> students = new ArrayList<>();
        try {
            students.add(new Student("Ahmed", 90));
            students.add(new Student("John", 70));
            students.add(new Student("Ali", 95));
            students.add(new Student("Mona", 85));
            students.add(new Student("Sara", 40));
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage());
        }

        // Comparable
        Collections.sort(students);
        System.out.println("Sorted by Marks");
        students.forEach(Student::print);

        // Comparator
        students.sort(new StudentComparator());
        System.out.println("\nSorted by Name");
        students.forEach(Student::print);


        Set<String> names = new HashSet<>();
        names.add("Bavly");
        names.add("Bavly");
        names.add("John");
        names.forEach(System.out::println);


        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Bavly");
        map.put(2,"John");
        map.put(3,"Ali");

        map.forEach((id,name)-> System.out.println(id+" -> "+name));


        System.out.println("\n Students >=80");
        students.stream()
                .filter(s->s.getMark()>=80)
                .forEach(Student::print);

        System.out.println("\n Only Names");
        students.stream()
                .map(Student::getName)
                .forEach(System.out::println);

        System.out.println("\n Sorted Desc");
        students.stream()
                .sorted((a,b)->b.getMark()-a.getMark())
                .forEach(Student::print);


        int total = students.stream()
                .map(Student::getMark)
                .reduce(0, Integer::sum);
        System.out.println("\nTotal Marks = "+total);


        // Lambda
        students.forEach(student -> System.out.println(student.getName()));

        try{
            System.out.print("\nEnter student mark: ");
            int mark = scanner.nextInt();
            Student s = new Student("User",mark);
            s.print();
        }catch(InputMismatchException e){
            System.out.println("Please enter numbers only.");
        }catch(InvalidGradeException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    record Person(String name,int age){}

}

