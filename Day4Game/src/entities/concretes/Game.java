package entities.concretes;

import entities.abstracts.Entity;

public class Game extends Entity {
  private String gameName2;
    public Game() {

    }
    public Game(int id, String gameName, String gameName2) {
        super(id, gameName);
        this.gameName2 = gameName2;
    }

    public String getGameName2() {
        return gameName2;
    }

    public void setGameName2(String gameName2) {
        this.gameName2 = gameName2;
    }
}
