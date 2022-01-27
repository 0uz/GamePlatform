package com.bootcamp.business.concretes;

import com.bootcamp.business.abstracts.PersonCheckService;
import com.bootcamp.business.abstracts.UserService;
import com.bootcamp.dataAccess.abstracts.GameDAO;
import com.bootcamp.dataAccess.abstracts.UserDAO;
import com.bootcamp.entities.concretes.Game;
import com.bootcamp.entities.concretes.User;

public class UserManager implements UserService {
    private UserDAO userDAO;
    private GameDAO gameDAO;
    private PersonCheckService personCheckService;

    public UserManager(UserDAO userDAO, GameDAO gameDAO, PersonCheckService personCheckService) {
        this.userDAO = userDAO;
        this.gameDAO = gameDAO;
        this.personCheckService = personCheckService;
    }

    @Override
    public void save(User user) {
        if (personCheckService.checkIfRealPerson(user)){
            userDAO.save(user);
        }else {
            throw new RuntimeException("It is not a real person!");
        }
    }

    @Override
    public void update(User user) {
        userDAO.update(user);

    }

    @Override
    public void delete(User user) {
        userDAO.delete(user);

    }

    @Override
    public void sale(User user, Game game) {
        gameDAO.sale(game,user);
    }
}
