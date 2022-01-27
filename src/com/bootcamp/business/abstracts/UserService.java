package com.bootcamp.business.abstracts;

import com.bootcamp.entities.concretes.Game;
import com.bootcamp.entities.concretes.User;

public interface UserService {
    void save(User user);
    void update(User user);
    void delete(User user);
    void sale(User user, Game game);
}
