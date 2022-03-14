package business.concretes;

import business.abstracts.GameService;
import entities.concretes.Game;

import java.util.List;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getGameName2() + " oyunu eklendi");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName() + " oyunu silindi");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName() + " oyunu güncellendi");
    }

    @Override
    public List<Game> getAll() {
        return getAll();
    }
}
