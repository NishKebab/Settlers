package com.nishino.settlers;

import java.util.ArrayList;

/**
 * Created by nish on 5/10/15.
 */
public class Game {
    ArrayList<Players> playerList;
    String gameName;

    public Game(ArrayList<Players> playerList, String gameName) {
        this.playerList = playerList;
        this.gameName = gameName;
        seedPlayers();
    }

    public ArrayList<Players> seedPlayers() {
        return this.playerList;
    }
}
