package com.example.kotlin_study.study.three;

import java.time.LocalDate;

public class JavaGetterSetterExample {
    public static void main(String[] args) {
        Student student = new Student();

        student.name = "스티브로져스";
        student.setBirthDate(LocalDate.of(1918, 7, 4));

        System.out.println(student.name);
        System.out.println(student.getBirthDate());

        System.out.println(student.getAge());

        student.changeGrade("A");
    }
}