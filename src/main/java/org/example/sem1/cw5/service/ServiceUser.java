package org.example.sem1.cw5.service;

import org.example.sem1.cw5.model.User;
import org.example.sem1.cw5.repository.UserRepo;

public class ServiceUser {
    private UserRepo userRepo =new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }
    public void addToData(User user){
        userRepo.addToData(user);
    }
    public void delFromData(User user){
        userRepo.delFromData(user);
    }
    public User getUserData(User user){
        return userRepo.getUserFromRepo(user);
    }
}
