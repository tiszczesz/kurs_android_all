package com.example.my8application;

import java.util.Random;

public class Sword1Hands extends PlayerItem implements IDamage {
    private int dps;
    private int repeats;
    public Sword1Hands(String name, int mass, int dps,int repeats) {
        super(name, mass);
        this.repeats = repeats;
        this.dps = dps;
    }

    @Override
    public String makeDps(Player player) {
        int totalDps = 0;
        for (int i=0;i<repeats;i++){
            totalDps+=RandomDps();
        }
        player.setHp(-totalDps);
        return "Zadano obrażenia  całkowite: "+totalDps+"mieczem: "+name+"\n"+player;
    }
    private int RandomDps(){
        Random rnd = new Random();
        return rnd.nextInt(dps);
    }
}
