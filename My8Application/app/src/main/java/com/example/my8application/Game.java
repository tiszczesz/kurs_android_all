package com.example.my8application;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;

    public Game() {
        players = new ArrayList<>();
        List<PlayerItem> items = new ArrayList<>();
        items.add(new Sword2Hands("Wspaniały miecz dwuręczny",10,300));
        items.add(new Sword1Hands("Miecz jednoręczny",5,100,2));
        items.add(new Mixture("mikstura lecząca mała",2,100));
        items.add(new Mixture("mikstura lecząca duża",2,200));
        items.add(new Sword2Hands("Miecz dwuręczny BB",12,45));
        players.add(new Player(items,2000,"Player1"));
        players.add(new Player(null,1000,"Player do bicia"));
    }
    public List<Player> getAll(){
        return players;
    }
}
