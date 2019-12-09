package com.qa.accountmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UsersService
 */

@Service
public class UsersService {

    @Autowired
    private UserRepo userRepo;

    public UserRepo getUserRepo() {
        return this.userRepo;
    }

    public void setUserRepo(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    

}