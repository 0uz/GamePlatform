package com.bootcamp.business.abstracts;


import com.bootcamp.entities.concretes.User;

public interface PersonCheckService {
    boolean checkIfRealPerson(User customer);
}
