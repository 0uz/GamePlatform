package com.bootcamp.dataAccess.concretes;

import com.bootcamp.dataAccess.abstracts.GameDAO;
import com.bootcamp.entities.concretes.Game;
import com.bootcamp.entities.concretes.User;

public class GameMsSqlDAO implements GameDAO {
    @Override
    public void save(Game game) {
        System.out.println(game.getName()+" saved to MsSql");
    }

    @Override
    public void sale(Game game, User user) {
        System.out.println(game.getName()+" saled to "+ user.getName()+" saved to MsSql");

    }
}
