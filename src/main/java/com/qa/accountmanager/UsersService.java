package com.qa.accountmanager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UsersService
 */

@Service
 public class UsersService {

    @Autowired
    private UserRepo userRepo;
    
    public Users createUser (Users user) {
    	return this.userRepo.save(user);
    }
    
    public List<Users> readUsers() {
    	return this.userRepo.findAll();
    	
    }
    
    public Users updateUser(Users user, Long id) {
    	Users toUpdate = this.userRepo.getOne(id);
    	toUpdate.setFirstName(user.getFirstName());
    	toUpdate.setLastName(user.getLastName());
    	toUpdate.setAccountNumber(user.getAccountNumber());
    	toUpdate.setWinnings(user.getWinnings());
    	return toUpdate;
    }
    
    public void deleteUser(Long id) {
    	this.userRepo.deleteById(id);
    	
    }

}