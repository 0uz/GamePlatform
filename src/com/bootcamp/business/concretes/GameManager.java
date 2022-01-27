package com.bootcamp.business.concretes;

import com.bootcamp.business.abstracts.GameService;
import com.bootcamp.dataAccess.abstracts.GameDAO;
import com.bootcamp.entities.concretes.Game;

public class GameManager implements GameService {
    private GameDAO gameDAO;

    public GameManager(GameDAO gameDAO) {
        this.gameDAO = gameDAO;
    }

    @Override
    public void save(Game game) {
        gameDAO.save(game);
    }
}
