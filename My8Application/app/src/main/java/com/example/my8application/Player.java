package com.example.my8application;

import java.util.List;

public class Player {
    private List<PlayerItem> items;
    private int hp;
    private String name;
    private boolean isAlive;

    public Player(List<PlayerItem> items, int hp, String name) {
        this.items = items;
        this.hp = hp<0 ? -hp : hp;
        this.name = name;
        this.isAlive = true;
    }

    public List<PlayerItem> getItems() {
        return items;
    }

    public int getHp() {
        return hp;
    }

    public String getName() {
        return name;
    }
    public void setHp(int change){
        this.hp -= change;
        this.isAlive = this.hp>0;
    }
    @Override
    public String toString(){
        String isAlive = this.isAlive? "Żywy" : "Martwy!!!";
        return this.name+" ma hp: "+this.hp+" "+isAlive;
    }

}
