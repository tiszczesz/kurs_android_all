package com.example.my8application;

public class Mixture extends PlayerItem {
    private int healing;
    public Mixture(String name, int mass,int healing) {
        super(name, mass);
        this.healing = healing;
    }
}
