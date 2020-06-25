package com.example.my8application;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;

    public Game() {
        players = new ArrayList<>();
        List<PlayerItem> items1 = new ArrayList<>();
        items1.add(new Sword2Hands("Wspaniały miecz dwuręczny",10,300));
        items1.add(new Sword1Hands("Miecz jednoręczny",5,100,2));
        items1.add(new Mixture("mikstura lecząca mała",2,100));
        items1.add(new Mixture("mikstura lecząca duża",2,200));
        items1.add(new Sword2Hands("Miecz dwuręczny BB",12,45));
        List<PlayerItem> items2 = new ArrayList<>();
        items2.add(new Sword1Hands("Mały mieczyk jednoręczny",10,100,3));
        items2.add(new Sword2Hands("Mały mieczyk dwuręczny",5,300));
        items2.add(new Mixture("mikstura lecząca duża",2,300));

        players.add(new Player(items1,2000,"Player1"));
        players.add(new Player(items2,3000,"Player2"));
    }
    public List<Player> getAll(){
        return players;
    }
}
