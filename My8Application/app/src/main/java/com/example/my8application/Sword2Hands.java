package com.example.my8application;

import java.util.Random;

public class Sword2Hands extends PlayerItem implements IDamage{
    private int dps;
    public Sword2Hands(String name, int mass,int dps) {
        super(name, mass);
        this.dps = dps;
    }

    @Override
    public String makeDps(Player player) {
        int dd = RandomDps();
        player.setHp(-dd);
        return "Zadano obrażenia mieczem: "+name+" "+dd+"\n"+player;
    }
    private int RandomDps(){
        Random rnd = new Random();
        return rnd.nextInt(dps);
    }
}
