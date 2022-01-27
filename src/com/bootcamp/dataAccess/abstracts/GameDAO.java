package com.bootcamp.dataAccess.abstracts;

import com.bootcamp.entities.concretes.Game;
import com.bootcamp.entities.concretes.User;

public interface GameDAO {
    void save(Game game);
    void sale(Game game, User user);
}
