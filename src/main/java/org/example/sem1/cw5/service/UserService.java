package org.example.sem1.cw5.service;

import org.example.sem1.cw5.model.User;
import org.example.sem1.cw5.repository.UserRepo;

public class UserService {
    private UserRepo userRepo = new UserRepo();
    public void saveUser(User user){
        userRepo.saveUser(user);
    }
    public void addToList(User user){
        userRepo.addToList(user);
    }
    public void deleteFromRepo(User user){
        userRepo.deleteFromRepo(user);
    }
    public User getUserFromRepo(User user){
        return userRepo.getUserFromRepo(user);
    }
}
