package com.codewithbavly.model;

import com.codewithbavly.interfaces.Printable;

public class Student implements Comparable<Student>, Printable {

    private String name;
    private int mark;
    private Grade grade;

    public Student(String name, int mark) throws InvalidGradeException {

        if (mark < 0 || mark > 100)
            throw new InvalidGradeException("Grade must be between 0 and 100");

        this.name = name;
        this.mark = mark;

        if (mark >= 90)
            grade = Grade.A;
        else if (mark >= 80)
            grade = Grade.B;
        else if (mark >= 70)
            grade = Grade.C;
        else if (mark >= 60)
            grade = Grade.D;
        else
            grade = Grade.F;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    public Grade getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.mark, other.mark);
    }

    @Override
    public void print() {
        System.out.println(name + " " + mark + " " + grade);
    }

}
