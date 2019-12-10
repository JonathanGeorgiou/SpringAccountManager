package com.qa.accountmanager;

import java.util.List;

import org.springframework.stereotype.Service;

/**
 * UsersService
 */

@Service
public class UsersService {

    private RandomNumber rand;

    private UserRepo userRepo;

    private PrizeDraw pz;

    public UsersService(PrizeDraw prizeDraw, RandomNumber rand, UserRepo userRepo) {
        this.rand = rand;
        this.userRepo = userRepo;
    }

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
        toUpdate.setAccountNumber(user.getAccountNumber());
        toUpdate.setWinnings(user.getWinnings());
        return toUpdate;
    }

    public void deleteUser(Long id) {
        this.userRepo.deleteById(id);

    }

   

    

}