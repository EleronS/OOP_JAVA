package org.example.sem1.cw5.repository;

import org.example.sem1.cw5.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserRepo {

    private ArrayList<User> db;

    public UserRepo() {
        this.db = new ArrayList<>();
    }
    public void addToList(User user){
        db.add(user);
    }
    public void deleteFromRepo(User user){
        db.remove(user);
    }
    public User getUserFromRepo(User user){
        return db.get(user.getUserID());
    }

    public void saveUser(User user) {
        try (FileWriter fileWriter = new FileWriter("text.txt",true)) {
            fileWriter.write(user.toString());

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
