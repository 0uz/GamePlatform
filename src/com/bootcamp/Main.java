package com.bootcamp;

import com.bootcamp.business.concretes.CampaignManager;
import com.bootcamp.business.concretes.GameManager;
import com.bootcamp.business.concretes.UserManager;
import com.bootcamp.dataAccess.concretes.CampaignMsSqlDAO;
import com.bootcamp.dataAccess.concretes.GameMsSqlDAO;
import com.bootcamp.dataAccess.concretes.UserOracleSqlDAO;
import com.bootcamp.entities.concretes.Campaign;
import com.bootcamp.entities.concretes.Game;
import com.bootcamp.entities.concretes.Genre;
import com.bootcamp.entities.concretes.User;
import com.bootcamp.business.concretes.MernisServiceAdapter;

import java.time.LocalDate;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        User oguzhan = new User(1,"Oguzhan","Duymaz","test@email.com","123");
        UserManager userManager = new UserManager(new UserOracleSqlDAO(),new GameMsSqlDAO() ,new MernisServiceAdapter());
        userManager.save(oguzhan);

        Game witcher =  new Game(1,"Witcher 3", Genre.ACTION,10, LocalDate.of(2015,1,1),30D);
        Campaign campaign =  new Campaign(1,"Witcher 3 Campaign",20D);
        CampaignManager campaignManager = new CampaignManager(new CampaignMsSqlDAO());
        campaignManager.save(campaign);
        witcher.setCampaign(campaign);
        
        GameManager gameManager =  new GameManager(new GameMsSqlDAO());
        gameManager.save(witcher);
        oguzhan.setGames(List.of(witcher));

        userManager.sale(oguzhan,witcher);


    }
}
