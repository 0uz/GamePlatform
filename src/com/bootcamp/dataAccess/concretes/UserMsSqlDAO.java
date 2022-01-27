package com.bootcamp.dataAccess.concretes;

import com.bootcamp.dataAccess.abstracts.UserDAO;
import com.bootcamp.entities.concretes.User;

public class UserMsSqlDAO implements UserDAO {

    @Override
    public void save(User user) {
        System.out.println(user.getName()+" saved to MSSQL");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getName()+" updated to MSSQL");

    }

    @Override
    public void delete(User user) {
        System.out.println(user.getName()+" deleted to MSSQL");

    }
}
