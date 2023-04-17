package org.example.sem1.cw5.repository;

import org.example.sem1.cw5.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class UserRepo {

    private List<User> data = new ArrayList<>();

    public UserRepo(List<User> data) {
        this.data = new ArrayList<User>();
    }

    public UserRepo() {
    }

    public void addToData(User user){
        data.add(user);
    }
    public void delFromData(User user){
        data.remove(user);
    }
    public User getUserFromRepo(User user){
        for ( User el: data ){
            if(el.getUserID().equals(user.getUserID())){
                return el;
            }
        }
        return null;
    }

    public void saveUser(User user){
        try(FileWriter fileWriter = new FileWriter("client.txt",true)){
            fileWriter.write(user.toString());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
