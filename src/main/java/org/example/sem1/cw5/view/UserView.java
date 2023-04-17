package org.example.sem1.cw5.view;

import org.example.sem1.cw5.controller.UserController;
import org.example.sem1.cw5.model.User;

import java.util.Scanner;

public class UserView {
    public static void main(String[] args) {
        UserController userController = new UserController();
//        Scanner scanner = new Scanner(System.in);
//        userController.saveNewUser(scanner.nextInt(),scanner.nextLine(),scanner.nextInt());
        User user1 = new User(1,"name3",20);
        userController.addToList(user1);
        System.out.println(userController.getUserFromRepo(user1));
        userController.deleteUserFromRepo(user1);
        System.out.println(userController.getUserFromRepo(user1));
    }
}
