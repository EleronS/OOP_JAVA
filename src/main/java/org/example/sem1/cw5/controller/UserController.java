package org.example.sem1.cw5.controller;

import org.example.sem1.cw5.model.User;
import org.example.sem1.cw5.service.UserService;

public class UserController {
    private UserService userService = new UserService();
    public void saveNewUser(int userID, String name, int age){
        userService.saveUser(new User(userID, name, age));
    }
    public void addToList(User user){
        userService.addToList(user);
    }
    public void deleteUserFromRepo(User user){
        userService.deleteFromRepo(user);
    }
    public User getUserFromRepo(User user){
        return userService.getUserFromRepo(user);
    }
}
