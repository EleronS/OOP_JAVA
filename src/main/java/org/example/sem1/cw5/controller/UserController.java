package org.example.sem1.cw5.controller;

import org.example.sem1.cw5.model.User;
import org.example.sem1.cw5.service.ServiceUser;

public class UserController {
    ServiceUser serviceUser = new ServiceUser();
    public void saveNewUser(Integer userID, String firstName, String secondName, Double balance){
        serviceUser.saveUser(new User(1, firstName, secondName, balance));
    }
    public void addToData(User user){
        serviceUser.addToData(user);
    }
    public void deleteFromData(User user){
        serviceUser.delFromData(user);
    }
    public User getUserData(User user){
        return serviceUser.getUserData(user);
    }
}
