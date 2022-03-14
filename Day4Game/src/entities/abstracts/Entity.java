package entities.abstracts;

public class Entity {
    private int id;
    private String gameName;

    public Entity() {

    }

    public Entity(int id,String gameName) {
        this.id = id;
        this.gameName = gameName;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
