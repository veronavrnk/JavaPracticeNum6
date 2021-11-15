package com.company;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        TestClass1 testClass1 = new TestClass1();
        testClass1.createArray();
        testClass1.printArray();
        testClass1.sortArray();
        testClass1.printArray();
        System.out.println(Arrays.toString(testClass1.iDNumber));
        Arrays.sort(testClass1.iDNumber, new SortingStudentsByGPA());
        invertUsingFor(testClass1.iDNumber);
        System.out.println(Arrays.toString(testClass1.iDNumber));

        Student[] union = union(testClass1.iDNumber, testClass1.getiDNumber());
        System.out.println(Arrays.toString(union));
        Arrays.sort(union, new SortingStudentsByGPA());
        System.out.println(Arrays.toString(union));
    }
    static void invertUsingFor(Object[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            Object temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
    }
    static Student[] union(Student[] arr1, Student[] arr2) {
        Set<Student> set = new HashSet<>();
        set.addAll(Arrays.asList(arr1));
        set.addAll(Arrays.asList(arr2));
        return set.toArray(new Student[]{});
    }

}