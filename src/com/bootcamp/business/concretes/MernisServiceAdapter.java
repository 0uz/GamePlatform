package com.bootcamp.business.concretes;

import com.bootcamp.business.abstracts.PersonCheckService;
import com.bootcamp.entities.concretes.User;

public class MernisServiceAdapter implements PersonCheckService {

    @Override
    public boolean checkIfRealPerson(User customer) {
        return true;
    }
}
