package com.bootcamp.dataAccess.abstracts;

import com.bootcamp.entities.concretes.User;

public interface UserDAO {
    void save(User user);
    void update(User user);
    void delete(User user);
}
