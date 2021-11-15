package com.company;

public class Student {

    private String name;
    private float finalScore;

    public Student(String name, float finalScore) {
        this.name = name;
        this.finalScore = finalScore;
    }

    public String getName() {
        return name;
    }

    public float getFinalScore() {
        return finalScore;
    }

    @Override
    public String toString() {
        return "Student " + name + " (" + finalScore + ")";
    }

}