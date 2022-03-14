package api;

import business.concretes.CampaignManager;
import business.concretes.GameManager;
import business.concretes.SaleManager;
import business.concretes.UserManager;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Sale;
import entities.concretes.User;

public class Main {
    public static void main(String[] args) {

        Game game = new Game(1,"Tetris" , "Tetris");
        GameManager gameManager = new GameManager();
        gameManager.add(game);

        Campaign campaign = new Campaign(1 ,"Tetris", "C353rf", 15);
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.add(campaign);

        Sale sale = new Sale(1, "Tetris", 20, 10);
        SaleManager saleManager = new SaleManager();
        saleManager.add(sale);

        User user = new User(1, "Tetris", "Leyla", "Beyaztas", 123, 1996);
        UserManager userManager = new UserManager();
        userManager.delete(user);
    }
}
