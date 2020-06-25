package com.example.my8application;

public class Key extends PlayerItem {
    private double  coefficients;
    public Key(String name, int mass,double coefficients) {
        super(name, mass);
        this.coefficients = coefficients;
    }
}
