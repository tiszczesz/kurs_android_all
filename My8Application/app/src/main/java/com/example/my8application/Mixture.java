package com.example.my8application;

import java.util.Random;

public class Mixture extends PlayerItem implements IHealing {
    private int healing;
    public Mixture(String name, int mass,int healing) {
        super(name, mass);
        this.healing = healing;
    }

    @Override
    public String makeHealing(Player player) {
        player.setHp(healing);

        return "Uleczono gracza: \n"+player;
    }
}
