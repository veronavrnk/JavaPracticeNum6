package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
public class TestClass1 {

    Student[] iDNumber;

    public void createArray() {
        Student stud1 = new Student("Vasya", 3.4F);
        Student stud2 = new Student("Anya", 2.4F);
        Student stud3 = new Student("Kekovich", 4.2F);
        Student stud4 = new Student("Petya", 3F);
        Student stud5 = new Student("Alex", 4.9F);
        iDNumber = new Student[] {stud1, stud2, stud3, stud4, stud5};
    }

    public void sortArray() {
        Arrays.sort(iDNumber, Comparator.comparingDouble(Student::getFinalScore));
    }

    public void printArray() {
        System.out.println(Arrays.toString(iDNumber));
    }

    public Student[] getiDNumber() {
        return iDNumber;
    }
}
