package com.qa.accountmanager;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * UsersService
 */

@Service
public class UsersService {

    private RandomNumber rand;

    public UsersService(RandomNumber rand, UserRepo userRepo, PrizeDraw pz) {
        this.rand = rand;
        this.userRepo = userRepo;
        this.pz = pz;
    }

    private UserRepo userRepo;

    private PrizeDraw pz;

    public Users createUser(Users user) {
        
        user.setAccountNumber(this.rand.randNumGen());
        user.setWinnings(this.pz.getPrize(user));
        return this.userRepo.save(user);
    }

    public List<Users> readUsers() {
        return this.userRepo.findAll();

    }

    public Users updateUser(Users user, Long id) {
        
        Users toUpdate = this.userRepo.getOne(id);
        toUpdate.setFirstName(user.getFirstName());
        toUpdate.setLastName(user.getLastName());
    
        return toUpdate;
    }

    public void deleteUser(Long id) {
        this.userRepo.deleteById(id);

    }

   

    

}