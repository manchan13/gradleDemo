package com.example.buildgradledemo;

public class Sample {
    public static void main(String[] args) {
        Sample sample = new Sample();
        System.out.println("aa" + sample.getMessage());
    }

    public String getMessage() {
        return "Sample!";
    }
}
