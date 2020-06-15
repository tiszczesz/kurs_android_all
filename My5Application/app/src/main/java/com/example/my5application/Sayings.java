package com.example.my5application;

import java.util.Random;

public class Sayings {
    private String[] listofSayings;

    public Sayings(String[] listofSayings) {
        this.listofSayings = listofSayings;
    }
    public String getRandom(){
        Random random = new Random();
        return listofSayings[random.nextInt(listofSayings.length)];
    }
}
