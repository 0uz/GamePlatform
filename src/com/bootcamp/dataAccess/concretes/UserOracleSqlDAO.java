package com.bootcamp.dataAccess.concretes;

import com.bootcamp.dataAccess.abstracts.UserDAO;
import com.bootcamp.entities.concretes.User;

public class UserOracleSqlDAO implements UserDAO {

    @Override
    public void save(User user) {
        System.out.println(user.getName()+" saved to Oracle");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getName()+" updated to Oracle");

    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName()+" deleted to Oracle");

    }
}
