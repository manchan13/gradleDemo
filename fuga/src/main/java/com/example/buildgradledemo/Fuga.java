package com.example.buildgradledemo;

public class Fuga {
    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println(sample.getMessage());
    }

    public String getMessage() {
        return "Sample!";
    }
}
